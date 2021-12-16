FROM openjdk:17-oracle
WORKDIR /workspace/app
COPY . /workspace/app
RUN ./gradlew clean build
ENTRYPOINT ["./gradlew", "bootRun"]
EXPOSE 8080