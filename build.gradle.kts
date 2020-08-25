import com.google.common.base.Predicate

plugins {
  id("org.jetbrains.kotlin.jvm").version("1.4.0")
}

apply<MyPlugin>()

repositories {
  mavenCentral()
}

configure<MyExtension> {
  isEven = Predicate { it?.rem(2)  == 0 }
}