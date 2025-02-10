pipeline {
    agent any

    stages {
        stage('My name') {
            steps {
                
                echo "WELCOME $name $lastname"
                echo "new commit"            }
        }
    }
}
