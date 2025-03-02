plugins {
    kotlin("jvm") version "1.9.0"
    application
}

java {
    toolchain.languageVersion.set(JavaLanguageVersion.of(17))  // Change to 21 if needed
}

repositories {
    mavenCentral()  // This allows Gradle to download dependencies
}

dependencies {
    implementation(kotlin("stdlib"))
}

application {
    mainClass.set("MainKt")  // Change if your main class is in a package
}
