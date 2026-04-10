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
                bat 'java -cp target/jenkins-demo-1.0.jar Main'
            }
        }
    }
}