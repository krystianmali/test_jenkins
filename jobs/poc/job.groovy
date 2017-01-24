job("job_one") {
 scm {
  git {
   remote {
   url 'https://github.com/lexandro/restapi-demo.git' 
  }
  branch 'master'
  }
 }
   steps {
  maven('compile')
 }
     configure { project ->
        project / publishers / 'jenkins.plugins.logstash.LogstashNotifier plugin="logstash@1.2.0"' {
            maxLines(0)
            failBuild(true)
        }
    }
}

