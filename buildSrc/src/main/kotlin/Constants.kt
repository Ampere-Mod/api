object Ampere {
  const val ID = "ampere_api"
  const val VERSION = "0.1.0-SNAPSHOT"
  const val GROUP = "com.gtlugo.ampere.api"
  const val REPO = "https://github.com/Ampere-Mod/api"

  private const val PACKAGE = "https://maven.pkg.github.com/ampere-mod/api"

  fun packageURL(): String = if (VERSION.endsWith("SNAPSHOT")) {
    "${PACKAGE}/snapshots"
  } else {
    PACKAGE
  }
}

object Parchment {
  const val MINECRAFT_VERSION = "1.21.1"
  const val MAPPINGS_VERSION = "2024.11.17"
}

object Minecraft {
  const val VERSION = "1.21.1"
  const val VERSION_RANGE = "[1.21.1]"
}

object NeoForge {
  const val VERSION = "21.1.133"
  const val VERSION_RANGE = "[21.1.133,)"
  const val LOADER_VERSION = "[1,)"
}
