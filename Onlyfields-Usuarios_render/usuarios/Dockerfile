# Usar una imagen base liviana con JDK 17
FROM eclipse-temurin:17-jdk-alpine

VOLUME /tmp

# Puerto que expone tu microservicio de Spring Boot
EXPOSE 8081

# Copia el .jar generado por Maven desde la subcarpeta usuarios hacia la raíz del contenedor
COPY usuarios/target/*.jar app.jar

# Comando para ejecutar la aplicación
ENTRYPOINT ["java", "-jar", "/app.jar"]