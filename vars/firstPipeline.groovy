import com.knrsacadamy.builds.Calculator
pipeline {
    agent any
    stages {
        stage('echo'){
            steps {
                scripts{
                    echo "Printing sum of two numbers"
                    println Calculator.add(3,4)
                }

            }
        }
    }
}