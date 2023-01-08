FROM openjdk:8
EXPOSE 8080
ADD target/locker.jar locker.jar
ENTRYPOINT ["java", "-jar", "/locker.jar"]
