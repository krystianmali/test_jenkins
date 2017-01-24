pipelineJob('pipline_one') {
    definition {
        cpsScm {
            scm {
                git('https://github.com/jenkinsci/job-dsl-plugin.git')
            }
        }
    }
}