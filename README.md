# Readme

This template can be used to create new Processing applications based on the
processing bridge. Using the processing bridge gives the programmer more fredom
to use advanced Java features.

App created from this template will run from VSCode and eclipse.

## Prerequisites

- OpenJDK 8 (can be downloaded from [AdoptOpenJDK](https://adoptium.net/))
- Maven (can be downloaded from [Apache Maven](https://maven.apache.org/download.cgi))

## Build runnable jar

  ```shell
    mvn clean package
  ```

## Change target name

In pom.xml change

  ```xml
    <name>sketch-template</name>
  ```

## Run runnable jar

  ```shell
    java -jar target/sketch-template.jar
  ```

Notes:

- JVM 8 should be used.
- If the target name is changed, the name of the .jar also changes.
