def call(String versionfile, String dockerImageName) {
  def version = readJSON file: "${versionfile}"
  def ImageTag = version.version
  echo "${ImageTag}"
  env.ImageTag = "${ImageTag}"
  echo "${env.ImageTag}"
  def dockerImage = docker.build "${dockerImageName}:${env.ImageTag}"
  return dockerImage
}
