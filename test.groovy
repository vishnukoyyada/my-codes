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
                  // Retrieve stage results
                def stageResults = currentBuild.rawBuild.getActions(hudson.model.ResultAction)
                
                stageResults.each { stageResult ->
                    def stageName = stageResult.getDescriptor().getDisplayName()
                    def stageResultValue = stageResult.getResult().toString()

                    if (stageResultValue == 'SUCCESS') {
                        echo "Stage ${stageName} result: Success"
                    } else {
                        echo "Stage ${stageName} result: Failure"
                    }
                }
                }
            }
        }
    }
    
    // Additional pipeline configuration
    // ...
}
