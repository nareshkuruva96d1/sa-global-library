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
                    scripts{
                        echo "Printing sum of two numbers"
                        println calculator.add(3,4)
                        echo "Microservice name is ${APP_NAME}"
                    }

                }
            }
        }
    }
}
