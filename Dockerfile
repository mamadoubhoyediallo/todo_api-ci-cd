FROM openjdk:17
EXPOSE 8080
ADD target/todo_api_cicd.jar todo_api_cicd.jar
ENTRYPOINT ["java","-jar","/todo_api_cicd.jar"]
