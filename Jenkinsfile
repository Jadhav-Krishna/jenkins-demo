pipeline {
    agent any

    stages {
//         stage('Clone') {
//             steps {
//                 echo 'Cloning code...'
//                 git 'https://github.com/Jadhav-Krishna/jenkins-demo.git'
//             }
//         }

        stage('Build') {
            steps {
                echo 'Building using Maven...'
                bat 'mvn clean package'
            }
        }

        stage('Run') {
            steps {
                echo 'Running app...'
                bat 'bat 'java -jar target/jenkins-demo-0.0.1-SNAPSHOT.jar''
            }
        }
    }
}