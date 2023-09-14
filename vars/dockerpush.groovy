def call(Map params){
  withCredentials([usernameColonPassword(credentialsId: params.credential, variable: 'test')]) {
    sh """\
        echo \$test_PSW | docker login -u \$test_USR --password-stdin myregistry.example.com
        """
    sh "docker push ${params.user}/${params.application}:${params.version}"
  }
}
