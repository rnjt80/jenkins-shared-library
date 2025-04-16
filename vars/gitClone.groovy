def call(String url, String branch) {
    //withCredentials([usernamePassword(credentialsId: 'github')]) {
    git credentialsId: 'github' url: "${url}", branch: "${branch}"
    //}
}
