def call(String github_creds, String url, String branch) {
    //withCredentials([usernamePassword(credentialsId: 'github')]) {
    git credentialsId: "${github_creds}", url: "${url}", branch: "${branch}"
    //}
}
