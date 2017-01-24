pipelineJob('pipline_one') {
    definition {
        cpsScm {
            scm {
                git('https://github.com/jenkinsci/job-dsl-plugin.git')
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