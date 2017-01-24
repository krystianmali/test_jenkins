pipelineJob('pipline_one') {
    definition {
        cpsScm {
            scm {
        		git {
                    remote {
                        github('git@github.com:krystianmali/test_jenkins.git','ssh')
                        credentials('Github')
                    }
        		}
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