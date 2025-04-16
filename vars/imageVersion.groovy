def call(String versionfile) {
  File = readFile("${versionfile}")
  version = File.toString().tokenize('version:')[1].split('"')[1]
  // Set the environment variable
  env.IMAGE_VERSION = version
}
