job("job_one") {
  configure { project ->
      project / publishers / 'jenkins.plugins.logstash.LogstashNotifier' {
          maxLines(1000)
          failBuild(false)
      }
  }

  steps {
    shell('ps')
 }

}

