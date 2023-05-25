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

    }
}

