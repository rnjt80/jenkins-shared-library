def call(String versionfile) {
  versionFile = readFile("${versionfile}")
  version = versionFile.toString().tokenize('version:')[1].split('"')[1]
  // Set the environment variable
  env.ImageTag = version
}
