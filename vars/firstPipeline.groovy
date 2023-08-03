import com.knrsacadamy.builds.Calculator
def call (Map pipelineParams){
    library('com.knrsacadamy.slb')
    Calculator calculator = new Calculator(this)
    pipeline {
        agent any
        environment {
            APP_NAME = "${pipelineParams.appName}"
        }
        stages {
            stage('echo'){
                steps {
                    script {
                        echo "Printing sum of two numbers"
                        println calculator.add(4,2)
                        echo "Printing Multiple of two numbers"
                        println calculator.multiply(5,3)
                        echo "Microservice name is ${APP_NAME}"
                    }
                }
            }
        }
    }
}
