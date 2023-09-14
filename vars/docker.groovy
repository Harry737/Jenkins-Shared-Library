def call(String user,String application,String version){
  sh "docker build -t ${user}/${application}:version ."
}
