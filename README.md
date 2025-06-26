# License API

This project demonstrates a simple Kotlin Spring Boot REST API for managing `License` entities stored in a MySQL database. The build uses Gradle.

## Building

Run the tests with Gradle:

```bash
gradle test
```

Check formatting with ktlint:

```bash
gradle ktlintCheck
```

The application can be started with:

```bash
gradle bootRun
```

Database connection settings are defined in `app/src/main/resources/application.properties` and should be adjusted for your environment.
