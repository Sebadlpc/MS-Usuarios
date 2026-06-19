# Estapa 1: Compilación
FROM maven:3.9.6-eclipse-temurin-17-alpine AS build
WORKDIR /app

# Copiar el proyecto completo al contenedor
COPY . .

# Compilar el microservicio usando el pom.xml raíz
RUN mvn clean package -DskipTests

# Etapa 2: Ejecución
FROM eclipse-temurin:17-jdk-alpine
WORKDIR /app
VOLUME /tmp
EXPOSE 8081

# Copiar el archivo .jar generado en la etapa anterior
COPY --from=build /app/usuarios/target/*.jar app.jar

ENTRYPOINT ["java", "-jar", "app.jar"]