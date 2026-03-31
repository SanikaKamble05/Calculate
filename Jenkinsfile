pipeline {
    agent any

    stages {
        stage('Compile') {
            steps {
                sh 'javac calculate/*.java'
            }
        }

        stage('Run Tests') {
            steps {
                sh 'java -cp calculate CalculateTest'
            }
        }
    }
}
