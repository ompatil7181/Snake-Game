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

bat 'docker login -u omkarpatil19 -p YOUR_DOCKER_TOKEN'
        bat 'docker tag snake-game omkarpatil19/snake-game:latest'
        bat 'docker push omkarpatil19/snake-game:latest'
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