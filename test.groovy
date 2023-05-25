pipeline {
    agent any
    
    stages {
        stage('Print Hello World') {
            steps {
                script {
                    println("Hello, World!")
                }
            }
        }

    }
        post {
        always {
            script {
                def stageResult = currentBuild.result
                if (stageResult == 'SUCCESS') {
                    echo "Stage result: Success"
                } else {
                    echo "Stage result: Failure"
                }
            }
        }
    }
    
    // Additional pipeline configuration
    // ...
}
