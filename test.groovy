pipeline {
    agent any
    
    stages {
        try {
            stage('stage 1')
        stage('stage 1') {
            steps {
                script {
                    
                    println("stage 1")
                }
            }
        }
        }catch(Exception e) {
            currentBuild.result = 'ERROR'
            error('Build marked as ERROR due to mandatory stage failure.')
        }
        finally{
            stage('stage 2'){
            steps{
                script{
                println("stage 2")
                }
            }
            catchError(buildResult: 'SUCCESS', stageResult: 'SUCCESS') {
                error('Non-mandatory stage failed. Continuing the build.')
                }
        }

        }


    }
}

