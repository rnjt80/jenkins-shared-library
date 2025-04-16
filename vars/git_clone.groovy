def call(String url, String branch) {
  withCredentials([(credentialsId: 'github')]) {
    echo "Cloning repo from $url"
    git url: "${url}", branch: "${main}"
  }
}
