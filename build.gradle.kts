plugins {
    //trick: for the same plugin versions in all sub-modules
//    alias(libs.plugins.androidApplication).apply(false)
//    alias(libs.plugins.androidLibrary).apply(false)
//    alias(libs.plugins.kotlinAndroid).apply(false)
//    alias(libs.plugins.kotlinMultiplatform).apply(false)

    id("com.android.application").version("7.4.0").apply(false)
    id("com.android.library").version("7.4.0").apply(false)
    kotlin("android").version("1.8.0").apply(false)
    kotlin("multiplatform").version("1.8.0").apply(false)
}

tasks.register("clean", Delete::class) {
    delete(rootProject.buildDir)
}