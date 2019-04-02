# Sample for Spring Boot issue #16407

* Build the project with `mvn package`
* Run the service with `java -jar target/spring-boot-16407-0-SNAPSHOT.jar`
* Start a HTTP request against `http://localhost:8080/`
* While the request is still running, stop the service with Ctrl+C.
* You should see a `NullPointerException` at `org.springframework.boot.actuate.metrics.web.servlet.LongTaskTimingHandlerInterceptor.stopLongTaskTimer`.
