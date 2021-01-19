def call(def projectName){
    pipeline {
        agent any
        stages {
            stage("Clone Repo"){
                steps{
                    dir(projectName) {
                        git branch: 'master', url: 'https://github.com/AtlasBID/Combination.git'
                    }
                }
            }
        }
    }
}