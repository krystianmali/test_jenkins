pipelineJob('pipline_one') {
    definition {
        cps {
            script("node{ sh 'dir' }" )
            sandbox()
        }
    }
    // configure { project ->
    //     project / publishers / 'jenkins.plugins.logstash.LogstashNotifier plugin="logstash@1.2.0"' {
    //         maxLines(0)
    //         failBuild(true)
    //     }
    // }
}