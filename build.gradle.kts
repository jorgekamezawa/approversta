import org.jetbrains.kotlin.gradle.tasks.KotlinCompile

plugins {
    id("org.springframework.boot") version "2.7.4"
    id("io.spring.dependency-management") version "1.0.14.RELEASE"
    kotlin("jvm") version "1.6.21"
    kotlin("plugin.spring") version "1.6.21"
    kotlin("plugin.jpa") version "1.6.21"
}

group = "com.btg.pactual.banking"
version = "0.0.1-SNAPSHOT"
java.sourceCompatibility = JavaVersion.VERSION_1_8

repositories {
    mavenCentral()
//    maven { url = uri("http://btgnexus/repository/clientportal-releases/"); isAllowInsecureProtocol = true }
//    maven { url = uri("http://btgnexus/repository/clientportal-snapshots/"); isAllowInsecureProtocol = true }
}

dependencies {
    implementation("com.opencsv:opencsv:5.7.0")

    implementation("org.springframework.boot:spring-boot-starter-data-jpa:2.7.3")
    implementation("org.springframework.boot:spring-boot-starter-web:2.7.3")
    implementation("com.fasterxml.jackson.module:jackson-module-kotlin:2.13.4")
    implementation("org.jetbrains.kotlin:kotlin-reflect")
    implementation("org.jetbrains.kotlin:kotlin-stdlib-jdk8")
    runtimeOnly("org.postgresql:postgresql:42.5.0")
    testImplementation("org.springframework.boot:spring-boot-starter-test:2.7.3")


//    implementation("org.springframework.boot:spring-boot-starter-web:2.7.3") {
//        exclude(group = "org.springframework.boot", module = "spring-boot-starter-tomcat")
//    }
//
//    implementation("com.btg.pactual.banking:BankingLibs:2022.01.17.103-SNAPSHOT") {
//        exclude(group = "org.springframework.boot", module = "spring-boot-starter-tomcat")
//    }
//    implementation("com.btg.pactual.banking:BankingAuthLibs:2022.08.16.92-SNAPSHOT") {
//        exclude(group = "org.springframework.boot", module = "spring-boot-starter-tomcat")
//    }
//    implementation("com.btg.pactual.banking:BankingFraudControlLibs:2022.07.06.91-SNAPSHOT") {
//        exclude(group = "com.btg.pactual.banking", module = "BankingLibs")
//        exclude(group = "com.btg.pactual.banking", module = "BankingAuthLibs")
//        exclude(group = "org.springframework.boot", module = "spring-boot-starter-tomcat")
//    }
//
//    api ("com.btg.pactual.banking:BankingAclLibs:2019.11.13.8-SNAPSHOT")
}

tasks.withType<KotlinCompile> {
    kotlinOptions {
        freeCompilerArgs = listOf("-Xjsr305=strict")
        jvmTarget = "1.8"
    }
}

tasks.withType<Test> {
    useJUnitPlatform()
}
