pipeline {
    agent any

    tools {
        maven 'Maven'
    }

    options {
        skipDefaultCheckout(true)
    }

    stages {
        stage('Test email notification') {
            steps {
                sh 'exit 1'
            }
        }

        stage('git checkout') {
            steps {
                git branch: 'main',
                    url: 'https://github.com/solo-randriamavo/demoic.git'
            }
        }

        stage('Build the application') {
            steps {
                sh 'mvn clean install'
            }
        }

        stage('Unit Test Execution') {
            steps {
                sh 'mvn test'
            }
        }

        stage('Build the docker image') {
            steps {
                sh 'docker build --tag demoic:1.0.0 .'
            }
        }

        stage('Push the docker image') {
            steps {
                withCredentials([string(
                    credentialsId: 'dockerhubpass',
                    variable: 'dockerHubPass'
                )]) {
                    sh '''
                        set +x
                        printf '%s' "$dockerHubPass" |
                          docker login --username solorandria646576 --password-stdin
                        docker tag demoic:1.0.0 solorandria646576/demoic:1.0.0
                        docker push solorandria646576/demoic:1.0.0
                        docker logout
                    '''
                }
            }
        }
    }

    post {
        failure {
            emailext(
                subject: "Échec du build #${env.BUILD_NUMBER} - ${env.JOB_NAME}",
                body: "Le build a échoué. Consulte les détails : ${env.BUILD_URL}",
                recipientProviders: [requestor()],
                to: 'rndfitahiana@gmail.com'
            )
        }
    }
}
