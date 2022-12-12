 
listView('project-10 Jobs') {
    description('project-10 Jobs')
    jobs {
        regex('project-10_.+')
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
