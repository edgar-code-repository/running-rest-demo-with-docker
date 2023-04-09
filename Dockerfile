FROM openjdk:8

COPY ./target/running-rest-demo-with-docker-0.0.1-SNAPSHOT.jar /usr/src/app/

WORKDIR /usr/src/app

EXPOSE 5000

CMD ["java", "-jar", "running-rest-demo-with-docker-0.0.1-SNAPSHOT.jar"]