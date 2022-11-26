FROM maven:2.7.6-openjdk-19.0.1

WORKDIR /springbootDemo02
COPY . .
RUN mvn clean install

CMD mvn spring-boot:run