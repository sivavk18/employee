FROM maven:3.8.3-openjdk-11-slim AS builder
COPY pom.xml /app/
COPY src /app/src
RUN --mount=type=cache,target=/root/.m2 mvn -f /app/pom.xml clean package -DskipTests

#Run
FROM openjdk:11-jre-slim
WORKDIR /opt
ENV PORT 8081
COPY target/*.jar /opt/app.jar
EXPOSE 8081
ENTRYPOINT exec java $JAVA_OPTS -jar app.jar