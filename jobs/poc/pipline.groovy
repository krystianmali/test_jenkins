pipelineJob('pipline_one') {
      configure { project ->
      project / publishers / 'jenkins.plugins.logstash.LogstashNotifier' {
          maxLines(1000)
          failBuild(false)
      }
    }

    definition {
        cps {
            script("node{ sh 'dir' }" )
            sandbox()
        }
    }

}