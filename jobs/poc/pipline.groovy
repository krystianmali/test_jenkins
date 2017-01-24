pipelineJob('pipline_one') {
      

    definition {
        cps {
            script("node{ sh 'ps' }" )
            sandbox()
        }
    }

    configure { project ->
      flow-project / publishers / 'jenkins.plugins.logstash.LogstashNotifier' {
          maxLines(1000)
          failBuild(false)
      }
    }

}