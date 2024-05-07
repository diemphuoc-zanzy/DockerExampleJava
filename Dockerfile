# Get Maven build on first stage
FROM maven:3.9.6-amazoncorretto-8 as BUILD
WORKDIR /build
COPY . .
RUN mvn -f /build/pom.xml -B -Dskiptests clean package

FROM amazoncorretto:8-alpine3.19-jre as RUNNER
WORKDIR /app
COPY --from=BUILD /build/target/docker-example.jar /app/docker-example.jar
EXPOSE 8080
ENTRYPOINT ["java", "-jar", "docker-example.jar"]

