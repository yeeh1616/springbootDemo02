FROM maven:2.7.6-jdk-19

WORKDIR /springbootDemo02
COPY . .
RUN mvn clean install

CMD mvn spring-boot:run