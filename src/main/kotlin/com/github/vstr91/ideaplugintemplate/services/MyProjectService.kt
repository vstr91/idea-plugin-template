package com.github.vstr91.ideaplugintemplate.services

import com.intellij.openapi.project.Project
import com.github.vstr91.ideaplugintemplate.MyBundle

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
