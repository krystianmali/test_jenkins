listView('pipline') {
    description('All  pipline jobs')
    filterBuildQueue()
    filterExecutors()
    jobs {
        name('pipline')
        regex(/pipline.+/)
    }
    columns {
        status()
        weather()
        name()
        lastSuccess()
        lastFailure()
        lastDuration()
        buildButton()
    }
}

listView('job') {
    description('All standard jobs')
    filterBuildQueue()
    filterExecutors()
    jobs {
        name('job')
        regex(/job.+/)
    }
    columns {
        status()
        weather()
        name()
        lastSuccess()
        lastFailure()
        lastDuration()
        buildButton()
    }
}
