# Readme

This template can be used to create new Processing applications based on the
processing bridge. Using the processing bridge gives the programmer more fredom
to use advanced Java features.

App created from this template will run from VSCode and eclipse.

## Prerequisites

- OpenJDK 8 (can be downloaded from [AdoptOpenJDK](https://adoptium.net/))
- Maven (can be downloaded from [Apache Maven](https://maven.apache.org/download.cgi))

## Authenticating to github to access maven packages

Edit your ~/.m2/settings.xml file. and add the server "github-benmens". See
[Authenticating to GitHub Packages](https://docs.github.com/en/packages/working-with-a-github-packages-registry/working-with-the-apache-maven-registry#authenticating-to-github-packages) for more detailed instructions.

  ```xml
    <servers>
      ...

      <server>
        <id>github-benmens</id>
        <username><!-- your username--></username>
        <password><!-- Github personal access tokens --></password>
      </server>

    </servers>
  ```

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

- JVM 8 should be used.
- If the target name is changed, the name of the .jar also changes.
