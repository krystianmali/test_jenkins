pipelineJob('pipline_one') {
      configure { flow-definition ->
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