def call(String versionfile, String dockerImageName) {
  def version = readJSON file: "${versionfile}"
  def ImageTag = version.version
  echo "${ImageTag}"

  def dockerImage = docker.build "${dockerImageName}:${ImageTag}"
  return dockerImage
}
