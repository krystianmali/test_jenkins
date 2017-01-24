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