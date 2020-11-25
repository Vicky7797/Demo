pipeline {

    agent {
  label 'Pipeline Script'
}
    stages {
  stage('checkout') {
    steps {
      // One or more steps need to be included within the steps block.
	git credentialsId: '2613d896-a2ed-4a2e-8530-2d1574b1a366', url: 'https://github.com/Vicky7797/Demo.git'
    }
  }
}
    stage('Unit & Integration Tests') {
            steps {
                script {
                    try {
                        sh './gradlew clean test --no-daemon'                     } finally {
                        junit '**/build/test-results/test/*.xml'                     }
                }
            }
        }
        
     
}

