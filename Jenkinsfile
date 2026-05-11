pipeline {

    agent any

    tools {
        maven 'maven3'
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
    }
}