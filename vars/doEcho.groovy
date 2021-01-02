def call() {
    node {
        sh 'echo "Im from shared babe $BUILD_NUMBER the DEMO is $DEMO"'
    }
}

def goodBye(String name) {
    println "GoodBye ${name}"
}