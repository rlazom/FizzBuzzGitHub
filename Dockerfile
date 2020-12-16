FROM maven:3-jdk-8-alpine

MAINTAINER Oclay

COPY . /opt/fizzbuzz

WORKDIR /opt/fizzbuzz

RUN mvn clean install

RUN mvn package

CMD ["java", "-jar", "/opt/fizzbuzz/target/FizzBuzz-1.0-SNAPSHOT.jar"]