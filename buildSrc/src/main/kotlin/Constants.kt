object Ampere {
  const val VERSION = "0.1.0-SNAPSHOT"
  const val GROUP = "com.gtlugo.ampere.api"

  private const val PACKAGE = "https://maven.pkg.github.com/ampere-mod/api"

  fun packageURL(): String = if (VERSION.endsWith("SNAPSHOT")) {
    "${PACKAGE}/snapshots"
  } else {
    PACKAGE
  }
}
