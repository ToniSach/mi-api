# Usar una imagen base de OpenJDK
FROM openjdk:17-jdk-slim

# Establecer el directorio de trabajo
WORKDIR /app

# Copiar el archivo pom.xml y las dependencias
COPY pom.xml .

# Descargar las dependencias de Maven
RUN mvn dependency:go-offline

# Copiar el código fuente de la aplicación
COPY src /app/src

# Compilar el proyecto con Maven
RUN mvn clean package

# Exponer el puerto en el que la aplicación correrá (ajustar si es necesario)
EXPOSE 8080

# Ejecutar la aplicación Java
CMD ["java", "-jar", "target/mi-api-1.0.jar"]
