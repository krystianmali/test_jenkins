categorizedJobsView('pipline') {
    jobs {
        regex(/pipline.*/)
    }
    categorizationCriteria {
        regexGroupingRule(/^pipline([^_]+).*$/)
    }
    columns {
        status()
        categorizedJob()
        buildButton()
    }
}
categorizedJobsView('job') {
    jobs {
        regex(/job.*/)
    }
    categorizationCriteria {
        regexGroupingRule(/^job([^_]+).*$/)
    }
    columns {
        status()
        categorizedJob()
        buildButton()
    }
}