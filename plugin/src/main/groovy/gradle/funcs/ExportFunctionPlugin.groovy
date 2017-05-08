package gradle.funcs

import org.gradle.api.Project
import org.gradle.api.Plugin

class ExportFunctionPlugin implements Plugin<Project> {
    void apply(Project target) {
        target.ext.hello = this.&hello
    }
    def hello() {
        println 'hello'
    }
}
