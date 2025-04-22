def call(String versionfile, String dockerImageName) {
  def version = readJSON file: "${versionfile}"
  env.ImageTag = version.version
  echo "${env.ImageTag}"
  def dockerImage = docker.build "${dockerImageName}:${env.ImageTag}"
  return dockerImage
}
