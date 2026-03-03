FROM maven:latest
LABEL authors="olgachi"

WORKDIR /app

COPY pom.xml .

COPY . /app

RUN mvn package

CMD ["java", "-jar", "target/OTP1_inclass_assignments-1.0-SNAPSHOT.jar"]