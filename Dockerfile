    
FROM maven as build
WORKDIR /build
COPY pom.xml .
COPY . .
RUN mvn clean install

FROM openjdk:8
COPY --from=build /build/target/GettersAPI2-0.0.1-SNAPSHOT.jar  getters.jar
EXPOSE 8080
ENTRYPOINT ["java","-jar","getters.jar"]
