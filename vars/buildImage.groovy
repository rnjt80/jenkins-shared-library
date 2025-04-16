def call(String versionfile, String dockerImageName) {
  def version = readJSON file: "${versionfile}"
  def ImageTag = version.version
  echo "${ImageTag}"
  env.ImageTag = version.version
  echo "${env.ImageTag}"
  dockerImage = docker.build "${dockerImageName}":"${env.ImageTag}"

}
