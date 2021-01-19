def call(body){
    def config = [:]
    body.resolveStrategy = Closure.DELEGATE_FIRST
    body.delegate = config
    body()

    pipeline {
        agent any
        stages {
            stage("Clone Repo"){
                steps{
                    dir('${config.projectName}') {
                        git branch: 'master', url: 'https://github.com/AtlasBID/Combination.git'
                    }
                }
            }
        }
    }
}