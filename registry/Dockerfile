FROM openjdk:8-jdk-alpine
ARG JAR_FILE=build/libs/*.jar
COPY ${JAR_FILE} app.jar
ENV JAVA_OPTS="-Xms256m -Xmx256m -Xmn256m"
ENTRYPOINT ["java","-Dthin.root=/root/.m2", "-Djava.security.egd=file:/dev/./urandom","-jar", "-Duser.timezone=GMT+08", "/app.jar"]