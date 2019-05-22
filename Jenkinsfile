node{
  stage('SCM Checkout'){
    git 'https://github.com/miat96/testRepoJ.git'
  }
  stage('Compile-Package'){
    sh 'mvn package'
  }
}
