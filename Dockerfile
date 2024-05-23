# Usar una imagen base de OpenJDK
FROM openjdk:21-jdk-slim

# Añadir un argumento para la versión de la aplicación
ARG JAR_FILE=target/*.jar

# Copiar el jar desde el target del proyecto a la imagen Docker
COPY ${JAR_FILE} app.jar

# Exponer el puerto en el que corre la aplicación
EXPOSE 8080

# Comando para ejecutar la aplicación
ENTRYPOINT ["java","-jar","/app.jar"]
