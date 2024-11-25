FROM openjdk:17

WORKDIR /app

COPY ./target/spring-boot-crud-restapi-microservices-0.0.1-SNAPSHOT.jar /app

EXPOSE 5050

CMD ["java", "-jar", "spring-boot-crud-restapi-microservices-0.0.1-SNAPSHOT.jar"]