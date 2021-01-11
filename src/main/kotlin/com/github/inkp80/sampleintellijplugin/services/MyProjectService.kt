package com.github.inkp80.sampleintellijplugin.services

import com.intellij.openapi.project.Project
import com.github.inkp80.sampleintellijplugin.MyBundle

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
