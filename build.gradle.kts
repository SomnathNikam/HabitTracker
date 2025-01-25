// Top-level build file where you can add configuration options common to all sub-projects/modules.
plugins {
    id("com.android.application") version "8.1.1" apply false
    id("org.jetbrains.kotlin.android") version "1.9.0" apply false
    id("androidx.navigation.safeargs.kotlin") version "2.8.5" apply false
    id("com.google.dagger.hilt.android") version "2.48" apply false

}
buildscript {
    repositories {
       google()
        mavenCentral() // Use mavenCentral() as jcenter() is deprecated
    }
    dependencies {
        classpath("com.android.tools.build:gradle:8.1.0") // Update to the latest stable version
        classpath("org.jetbrains.kotlin:kotlin-gradle-plugin:1.9.10") // Specify the Kotlin version directly
        classpath("androidx.navigation:navigation-safe-args-gradle-plugin:2.8.5") // Update to the latest stable version
    }
}

allprojects {
    repositories {
        google()
       mavenCentral() // Use mavenCentral() as jcenter() is deprecated
    }
}

tasks.register("clean", Delete::class) {
    delete(rootProject.buildDir)
}

