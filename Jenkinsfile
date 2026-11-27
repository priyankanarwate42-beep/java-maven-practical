pipeline {
    agent any
    
    stages {
        stage('Checkout') {
            steps {
                echo 'Source code checkout completed'
            }
        }

        stage('Verify Environment') {
            steps {
                sh 'java --version'
                sh 'git --version'
                sh 'mvn --version'
            }
        }

        stage('Build') {
            steps {
                sh 'mvn clean compile'
            }
        }

        stage('Test') {
            steps {
                sh 'mvn test'
            }
        }

        stage('Package') {
            steps {
                sh 'mvn package -DskipTests'
            }
        }
    }
   
    post {
        success {
            echo 'CI Pipeline completed successfully!'
        }
         
        failure {
            echo 'CI Pipeline failed. Check logs.'
        }

        always {
            echo 'Pipeline execution finished.'
        }
    }
}
