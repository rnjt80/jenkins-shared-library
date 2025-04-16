def call(String versionfile) {
  def versionFile = readFile("${versionfile}")
  def version = versionFile.toString().tokenize('version:')[1].split('"')[1]
  // Set the environment variable
  env.ImageTag = version
}
