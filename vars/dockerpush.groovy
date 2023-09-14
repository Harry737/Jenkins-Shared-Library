def call(String user, String application, String version, String cred){
  withCredentials([usernameColonPassword(credentialsId: cred, variable: 'credential')]) {
    sh 'docker login -u $credential_USR -p $credential_PSW'
    sh 'docker push ${user}/${application}:${version}
  }
}
