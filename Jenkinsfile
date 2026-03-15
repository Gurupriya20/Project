pipeline {
    agent any

    stages {

        stage('Clone Repository') {
            steps {
                git 'https://github.com/Gurupriya20/Project.git'
            }
        }

        stage('Build') {
            steps {
                sh 'mvn clean package'
            }
        }

        stage('Build Docker Image') {
            steps {
                sh 'docker build -t employeecrud .'
            }
        }

        stage('Run Container') {
            steps {
                sh 'docker run -d -p 8080:8080 employeecrud'
            }
        }
    }
}
