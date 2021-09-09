package com.github.eibrahim95.iocbindinghints.services

import com.intellij.openapi.project.Project
import com.github.eibrahim95.iocbindinghints.MyBundle

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
