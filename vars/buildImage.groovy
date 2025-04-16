def call(String versionfile, String dockerImageName) {
  def version = readJSON file: "${versionfile}"
  env.ImageTag = version.version
  dockerImage = docker.build "${dockerImageName}":"${env.ImageTag}"

}
