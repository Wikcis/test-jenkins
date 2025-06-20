pipeline {
    agent any

    tools {
        maven 'Maven 3.9.10'
        jdk 'JDK 17'
    }

    stages {
        stage('Checkout') {
            steps {
                git 'https://github.com/Wikcis/test-jenkins'
            }
        }

        stage('Build and Test') {
            steps {
                sh 'mvn clean test'
            }
        }

        stage('Publish JUnit Results') {
            steps {
                junit '**/target/surefire-reports/*.xml'
            }
        }
    }
}
