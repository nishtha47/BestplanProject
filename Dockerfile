FROM openjdk:11
COPY target/restful-spring-boot-0.0.1-SNAPSHOT.jar restful-spring-boot-0.0.1-SNAPSHOT.jar
ENTRYPOINT ["java", "-jar", "/restful-spring-boot-0.0.1-SNAPSHOT.jar"]