def call(String credential){
  withSonarQubeEnv(credentialsId: credential) {
    sh 'mvn clean package sonar:sonar'
  }  
}
