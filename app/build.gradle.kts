plugins {
  id("com.android.application")
  id("dagger.hilt.android.plugin")
  kotlin("android")
  kotlin("kapt")
  kotlin("plugin.serialization") version "1.6.10"
}

val coilVersion = "1.4.0"
val composeVersion = "1.1.0"
val hiltVersion = "2.40.2"

val javaVersion = Versions.java

android {
  compileSdk = ConfigData.compileSdkVersion

  defaultConfig {
    applicationId = ConfigData.packageName
    minSdk = ConfigData.minSdkVersion
    targetSdk = ConfigData.targetSdkVersion
    versionCode = ConfigData.versionCode
    versionName = ConfigData.versionName

    testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
    vectorDrawables {
      useSupportLibrary = true
    }
    javaCompileOptions {
      annotationProcessorOptions {
        arguments += mapOf("room.schemaLocation" to "$projectDir/schemas")
      }
    }
  }

  buildTypes {
    release {
      isMinifyEnabled = true
      isShrinkResources = true
      proguardFiles.addAll(
        listOf(
          getDefaultProguardFile("proguard-android-optimize.txt"),
          project.file("proguard-rules.pro")
        )
      )
    }
  }
  compileOptions {
    sourceCompatibility = javaVersion
    targetCompatibility = javaVersion
  }
  kotlinOptions {
    jvmTarget = javaVersion.toString()
  }
  buildFeatures {
    compose = true
  }
  composeOptions {
    kotlinCompilerExtensionVersion = composeVersion
  }
  packagingOptions {
    resources {
      excludes += "/META-INF/{AL2.0,LGPL2.1}"
    }
  }
}

dependencies {
  implementation(Dependencies.AndroidX.coreKtx)
  implementation(Dependencies.AndroidX.appCompat)
  implementation(Dependencies.AndroidX.composeUI)
  implementation(Dependencies.AndroidX.composeMaterial)
  implementation(Dependencies.AndroidX.composeUIToolingPreview)
  implementation(Dependencies.AndroidX.composeAnimation)
  implementation(Dependencies.AndroidX.lifecycleRuntimeKtx)
  implementation(Dependencies.AndroidX.activityCompose)
  implementation(Dependencies.AndroidX.navigationCompose)
  implementation(Dependencies.AndroidX.hiltNavigationCompose)
  implementation(Dependencies.coilCompose)
  implementation(Dependencies.hilt)
  kapt(Dependencies.hiltCompiler)
  implementation(Dependencies.material)

  androidTestImplementation(Dependencies.AndroidX.extJUnit)
  androidTestImplementation(Dependencies.AndroidX.espresso)
  androidTestImplementation(Dependencies.AndroidX.composeUITest)
  debugImplementation(Dependencies.AndroidX.composeUITooling)
  testImplementation(Dependencies.jUnit)
}

kapt {
  correctErrorTypes = true
}
