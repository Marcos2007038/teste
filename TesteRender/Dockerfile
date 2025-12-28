# Imagem base com Java 17
FROM eclipse-temurin:17-jdk

# Diretório de trabalho dentro do container
WORKDIR /app

# Copia o jar gerado para o container
COPY target/TesteRender-0.0.1-SNAPSHOT.jar app.jar

# Porta usada pelo Spring Boot
EXPOSE 8080

# Comando para iniciar a aplicação
ENTRYPOINT ["java", "-jar", "app.jar"]
