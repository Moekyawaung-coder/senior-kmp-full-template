plugins {
    alias(libs.plugins.kotlinMultiplatform) apply false
    alias(libs.plugins.composeMultiplatform) apply false
    alias(libs.plugins.androidApplication) apply false
}

allprojects {
    group = "com.moekyawaung.seniorkmp"
    version = "1.0.0"
}
