repositories {
  gradlePluginPortal()
}

plugins {
  `kotlin-dsl`
}

dependencies {
  implementation("net.neoforged.moddev:net.neoforged.moddev.gradle.plugin:2.0.80")
  implementation("org.jetbrains.kotlin.jvm:org.jetbrains.kotlin.jvm.gradle.plugin:2.1.20")
  implementation("org.jreleaser:org.jreleaser.gradle.plugin:1.17.0")
}
