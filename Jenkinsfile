Skip to content
Search or jump to…

Pull requests
Issues
Marketplace
Explore
 
@Vicky7797 
Learn Git and GitHub without any code!
Using the Hello World guide, you’ll start a branch, write comments, and open a pull request.


TechPrimers
/
jenkins-example
9
381.3k
Code
Issues
Pull requests
26
Actions
Projects
Wiki
Security
Insights
jenkins-example/Jenkinsfile

TechPrimers add jenkins file
Latest commit 03df67a on Jun 17, 2017
 History
 0 contributors
32 lines (26 sloc)  608 Bytes
  
pipeline {
    agent any

    stages {
        stage ('Compile Stage') {

            steps {
                withMaven(maven : 'maven_3_5_0') {
                    sh 'mvn clean compile'
                }
            }
        }

        stage ('Testing Stage') {

            steps {
                withMaven(maven : 'maven_3_5_0') {
                    sh 'mvn test'
                }
            }
        }


        stage ('Deployment Stage') {
            steps {
                withMaven(maven : 'maven_3_5_0') {
                    sh 'mvn deploy'
                }
            }
        }
    }
}
