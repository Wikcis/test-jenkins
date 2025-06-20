pipeline {
    agent any

    tools {
        maven 'Maven 3.9.10'
        jdk 'JDK 17'
    }

    stages {

        stage('Build and Test') {
            steps {
                bat 'mvn clean test'
            }
        }

        stage('Publish JUnit Results') {
            steps {
                junit '**/target/surefire-reports/*.xml'
            }
        }
    }
}
