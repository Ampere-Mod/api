import org.jreleaser.model.Active

group = Ampere.GROUP
version = Ampere.VERSION

plugins {
  kotlin("jvm")
  `java-library`
  `maven-publish`
  net.neoforged.moddev
}

java {
  withJavadocJar()
  withSourcesJar()
}

//jreleaser {
//  configFile
//
//  dryrun = true
//  signing {
//    active = Active.ALWAYS
//    armored = true
//  }
//  deploy {
//    maven {
//      mavenCentral.create("sonatype") {
//        active = Active.ALWAYS
//        url = "https://central.sonatype.com/api/v1/publisher"
//        stagingRepository("target/staging-deploy")
//      }
//    }
//  }
//}

publishing {
  publications
    .create<MavenPublication>("lib")
    .from(components["java"])

  repositories.maven(uri(Ampere.packageURL())) {
    name = "GitHubPackages"
    credentials {
      username = System.getenv("GITHUB_ACTOR")
      password = System.getenv("GITHUB_TOKEN")
    }
  }
}
