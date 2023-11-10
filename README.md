# todo-management
Designing a Todo Management REST API using SpringBoot

This is a Java based REST API that helps us to implement todo management. We have predominantly 3 layers : Repository  :   Service   :   Controller.
Repository Layer - It consists if an interface that extends JpaRepository. It takes input as type Todo and Long. We have a Todo class in Entity package to store the todos in the database.
Service Layer - In this layer we have 1 interface containing the method declarations of all the important services that we will have in the REST API and an implementation class for these methods.
                We have the operations for get, add, update, delete, complete and incomplete todos.
Controller Layer - This layer is reponsible for mapping the http methods with the corresponding service classes. We have the implementation of HTTP methods (GET, POST, PUT, DELETE, PATCH)

We also have implemented security. We have implemented role based authorization with basic authentication and method level security.

To test in Postman, we can use these curls :

1. To get Todo by Id :
   
   curl --location 'http://localhost:8080/api/todos/1' \
--header 'Authorization: Basic ZGViYXJhdGk6Unh5ekAxMjM=' \
--header 'Cookie: JSESSIONID=771C12F7E2BE7D5068BD537F6DA06B82'

2. To add a Todo :
   
   curl --location 'http://localhost:8080/api/todos' \
--header 'Content-Type: application/json' \
--header 'Authorization: Basic YWRtaW46YWRtaW5wYXNzd29yZA==' \
--header 'Cookie: JSESSIONID=771C12F7E2BE7D5068BD537F6DA06B82' \
--data '{
    "title":"Example Project6",
    "description": "Practising Example REST API Project6",
    "completed" : false

}'

3. To update a Todo

   curl --location --request PUT 'http://localhost:8080/api/todos/4' \
--header 'Content-Type: application/json' \
--header 'Authorization: Basic YWRtaW46YWRtaW5wYXNzd29yZA==' \
--header 'Cookie: JSESSIONID=771C12F7E2BE7D5068BD537F6DA06B82' \
--data '{
    "title":"Example Project5",
    "description": "Practising Example REST API Project5 Updated",
    "completed" : false
}'

4. To delete a Todo

   curl --location --request DELETE 'http://localhost:8080/api/todos/2'

5. To mark a Todo as Complete by Id

   curl --location --request PATCH 'http://localhost:8080/api/todos/1/complete'

6. To mark a Todo as Incomplete by Id

   curl --location --request PATCH 'http://localhost:8080/api/todos/1/incomplete'

