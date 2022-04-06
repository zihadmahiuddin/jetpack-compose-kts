// Top-level build file where you can add configuration options common to all sub-projects/modules.
buildscript {
  repositories {
    google()
    mavenCentral()
  }
  dependencies {
    classpath("com.android.tools.build:gradle:7.1.2")

    classpath(Dependencies.Plugins.hilt)
    classpath(Dependencies.Plugins.kotlin)

    // NOTE: Do not place your application dependencies here; they belong
    // in the individual module build.gradle files
  }
}

tasks.register<Delete>("clean") {
  delete(rootProject.buildDir)
}
