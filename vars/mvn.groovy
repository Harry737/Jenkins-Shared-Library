def call()
{
  sh 'mvn clean package && mvn test'
}
