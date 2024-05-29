plugins {
    alias(libs.plugins.android.application)
    alias(libs.plugins.google.dagger.hilt)
    alias(libs.plugins.jetbrains.kotlin.android)
    alias(libs.plugins.kotlin.kapt)
    alias(libs.plugins.arouter.jailbird.plugin)
}

android {
    namespace = "com.blundell.myapplication"
    compileSdk = 34

    defaultConfig {
        applicationId = "com.blundell.myapplication"
        minSdk = 29
        targetSdk = 34
        versionCode = 1
        versionName = "1.0"
    }

    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_17
        targetCompatibility = JavaVersion.VERSION_17
    }
    kotlinOptions {
        jvmTarget = "17"
    }
    buildFeatures {
        buildConfig = true
    }
    packaging {
        resources {
            excludes += "/META-INF/{AL2.0,LGPL2.1}"
        }
    }

    kapt {
        arguments {
            arg("AROUTER_MODULE_NAME", project.getName())
        }
    }
}

kotlin {
    jvmToolchain(17)
}

dependencies {
    implementation(libs.androidx.activity)

    implementation(libs.hilt.android)
    implementation(libs.hilt.navigationCompose)
    kapt(libs.hilt.compiler)
    implementation(libs.arouter.api)
    kapt(libs.arouter.compiler)
}
