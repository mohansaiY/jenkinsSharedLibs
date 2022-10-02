// vars/windows.groovy
def call(Closure body) {
    node('linux') {
        body()
    }
}


/*
call from jenksinfile be like below
windows {
    bat "cmd /?"
}

*/