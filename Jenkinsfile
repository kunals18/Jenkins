@Library('kunals18/Jenkins') _

pipeline {
    agent any
    stages {
        stage('deploy kunal'){
            steps {
                createDir {
                    projectName = "kunal"
                }
            }
        }
        stage('deploy app1'){
            steps {
                createDir {
                    projectName = "app1"
                }
            }
        }
    }
}