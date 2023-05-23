pipeline {
    agent any

    job('ExampleJob') {
    stages {
        stage('Mandatory and Non-Mandatory Stage') {
            steps {
                script {
                    try {
                        stage('Mandatory Stage') {
                            // Steps of the mandatory stage
                            // ...
                  
                            println("mandtory stage has failed");
                            if (stage('Mandatory Stage').result != 'SUCCESS') {
                                throw new Exception("Mandatory stage failed.")
                            }
                        }
                        
                        stage('Non-Mandatory Stage') {
                            // Steps of the non-mandatory stage
                            // ...
                            if (satge('Non-Mandatory Stage').result != 'SUCCESS') {
                            println("Non-mandatory stage failed.");
                                // You can perform additional actions if needed
                            }
                        }
                    } catch (Exception e) {
                        // Handle the exception as needed
                        if (stage('Mandatory Stage').result != 'SUCCESS') {
                            // Print a specific message when the mandatory stage fails
                            echo "Mandatory stage failed: ${e.message}"
                        } else {
                            // Print the failure message for non-mandatory stage
                            echo "Non-mandatory stage failed: ${e.message}"
                        }
                    }
                }
            }
        }
        
        // Other stages...
    }
    
    // Other job configuration...
}

}


