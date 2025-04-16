def call(String url, String branch) {
    withCredentials([usernamePassword(credentialsId: 'github')]) {
        echo "Cloning repo from ${url}"
        echo "URL value: ${url}"
        echo "Branch value: ${branch}"
        git url: "${url}", branch: "${branch}"
    }
}
