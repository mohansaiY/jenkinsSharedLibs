// vars/buildPlugin.groovy
def call(Map config) {
    node {
        //git url: "https://github.com/jenkinsci/${config.name}-plugin.git"
        sh 'echo "mvn install"'
        //mail to: '...', subject: "${config.name} plugin build", body: '...'
    }
}

/*

Jenkinsfile (Scripted Pipeline)
buildPlugin name: 'git'

*/