pipeline {
    agent any

    stages {

        stage('Clone Code') {
            steps {
                echo 'Cloning done automatically by Jenkins'
            }
        }

        stage('Build') {
            steps {
                bat 'javac -cp ".;junit-4.13.2.jar;hamcrest-core-1.3.jar" Calculate.java CalculateTest.java'
            }
        }

        stage('Test') {
            steps {
                bat 'java -cp ".;junit-4.13.2.jar;hamcrest-core-1.3.jar" org.junit.runner.JUnitCore CalculateTest'
            }
        }

        stage('Run') {
            steps {
                echo 'Execution completed'
            }
        }
    }

    post {
        always {
            echo 'Build Finished'
        }
    }
}