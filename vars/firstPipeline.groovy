import com.knrsacadamy.builds.Calculator
def call (Map pipelineParams){
    library('com.knrsacadamy.slb')
    Calculator calculator = new Calculator(this)
    environment {
         = ${pipelineParams.appName}
    }
    pipeline {
        agent any
        stages {
            stage('echo'){
                steps {APP_NAME
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
