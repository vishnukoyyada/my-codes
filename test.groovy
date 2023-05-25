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
    
    // Additional pipeline configuration
    // ...
}
