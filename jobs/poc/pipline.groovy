pipelineJob('pipline_one') {
      configure { project ->
      flow-definition / publishers / 'jenkins.plugins.logstash.LogstashNotifier' {
          maxLines(1000)
          failBuild(false)
      }
    }

    definition {
        cps {
            script("node{ sh 'ps' }" )
            sandbox()
        }
    }

}