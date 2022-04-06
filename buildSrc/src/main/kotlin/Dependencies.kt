object Dependencies {
  val coilCompose by lazy { "io.coil-kt:coil-compose:${Versions.coilCompose}" }
  val hilt by lazy { "com.google.dagger:hilt-android:${Versions.hilt}" }
  val hiltCompiler by lazy { "com.google.dagger:hilt-android-compiler:${Versions.hilt}" }
  val jUnit by lazy { "junit:junit:${Versions.jUnit}" }
  val kotlin by lazy { "org.jetbrains.kotlin:kotlin-stdlib-jdk7:${Versions.kotlin}" }
  val material by lazy { "com.google.android.material:material:${Versions.material}" }

  object AndroidX {
    val composeUI by lazy { "androidx.compose.ui:ui:${Versions.AndroidX.compose}" }
    val navigationCompose by lazy { "androidx.navigation:navigation-compose:${Versions.AndroidX.composeNavigation}" }
    val composeMaterial by lazy { "androidx.compose.material:material:${Versions.AndroidX.compose}" }
    val composeUITest by lazy { "androidx.compose.ui:ui-test-junit4:${Versions.AndroidX.compose}" }
    val composeUITooling by lazy { "androidx.compose.ui:ui-tooling:${Versions.AndroidX.compose}" }
    val composeUIToolingPreview by lazy { "androidx.compose.ui:ui-tooling-preview:${Versions.AndroidX.compose}" }
    val espresso by lazy { "androidx.test.espresso:espresso-core:${Versions.AndroidX.espresso}" }
    val extJUnit by lazy { "androidx.test.ext:junit:${Versions.AndroidX.extJUnit}" }
    val hiltNavigationCompose by lazy { "androidx.hilt:hilt-navigation-compose:${Versions.AndroidX.hiltNavigationCompose}" }
    val activityCompose by lazy { "androidx.activity:activity-compose:${Versions.AndroidX.activityCompose}" }
    val appCompat by lazy { "androidx.appcompat:appcompat:${Versions.AndroidX.appCompat}" }
    val composeAnimation by lazy { "androidx.compose.animation:animation:${Versions.AndroidX.compose}" }
    val coreKtx by lazy { "androidx.core:core-ktx:${Versions.AndroidX.coreKtx}" }
    val lifecycleRuntimeKtx by lazy { "androidx.lifecycle:lifecycle-runtime-ktx:${Versions.AndroidX.lifecycleRuntimeKtx}" }
  }

  object Plugins {
    val hilt by lazy { "com.google.dagger:hilt-android-gradle-plugin:${Versions.hilt}" }
    val kotlin by lazy { "org.jetbrains.kotlin:kotlin-gradle-plugin:${Versions.kotlin}" }
  }
}
