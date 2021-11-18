job('first groovy script job in Jenkins') {
    description ("first groovy script")
    scm {
        github('jenkinsci/job-dsl-plugin', 'master')
    }
    triggers {
        scm ('* * * * *')
    }
    steps {
        maven('clean build')
    }
    publishers {
        archiveArtifacts('**/*.war')
    }
}
