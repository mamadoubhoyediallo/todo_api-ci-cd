FROM openjdk:17
EXPOSE 9487
ADD target/todo_api_cicd.jar todo_api_cicd.jar
ENTRYPOINT ["java","-jar","/todo_api_cicd.jar"]
