node{
  stage('SCM Checkout'){
    git 'https://github.com/miat96/testRepoJ.git'
  }
  stage('Compile-Package'){
    def mvnHome = tool name: 'LocalMaven', type: 'maven'
    sh "${mvnHome}/bin/mvn package"
  }
}
