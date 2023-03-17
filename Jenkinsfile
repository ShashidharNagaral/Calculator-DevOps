pipeline {
    environment {
        DOCKERHUB_CREDENTIAL = credentials('dockerhub_username_key')
    }

    agent any
    stages {
        stage('Git Pull'){
            steps {
                git url: "https://github.com/ShashidharNagaral/Calculator-DevOps",
                branch: 'master'
            }
        }
        stage('Maven Build') {
            steps {
                sh 'mvn clean install'
            }
        }
        stage('Build Docker Image') {
            steps {
                sh 'docker build -t shashnagaral/calculator-mini-project:latest .'
            }
        }
        stage('Docker Hub Login') {
            steps {
                sh 'echo $DOCKERHUB_CREDENTIAL_PSW | docker login -u $DOCKERHUB_CREDENTIAL_USR --password-stdin'
            }
        }
        stage('Publish Docker Image on Docker Hub') {
            steps {
                sh 'docker push shashnagaral/calculator-mini-project:latest'
            }
        }
        stage('Remove Docker Image') {
            steps {
                sh 'docker rmi -f shashnagaral/calculator-mini-project:latest'
            }
        }
        stage('Ansible deploy') {
            steps {
                sh 'export LANG=en_US.UTF-8;ansible-playbook -i inventory playbook.yml'
            }
        }
    }
}