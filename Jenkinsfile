// pipeline {
//     agent any
//
//     stages {
// //         stage('Clone') {
// //             steps {
// //                 echo 'Cloning code...'
// //                 git 'https://github.com/Jadhav-Krishna/jenkins-demo.git'
// //             }
// //         }
//
//         stage('Build') {
//             steps {
//                 echo 'Building using Maven...'
//                 bat 'mvn clean package'
//             }
//         }
//
// //         stage('Run') {
// //             steps {
// //                 echo 'Running app...'
// //                 bat 'java -jar target/jenkins-demo-0.0.1-SNAPSHOT.jar'
// //             }
// //         }
//
//                 stage('Docker Build') {
//                     steps {
//                         echo 'Building Docker image...'
//                         bat 'docker build -t jenkins-demo .'
//                     }
//                 }
//
//                 stage('Docker Run') {
//                     steps {
//                         echo 'Running Docker container...'
//                         bat 'docker run -d -p 8081:8080 jenkins-demo'
//                     }
//                 }
//     }
// }

pipeline {
    agent any

    stages {

        stage('Build') {
            steps {
                echo 'Building using Maven...'
                bat 'mvn clean package'
            }
        }

        stage('Docker Build') {
            steps {
                echo 'Building Docker image...'
                bat 'docker build -t jenkins-demo .'
            }
        }

        stage('Stop Old Container') {
            steps {
                echo 'Stopping old container...'
                bat 'docker stop jenkins-container || echo no container'
                bat 'docker rm jenkins-container || echo no container'
            }
        }

        stage('Run New Container') {
            steps {
                echo 'Running new container...'
                bat 'docker run -d -p 8081:8080 --name jenkins-container jenkins-demo'
            }
        }
    }
}