pipeline {
    agent {
        docker {
            image 'maven:latest'
            args '-v $HOME/.m2:/root/.m2'
        }
    }
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
                archiveArtifacts artifacts: 'target/Task.jar', followSymlinks: false
            }
        }
    }
}
