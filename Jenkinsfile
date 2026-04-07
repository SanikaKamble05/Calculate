pipeline {
    agent any

    stages {

        stage('Checkout') {
            steps {
                echo 'Code fetched from GitHub'
            }
        }

        stage('Build') {
            steps {
                bat 'javac Calculate.java CalculateTest.java'
            }
        }

        stage('Test') {
            steps {
                bat 'java org.junit.runner.JUnitCore CalculateTest'
            }
        }

        stage('Run') {
            steps {
                bat 'java Calculate'
            }
        }
    }

    post {
        success {
            echo 'Build SUCCESS - All tests passed!'
        }
        failure {
            echo 'Build FAILED - Check logs!'
        }
    }
}