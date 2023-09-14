def call(String credential){
  waitForQualityGate abortPipeline: true, credentialsId: credential
}
