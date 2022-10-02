//vars/log.groovy
def info(message) {
    echo "INFO: ${message}"
}

def warning(message) {
    echo "WARNING: ${message}"
}
def checkOutFrom(message){
    echo "inside the checkout function in log.groovy calling the package script by creting the class object"
    m = new org.foo.zot()
    m.checkOutFrom("hello")

}
