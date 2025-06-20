pipeline {
    agent any

    tools {
        maven 'Maven 3.8'   // lub inna wersja skonfigurowana w Jenkins > Tools
        jdk 'JDK 17'         // skonfigurowany w Jenkins > Tools
    }

    stages {
        stage('Checkout') {
            steps {
                git 'https://github.com/twoje-repo/test-project.git'
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
