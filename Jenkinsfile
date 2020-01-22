node {

// Select SCM

        stage("Pulling code from github") {
           git 'https://github.com/CybertekSchool/summer-online2019-web-orders.git'
        }

 // build
        stage("Running tests") {
            if (isUnix()) {
                sh label: '', script: 'mvn clean test'
            } else {
                bat label: '', script: 'mvn clean test'
            }
        }

// generate report
        stage("Generate cucumber report"){
            cucumber fileIncludePattern: '**/*.json', sortingMethod: 'ALPHABETICAL'
        }

//send email
        stage("Send email"){
            emailext body:
            '''${JELLY_SCRIPT, template="html"}
            $PROJECT_NAME - Build # $BUILD_NUMBER - $BUILD_STATUS
            <br>
            <strong>Check Cucumber HTML report: $PROJECT_URL/$BUILD_NUMBER/cucumber-html-reports/overview-features.html</strong>''',
            subject: 'Smoke test status: $BUILD_STATUS',
            to: 'someemail@cybertekschool.com'
        }
}