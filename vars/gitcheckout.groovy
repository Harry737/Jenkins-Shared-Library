def call(Map params)
{
  checkout scmGit(branches: [[name: params.branch]], userRemoteConfigs: [[credentialsId: params.token, url: params.url]])
}
