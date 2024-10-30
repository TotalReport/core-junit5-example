plugins {
    `java-library`
}

repositories {
    mavenCentral()
    mavenLocal()
}

dependencies {
    testCompileOnly("org.projectlombok:lombok:1.18.34")
    testAnnotationProcessor("org.projectlombok:lombok:1.18.34")
    testImplementation("org.slf4j:slf4j-api:2.0.16")
    testImplementation("org.junit.jupiter:junit-jupiter-api:5.11.2")
    testRuntimeOnly("org.junit.jupiter:junit-jupiter-engine:5.11.2")
    testImplementation("ch.qos.logback:logback-classic:1.5.9")
    testImplementation("com.craftens.totalreport:total-report-junit5:1.0.0-SNAPSHOT")
}


// Apply a specific Java toolchain to ease working on different environments.
java {
    toolchain {
        languageVersion = JavaLanguageVersion.of(21)
    }
}

tasks.named<Test>("test") {
    // Use JUnit Platform for unit tests.
    useJUnitPlatform()
    passPropertyToTest(this, "com.craftens.totalreport.url")
    passPropertyToTest(this, "com.craftens.totalreport.report.id")
    passPropertyToTest(this, "com.craftens.totalreport.report.title")
    passPropertyToTest(this, "com.craftens.totalreport.launch.id")
    passPropertyToTest(this, "com.craftens.totalreport.launch.title")
}

fun passPropertyToTest(test: Test, property: String) {
    val prop = System.getProperty(property)
    if (prop != null) {
        test.systemProperty(property, prop)
    }
}
