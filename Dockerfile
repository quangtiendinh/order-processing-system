FROM mcr.microsoft.com/openjdk/jdk:21-ubuntu
VOLUME /tmp
COPY target/order-processing-system-0.0.1.jar app.jar
ENTRYPOINT ["java", "-jar", "/app.jar"]