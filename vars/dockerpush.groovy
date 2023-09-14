def call(Map params){
  withCredentials([usernameColonPassword(credentialsId: params.credential, variable: 'credential')]) {
    sh "docker login -u \$credential_USR -p \$credential_PSW"
    sh "docker push ${params.user}/${params.application}:${params.version}"
  }
}
