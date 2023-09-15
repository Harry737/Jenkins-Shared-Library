def call(Map params){
  withCredentials([usernamePassword(credentialsId: params.credential, usernameVariable: 'USERNAME', passwordVariable: 'PASSWORD')]) {
  // available as an env variable, but will be masked if you try to print it out any which way
  // note: single quotes prevent Groovy interpolation; expansion is by Bourne Shell, which is what you want
    sh "docker login -u ${USERNAME} -p ${PASSWORD}"
  }
  sh "docker push ${params.user}/${params.application}:${params.version}"
}
