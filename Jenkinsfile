pipeline {
    agent any
    stages {
        stage ('Build') {
            steps {
                bat "mvn clean test"
            }
            post {
                success {
                    echo "Build first-jenkins-job"
                    build 'first-jenkins-job'
                }
            }
        }
    }
}
