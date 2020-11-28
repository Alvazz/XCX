package com.github.alvazz.xcx.services

import com.intellij.openapi.project.Project
import com.github.alvazz.xcx.MyBundle

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
