FROM java:8-alpine
MAINTAINER Your Name <you@example.com>

ADD target/hello-world.jar /hello-world.jar

EXPOSE 8080

CMD ["java", "-jar", "/hello-world.jar"]

