FROM openjdk:11
COPY ./target/Calculator-DevOps-1.0-SNAPSHOT.jar ./
WORKDIR ./
CMD ["java", "-jar", "Calculator-DevOps-1.0-SNAPSHOT-jar-with-dependencies.jar"]