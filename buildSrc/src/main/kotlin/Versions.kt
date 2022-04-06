import org.gradle.api.JavaVersion

object Versions {
  const val coilCompose = "1.4.0"
  const val hilt = "2.40.2"
  const val jUnit = "4.13.2"
  const val kotlin = "1.6.10"
  const val material = "1.5.0"

  val java = JavaVersion.VERSION_11

  object AndroidX {
    const val activityCompose = "1.4.0"
    const val appCompat = "1.4.0"
    const val compose = "1.0.5"
    const val composeNavigation = "2.4.0-beta02"
    const val coreKtx = "1.7.0"
    const val espresso = "3.4.0"
    const val extJUnit = "1.1.3"
    const val hiltNavigationCompose = "1.0.0"
    const val lifecycleRuntimeKtx = "2.4.1"
  }
}
