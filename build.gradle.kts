plugins {
    id("com.android.application") version "8.4.0" apply false
    id("com.github.ben-manes.versions") version "0.51.0"
    id("com.google.devtools.ksp") version "1.9.23-1.0.20" apply false
    id("org.jetbrains.kotlin.android") version "1.9.23" apply false
}

buildscript {
    dependencies {
        classpath("com.google.firebase:firebase-crashlytics-gradle:2.9.9")
        classpath("com.google.android.gms:oss-licenses-plugin:0.10.6")
        classpath("com.google.gms:google-services:4.4.1")
    }
}
