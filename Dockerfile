FROM amazoncorretto:21-alpine-jdk
ARG JAR_FILE=build/libs/*.jar
ARG PROFILES
ARG ENV
ARG DB_HOST
ARG DB_NAME
ARG DB_USERNAME
ARG DB_PASSWORD
COPY ${JAR_FILE} app.jar
ENTRYPOINT ["java", "-Dspring.profiles.active=${PROFILES}", "-Dserver.env=${ENV}", "-DDB_HOST=${DB_HOST}", "-DDB_NAME=${DB_NAME}", "-DDB_USERNAME=${DB_USERNAME}", "-DDB_PASSWORD=${DB_PASSWORD}", "-jar", "app.jar"]
