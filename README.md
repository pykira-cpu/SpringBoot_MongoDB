## SpringBoot and MongoDB
We are creating REST web services to perform the CRUD operations using Spring Boot with the MongoDB back-end.
It is based on Model-Controller-Service-Repository architecture.Mongo Repository connection is extended with Repository class.
A sample example by taking a Student's first name, last name and age is shown.

### spring-boot
The main library providing features that support the other parts of Spring Boot, these include:

The SpringApplication class, providing static convenience methods that make it easy to write a stand-alone Spring Application. Its sole job is to create and refresh an appropriate Spring ApplicationContext

Embedded web applications with a choice of container (Tomcat, Jetty or Undertow)

First class externalized configuration support

Convenience ApplicationContext initializers, including support for sensible logging defaults

### spring-boot-autoconfigure
Spring Boot can configure large parts of common applications based on the content of their classpath. A single @EnableAutoConfiguration annotation triggers auto-configuration of the Spring context.

Auto-configuration attempts to deduce which beans a user might need. For example, if HSQLDB is on the classpath, and the user has not configured any database connections, then they probably want an in-memory database to be defined. Auto-configuration will always back away as the user starts to define their own beans.
