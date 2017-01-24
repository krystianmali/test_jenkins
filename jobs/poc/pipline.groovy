pipelineJob('pipline_one') {
    definition {
        cpsScm {
            scm {
                
                git('git@github.com:krystianmali/test_jenkins.git')
                credentials('9fb70847-e508-466f-99c6-df3dadcfce93') 
            }
        }
    }
    configure { project ->
        project / publishers / 'jenkins.plugins.logstash.LogstashNotifier plugin="logstash@1.2.0"' {
            maxLines(0)
            failBuild(true)
        }
    }
}