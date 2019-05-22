node{
  stage('SCM Checkout'){
    dev mvnHome tool name: 'maven-3', type: 'maven'
    git 'https://github.com/miat96/testRepoJ'
  }
  stage('Compile-Package'){
    sh 'mvn package'
  }
}
