// vars/sayHello.groovy
def call(String name = 'human') {
    // Any valid steps can be called from this code, just like in other
    // Scripted Pipeline
    echo "Hello, ${name}."
}

/*
invokde fun from jenkinsfile like below
sayHello 'Joe'
sayHello() //nvoke with default arguments 
*/