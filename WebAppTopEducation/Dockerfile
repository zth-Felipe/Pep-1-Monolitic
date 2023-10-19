FROM openjdk:19
ARG JAR_FILE=target/WebAppTopEducation-0.0.1-SNAPSHOT.jar
COPY ${JAR_FILE} WebAppTopEducation-0.0.1-SNAPSHOT.jar
EXPOSE 8090
ENTRYPOINT ["java","-jar","/WebAppTopEducation-0.0.1-SNAPSHOT.jar"]