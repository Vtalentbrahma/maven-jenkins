pipeline {
    agent any
    tools{
        maven 'maven3'
    }

    stages {
        stage('clone') {
            steps {
               checkout scmGit(branches: [[name: '*/master']], extensions: [], userRemoteConfigs: [[credentialsId: 'jenkins-ssh-key', url: 'git@github.com:Vtalentbrahma/maven-jenkins.git']]) 
            
            }
        }
        stage('maven build'){
         steps{
            sh 'mvn clean package'
         }
         }
        }
    
}
