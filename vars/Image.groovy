def call(String versionfile, String dockerImageName) {
  def version = readJSON file: "${versionfile}"
  env.ImageTag = version.version
  def dockerImage = docker.build "${dockerImageName}:${env.ImageTag}"
  echo "${dockerImage}"
  return dockerImage
}
