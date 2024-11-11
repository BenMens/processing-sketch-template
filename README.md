# Readme

This template can be used to create new Processing applications based
on the processing bridge. Using the processing bridge gives the programmer
more freedom to use advanced Java features.

App created from this template will run from VSCode and eclipse.

## Prerequisites

- JDK 17+
- Maven

## Change target name and version

In pom.xml update

  ```xml
  <groupId>nl.processingproject</groupId>
  <artifactId>sketch-template</artifactId>
  <version>4.3.3-SNAPSHOT</version>
```

In pom.xml update the mainClass

```xml
  <mainClass>nl.processingproject.ProcessingApplet</mainClass>
```

## Build runnable jar

  ```shell
    mvn clean package
  ```

## Run using Maven

  ```shell
    mvn exec:java
  ```

## Run runnable jar

  ```shell
    java -jar target/sketch-template-4.3.3-SNAPSHOT-runnable.jar
  ```

## Notes

- If the target name is changed, the name of the .jar also changes.
