def call(String CredId, String ProjectName, String ImageTag){
  echo 'Pushing the image to dockerhub...'
  withCredentials([usernamePassword(
      'credentialsId':"${CredId}",
      passwordVariable:"dockerHubPass",
      usernameVariable:"dockerHubUser")]){
      sh "docker login -u ${env.dockerHubUser} -p ${env.dockerHubPass}"
      sh "docker push ${env.dockerHubUser}/${ProjectName}:${ImageTag}"
  }
  echo "pushed to dockerHub Successfully!!"
}
