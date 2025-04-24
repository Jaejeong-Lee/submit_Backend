plugins {
    id("java")
}

group = "org.example"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

dependencies {
    testImplementation(platform("org.junit:junit-bom:5.10.0"))
    testImplementation("org.junit.jupiter:junit-jupiter")

    // https://mvnrepository.com/artifact/org.projectlombok/lombok
    // 롬복 정상동작하기 위해 필요한 2가지
    // (1) 클래스 제공 역할
    compileOnly("org.projectlombok:lombok:1.18.30")

    // (2) 어노테이션 해석 할 수 있게
    annotationProcessor("org.projectlombok:lombok:1.18.30")
}

tasks.test {
    useJUnitPlatform()
}