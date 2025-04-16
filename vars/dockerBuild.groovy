def call(String dockerImageName, String ImageTag){
  sh "docker build -t "${dockerImageName}":"${ImageTag}" ."
}
