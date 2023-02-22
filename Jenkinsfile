pipeline {
    agent any
    triggers{
        pollSCM('*/5 * * * *')
    }
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
        stage ('Parallel actions'){
            parallel{
                stage ('Act 1'){
                    steps {
                        echo ('Act 1...')
                    }
                }
                stage ('Act 2'){
                    steps {
                        echo ('Act 2...')
                    }
                }
                stage ('Act 3'){
                    steps {
                        echo ('Act 3...')
                    }
                }
            }
        }
    }
}
