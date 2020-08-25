import com.google.common.base.Predicate

open class MyExtension {
  var isEven: Predicate<Int>? = null
}

class MyPlugin : org.gradle.api.Plugin<org.gradle.api.Project> {
  override fun apply(project: org.gradle.api.Project) {
    val extension = project.extensions.create("myplugin", MyExtension::class.java)

    project.tasks.register("printEven") {
      it.doLast {
        println("2 is even: ${extension.isEven?.apply(2)}")
      }
    }
  }
}