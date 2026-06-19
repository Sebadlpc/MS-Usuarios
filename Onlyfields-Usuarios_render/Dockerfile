# Etapa 1: Compilación de los módulos
FROM maven:3.9.6-eclipse-temurin-17-alpine AS build
WORKDIR /app

# Copiar el archivo POM principal y configuraciones básicas
COPY pom.xml .
COPY usuarios/pom.xml usuarios/

# Copiar todo el código fuente del proyecto
COPY . .

# Limpiar y empaquetar forzando la actualización de dependencias de plugins (Lombok)
RUN mvn clean package -U -DskipTests

# Etapa 2: Imagen de ejecución liviana
FROM eclipse-temurin:17-jdk-alpine
WORKDIR /app
VOLUME /tmp

# El microservicio de usuarios corre internamente en el puerto 8081 según tu log
EXPOSE 8081

# Copiar el archivo JAR generado desde la etapa de compilación
COPY --from=build /app/usuarios/target/*.jar app.jar

ENTRYPOINT ["java", "-jar", "app.jar"]