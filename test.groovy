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
        stage('stage 2'){
            steps{
                println("stage 2")
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
