def call(String ProjectName, String Imagetag, String DockerHubUser){
   echo 'Building Docker Image...'
   sh "docker build -t ${DockerHubUser}/${ProjectName}:${Imagetag} ."
   echo "Docker Build Created Successfully!"
}
