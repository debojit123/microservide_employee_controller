FROM openjdk:11
ARG JAR_FILE=build/libs/ConfigServerClient-0.0.1-SNAPSHOT.jar
COPY ${JAR_FILE} ConfigServerClient-0.0.1-SNAPSHOT.jar
ENTRYPOINT ["java","-jar","ConfigServerClient-0.0.1-SNAPSHOT.jar"]