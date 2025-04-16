def call(String url, String branch) {
  withCredentials([string(credentialsId: 'github')]) {
    echo "Cloning repo from $url"
    git url: "${url}", branch: "${main}"
  }
}
