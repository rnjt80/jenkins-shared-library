def call(String versionfile, String dockerImageName) {
  def version = readJSON file: "${versionfile}"
  def ImageTag = version.version
  env.ImageTag = version.version
  def dockerImage = docker.build "${dockerImageName}:${env.ImageTag}"
}
