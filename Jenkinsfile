pipeline {

    agent any

    tools {
        maven 'maven3'
    }

    stages {

        stage('Git Checkout') {

            steps {
                git 'https://github.com/ompatil7181/Snake-Game.git'
            }
        }

        stage('Maven Build') {

            steps {
                dir('snakegame') {
                    sh 'mvn clean package'
                }
            }
        }

        stage('Docker Build') {

            steps {
                sh 'docker build -t snake-game .'
            }
        }

        stage('Docker Images') {

            steps {
                sh 'docker images'
            }
        }
    }
}