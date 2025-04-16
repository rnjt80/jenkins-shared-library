def call(String url, String branch) {
  withCredentials([string(credentialsId: 'Github')]) {
    echo "Cloning repo from $url"
    git url: "${url}", branch: "${main}"
  }
}
