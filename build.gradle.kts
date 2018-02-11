import org.gradle.api.plugins.*
import org.gradle.script.lang.kotlin.*

group = "weld-decorator-groovy-not-working"
version = "1.0-SNAPSHOT"

val logbackVersion = "1.2.2"
val slf4jVersion = "1.7.25"

plugins {
    groovy
    application
}

application {
    mainClassName = "org.jboss.weld.environment.se.StartMain"
}

repositories {
    jcenter()
}

dependencies {
    compile("org.codehaus.groovy:groovy-all:2.4.13")
    compile("org.jboss.weld.se:weld-se-core:3.0.3.Final")
    compile("ch.qos.logback:logback-classic:$logbackVersion")
    compile("org.slf4j:osgi-over-slf4j:$slf4jVersion")
    compile("org.slf4j:jul-to-slf4j:$slf4jVersion")
    compile("org.slf4j:log4j-over-slf4j:$slf4jVersion")
    compile("org.slf4j:jcl-over-slf4j:$slf4jVersion")
}

tasks.getByName("processResources") {
    doLast {
        copy {
            from("${project.buildDir}/resources/main/META-INF/beans.xml")
            into("${project.buildDir}/classes/groovy/main/META-INF/")
        }
    }
}

task<Wrapper>("wrapper") {
    gradleVersion = "4.5"
}
