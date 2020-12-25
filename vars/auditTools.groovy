def call() {
    node {
        sh 'echo "Im from shared babe $BUILD_NUMBER the DEMO is $DEMO"'
    }
}