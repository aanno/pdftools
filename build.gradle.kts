
val gradleWrapperVersion: String by project
val artifactoryBaseUrl: String by project

plugins {
    id("idea")
    id("eclipse")
    id("java")
    id("application")
}

group = "com.github.aanno.pdf"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

idea {
    module {
        setDownloadJavadoc(true)
        setDownloadSources(true)
    }
}

eclipse {
    classpath {
        setDownloadJavadoc(true)
        setDownloadSources(true)
    }
}

dependencies {
    implementation("com.itextpdf:itext7-core:7.2.3")

    implementation("org.apache.pdfbox:pdfbox:2.0.27")
    implementation("org.apache.pdfbox:xmpbox:2.0.27")
    implementation("org.apache.pdfbox:pdfbox-examples:2.0.27")

    implementation("org.sejda:sejda-distribution:5.0.0.M3")

    implementation("com.github.librepdf:openpdf:1.3.30")
    implementation("com.github.librepdf:pdf-toolbox:1.3.30")

    implementation("org.bouncycastle:bcprov-jdk18on:1.72")
    implementation("org.bouncycastle:bcprov-ext-jdk18on:1.72")
    implementation("org.apache.xmlgraphics:fop:2.7")

    implementation("info.picocli:picocli:4.6.3")

    // implementation("org.apache.pdfbox:pdfbox:3.0.0-alpha3")

    testImplementation("org.junit.jupiter:junit-jupiter-api:5.8.1")
    testRuntimeOnly("org.junit.jupiter:junit-jupiter-engine:5.8.1")
}

tasks {

    wrapper {
        distributionType = Wrapper.DistributionType.ALL
        distributionUrl = "$artifactoryBaseUrl/ext-gradlew/gradle-$gradleWrapperVersion-all.zip"
    }

    withType<JavaCompile> {
        //https://docs.gradle.org/current/userguide/building_java_projects.html
        options.release.set(17)
    }

    getByName<Test>("test") {
        useJUnitPlatform()
    }

}
