pipeline {

    agent any

    tools {
        maven 'maven3'
    }

    environment {
        IMAGE_NAME = 'omkarpatil19/snake-game:latest'
    }

    stages {

        stage('Maven Build') {

            steps {

                dir('snakegame') {

                    bat 'mvn clean package'
                }
            }
        }

        stage('Docker Build') {

            steps {

                bat 'docker build -t snake-game .'
            }
        }

        stage('Docker Images') {

            steps {

                bat 'docker images'
            }
        }

        stage('Docker Push') {

            steps {

                withCredentials([usernamePassword(
                    credentialsId: 'dockerhub-creds',
                    usernameVariable: 'DOCKER_USER',
                    passwordVariable: 'DOCKER_PASS'
                )]) {

                    bat 'docker login -u %DOCKER_USER% -p %DOCKER_PASS%'
                    bat 'docker tag snake-game %IMAGE_NAME%'
                    bat 'docker push %IMAGE_NAME%'
                }
            }
        }
    }

    post {

        success {

            echo 'Pipeline executed successfully!'
        }

        failure {

            echo 'Pipeline failed!'
        }
    }
}