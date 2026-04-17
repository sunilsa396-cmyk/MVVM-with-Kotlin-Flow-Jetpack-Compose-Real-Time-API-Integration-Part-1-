plugins {
    alias(libs.plugins.android.application) apply false

    // ✅ ADD THIS (VERY IMPORTANT)
    id("org.jetbrains.kotlin.plugin.compose") version "2.0.0" apply false
}