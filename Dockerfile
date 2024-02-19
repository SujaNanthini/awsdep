FROM eclipse-temurin:17
COPY target/awsdep.jar awsdep.jar
CMD ["java" "-jar" "awsdep.jar"]