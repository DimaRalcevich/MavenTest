pipeline {
    agent any
    stages {
        stage ('Build') {
            steps {
                sh 'mvn clean test'
            }
        }
        stage ('Step 2 - Build') {
            steps {
                echo "Build step..."
            }
        }
        stage ('Step 3 - Deploy') {
            steps {
                echo "Deploy step..."
            }
        }
    }
}
