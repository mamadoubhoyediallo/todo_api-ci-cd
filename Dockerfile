FROM openjdk:17
EXPOSE 8080
ADD target/springboot-images-new.jar springboot-images-new.jar
ENTRYPOINT ["java","-jar","/todo_api_cicd.jar"]
