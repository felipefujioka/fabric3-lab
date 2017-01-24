FROM maven:3.2-jdk-7

ARG server_path

COPY pom.xml .
COPY . .

RUN ls

RUN mvn clean install

ENTRYPOINT ["java", "-jar", "$server_path"]