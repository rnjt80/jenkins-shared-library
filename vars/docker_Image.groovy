def call(String versionfile, String dockerImageName) {
  def version = readJSON file: "${versionfile}"
  ImageTag = version.version
  def dockerImage = docker.build "${dockerImageName}:${ImageTag}"
  return dockerImage
}
