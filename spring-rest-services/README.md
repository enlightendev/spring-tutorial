## about spring-rest-services

Spring boot application to demonstrate:
- spring boot starter
- using retrofit library to test rest api using type safe client library.
- 

NOTE: this project does not have a persistence layer and thus does not rely on jpa or any persistence framework.

## tags
spring-boot jpa retrofit @ResponseBody

## setup 
none

## running
- to start embedded tomcat right click on Main.java and select "Run Main.main()".



## testing
1 - SpringContextTest: testing the spring container and the presence of beans.
2 - TradeLogControllerRetrofitTest: using the retrofit library to create type safe client access to rest api.

use your ide to run tests.


## resources

- retrofit: http://square.github.io/retrofit/