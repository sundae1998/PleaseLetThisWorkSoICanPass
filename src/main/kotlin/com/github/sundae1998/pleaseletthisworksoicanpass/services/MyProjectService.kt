package com.github.sundae1998.pleaseletthisworksoicanpass.services

import com.intellij.openapi.project.Project
import com.github.sundae1998.pleaseletthisworksoicanpass.MyBundle

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
