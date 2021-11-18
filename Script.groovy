job('first groovy script job in Jenkins') {
    description ("first groovy script")
    scm {
        github("https://github.com/adishark21/hello-world.git", 'master')
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
