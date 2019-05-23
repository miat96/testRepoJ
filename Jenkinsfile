node{
  stage('SCM Checkout'){
    git 'https://github.com/miat96/testRepoJ.git'
  }
  stage('Compile-Package'){
    def mvnHome = tool name: 'Maven', type: 'maven'
    bat "${mvnHome}/bin/mvn package"
  }
}
