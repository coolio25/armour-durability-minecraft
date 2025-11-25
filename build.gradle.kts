plugins {
    id("fabric-loom") version "1.2.+"
    id("java")
}

val minecraftVersion = "1.20.2" // change if you want a different target
val yarnMappings = "1.20.2+build.14" // adjust mappings if needed
val loaderVersion = "0.14.22"
val fabricApiVersion = "0.80.0+1.20.2"

group = "com.coolio25"
version = "0.1.0"

java {
    toolchain {
        languageVersion.set(JavaLanguageVersion.of(17))
    }
}

repositories {
    mavenCentral()
    maven { url = uri("https://maven.fabricmc.net/") }
}

dependencies {
    minecraft("com.mojang:minecraft:$minecraftVersion")
    mappings("net.fabricmc:yarn:$yarnMappings:v2")
    modImplementation("net.fabricmc:fabric-loader:$loaderVersion")
    modImplementation("net.fabricmc.fabric-api:fabric-api:$fabricApiVersion")
}

tasks.withType<JavaCompile> {
    options.encoding = "UTF-8"
    options.release.set(17)
}
