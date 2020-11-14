#Script1
FROM maven:3.6.3-jdk-11 as MAVEN_BUILD

USER root

WORKDIR /build/

COPY src /build/src/

COPY pom.xml /build/

RUN mvn clean compile install

#script3
FROM openjdk:11-jre-slim

USER root

COPY --from=MAVEN_BUILD /build/target/Astronomy_VN-0.0.1-SNAPSHOT.jar .

EXPOSE 8080

ENTRYPOINT ["java", "-jar"]

CMD ["Astronomy_VN-0.0.1-SNAPSHOT.jar"]