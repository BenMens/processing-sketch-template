# Readme

This template can be used to create new Processing applications based
on the processing bridge. Using the processing bridge gives the programmer
more freedom to use advanced Java features.

App created from this template will run from VSCode and eclipse.

## Prerequisites

- OpenJDK 17
- Maven

## Change target name and version

In pom.xml change

  ```xml
  <groupId>my.groupId</groupId>
  <artifactId>sketch-template</artifactId>
  <version>0.0.0-SNAPSHOT</version>
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
    java -jar target/sketch-template-0.0.0-SNAPSHOT-runnable.jar
  ```

Notes:

- JVM 17 should be used.
- If the target name is changed, the name of the .jar also changes.
