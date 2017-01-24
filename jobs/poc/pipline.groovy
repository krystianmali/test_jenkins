pipelineJob('pipline_one') {
      
    configure { project ->
      flow-project / publishers / 'jenkins.plugins.logstash.LogstashNotifier' {
          maxLines(1000)
          failBuild(false)
      }
    }
    definition {
        cps {
            script("node{ sh 'ps' }" )
           
        }
    }



}