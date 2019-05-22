node{
  stage('SCM Checkout'){
    git 'https://github.com/miat96/testRepoJ'
  }
  stage('Compile-Package'){
    sh 'mvn package'
  }
}
