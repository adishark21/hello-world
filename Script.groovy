job('first groovy script job in Jenkins') {
    description ("first groovy script")
    scm {
        github("adishark21/hello-world", 'master')
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
