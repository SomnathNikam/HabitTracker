//import org.jetbrains.kotlin.gradle.internal.kapt.incremental.UnknownSnapshot.classpath

plugins {
    id("com.android.application")
    id("org.jetbrains.kotlin.android")
    id("kotlin-kapt")
    id("androidx.navigation.safeargs.kotlin")
    id("com.google.dagger.hilt.android")
}

android {
    namespace = "com.example.habittracker"
    compileSdk = 34

    defaultConfig {
        applicationId = "com.example.habittracker"
        minSdk = 24
        targetSdk = 33
        versionCode = 1
        versionName = "1.0"

        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
    }

    buildTypes {
        release {
            isMinifyEnabled = false
            proguardFiles(
                getDefaultProguardFile("proguard-android-optimize.txt"),
                "proguard-rules.pro"
            )
        }
    }
//    buildscript {
//        repositories {
//            google() // Ensure Google Maven is included
//            mavenCentral()
//        }
//
//    }
    buildFeatures {
        dataBinding = true
    }

    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_1_8
        targetCompatibility = JavaVersion.VERSION_1_8
    }
    kotlinOptions {
        jvmTarget = "1.8"
    }
}

dependencies {

    implementation("androidx.core:core-ktx:1.9.0")
    implementation("androidx.appcompat:appcompat:1.7.0")
    implementation("com.google.android.material:material:1.12.0")
    implementation("androidx.constraintlayout:constraintlayout:2.2.0")
    implementation("androidx.swiperefreshlayout:swiperefreshlayout:1.1.0")
    testImplementation("junit:junit:4.13.2")
    androidTestImplementation("androidx.test.ext:junit:1.2.1")
    androidTestImplementation("androidx.test.espresso:espresso-core:3.6.1")

//    classpath("androidx.navigation:navigation-safe-args-gradle-plugin:2.7.1") // Use the latest version
    // Kotlin Coroutines
    implementation("org.jetbrains.kotlinx:kotlinx-coroutines-core:1.10.1") // Latest stable version as of Dec 19, 2024
    implementation("org.jetbrains.kotlinx:kotlinx-coroutines-android:1.10.1") // Ensure consistency with coroutines-core

    // Navigation Components
    val nav_version = "2.8.4" // Latest stable version as of Nov 13, 2024
    implementation("androidx.navigation:navigation-fragment-ktx:$nav_version")
    implementation("androidx.navigation:navigation-ui-ktx:$nav_version")

    // Lifecycle components
    implementation("androidx.lifecycle:lifecycle-livedata-ktx:2.8.6") // Latest stable version as of Oct 30, 2024
    implementation("androidx.lifecycle:lifecycle-common-java8:2.8.6") // Ensure consistency with livedata-ktx
    implementation("androidx.lifecycle:lifecycle-viewmodel-ktx:2.8.6") // Ensure consistency with livedata-ktx

    // Retrofit2
    implementation("com.squareup.retrofit2:retrofit:2.9.0") // Latest stable version as of May 20, 2020
    implementation("com.squareup.retrofit2:converter-gson:2.9.0") // Ensure consistency with retrofit

    // Room components
    implementation("androidx.room:room-runtime:2.7.0-alpha06") // Latest available version as of Oct 18, 2023
    kapt("androidx.room:room-compiler:2.7.0-alpha06") // Ensure consistency with room-runtime
    implementation("androidx.room:room-ktx:2.7.0-alpha12") // Ensure consistency with room-runtime
    androidTestImplementation("androidx.room:room-testing:2.7.0-alpha06") // Ensure consistency with room-runtime

    // Date picker
    implementation("com.wdullaer:materialdatetimepicker:4.2.3") // Latest stable version as of Mar 10, 2021

    // ViewPager2
    implementation("androidx.viewpager2:viewpager2:1.0.0") // Latest stable version as of Nov 7, 2019

    // Circle Indicator (ViewPager2)
    implementation("me.relex:circleindicator:2.1.4") // Latest stable version as of Apr 14, 2020

// Dagger dependncy
    implementation("com.google.dagger:hilt-android:2.48")
    kapt("com.google.dagger:hilt-compiler:2.48")
}

