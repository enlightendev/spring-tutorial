## about spring-data-jpa

Spring boot based application demonstrating jpa style data access by extending org.springframework.data.repository.CrudRepository

Simply makes this repository available via controller and 
http://localhost:8080/tags/{name}
http://localhost:8080/tags/futures = futures

## tags
spring-boot jpa crud-repository mockmvc

## setup

loading data: 2 options

- simply create a data.sql file in resources folder containing SQL to load data.
- load data using java code as shown in Main.java

## running
- to start embedded tomcat right click on Main.java and select "Run Main.main()".


## testing
1- TagControllerTest - Tests at the controller level using MockMvc


## resources
http://blog.zenika.com/index.php?post/2013/01/15/REST-Web-Services-testing-with-Spring-MVC
http://www.luckyryan.com/2013/08/24/unit-test-controllers-spring-mvc-test/