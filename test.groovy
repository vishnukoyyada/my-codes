pipeline {
    agent any
    
    stages {
        stage('stage 1') {
            steps {
                script {
                    println("stage 1")
                }
            }
        }
        stage('stage 2'){
            steps{
                script{
                println("stage 2")
                }
            }
        }
        stage('stage 3'){
            steps{
                script{
                prln("stage 3")
                }
            }
        }

    }
        post {
        always {
            script {
                 for (stage in pipelineStages) {
                    def stageName = stage.name
                    def stageResult = stage.result ?: 'UNKNOWN'

                    if (stageResult == 'SUCCESS') {
                        echo "Stage ${stageName} result: Success"
                    } else {
                        echo "Stage ${stageName} result: Failure"
                    }
                }
            }
        }
    }
    
    // Additional pipeline configuration
    // ...
}
