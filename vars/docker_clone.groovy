def call(String url, String branch) {
  echo "Cloning repo from $url"
  git credentialsId: github, url: "${url}", branch: "${main}"
}
