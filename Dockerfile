FROM openjdk:17
VOLUME /tmp
ARG JAR_FILE=target/common-service-1.0-SNAPSHOT.jar
ADD ${JAR_FILE} app.jar
ENTRYPOINT ["java","-jar","/app.jar"]