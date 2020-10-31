FROM amazoncorretto/amazoncorretto:11-alpine-jdk

COPY ./build/libs/gradle-docker.jar /tmp/app.jar
ENTRYPOINT ["java", "-jar", "/tmp/app.jar"]