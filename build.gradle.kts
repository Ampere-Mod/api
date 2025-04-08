plugins {
  `java-library`
  `maven-publish`
  net.neoforged.moddev
}

group = "${Ampere.GROUP}.api"
version = Ampere.VERSION

dependencies {

}

publishing {
  publications {
    register<MavenPublication>("mavenJava") {
      from(components["java"])
    }
  }

  repositories {
    maven {
      name = "GitHubPackages"
      url = uri(Ampere.PACKAGE)
      credentials {
        username = System.getenv("GITHUB_ACTOR")
        password = System.getenv("GITHUB_TOKEN")
      }
    }
  }
}
