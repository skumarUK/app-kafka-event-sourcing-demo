FROM ewolff/docker-java
COPY target/demo-api-central-zipkin-service-1.0-SNAPSHOT.jar .
CMD /usr/bin/java -Xmx256m -Xms256m -jar demo-api-central-zipkin-service-1.0-SNAPSHOT.jar
EXPOSE 9411