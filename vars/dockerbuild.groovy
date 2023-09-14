def call(Map params)
{
  sh "docker build -t ${params.user}/${params.application}:${params.version} ."
}
