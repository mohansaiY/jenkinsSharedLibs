//vars/log.groovy
def info(message) {
    echo "INFO: ${message}"
}

def warning(message) {
    echo "WARNING: ${message}"
}

m = new org.foo.zot()
m.checkOutFrom("hello")