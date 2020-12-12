package com.github.briancsparks.jbplugin.services

import com.intellij.openapi.project.Project
import com.github.briancsparks.jbplugin.MyBundle

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
