pipeline {
    agent any

    stages {
        stage('Build') {
            steps {
                script {
                    sh 'mvn package'
                }
            }
        }
        stage('Test') {
            steps {
                script {
                    sh 'java -jar target/Task.jar'
                }
            }
        }
        stage('Archive') {
            steps {
                archiveArtifacts artifacts: 'target/Task.jar'
            }
        }
    }
}
