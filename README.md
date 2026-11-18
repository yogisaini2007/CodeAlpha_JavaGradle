# CodeAlpha Java Gradle Task Manager

## Project Overview

This project is a simple Java-based Task Manager application developed using Gradle as part of my CodeAlpha DevOps Internship.

The application allows users to add tasks, display all tasks, count total tasks and generate a task summary.

## Technologies Used

- Java 25
- Gradle 9.9.1
- Google Guava Library
- JUnit 5
- Git and GitHub
- GitHub Actions

## Project Features

- Add new tasks
- Display all tasks
- Count total tasks
- Generate task summary
- Automated testing using JUnit
- Automated build using Gradle
- CI pipeline using GitHub Actions

## Project Structure

```text
CodeAlpha_Gradle_Project/
│
├── app/
│   ├── src/
│   │   ├── main/java/org/example/App.java
│   │   └── test/java/org/example/AppTest.java
│   └── build.gradle
│
├── gradle/
│   ├── libs.versions.toml
│   └── wrapper/
│
├── .github/
│   └── workflows/
│       └── gradle.yml
│
├── gradlew
├── gradlew.bat
├── settings.gradle
├── gradle.properties
└── README.md
```

## How to Run the Project

### 1. Clone Repository

```bash
git clone https://github.com/yogisaini2007/CodeAlpha_JavaGradle.git
cd CodeAlpha_JavaGradle
```

### 2. Run Application

```bash
./gradlew run
```

### 3. Run Tests

```bash
./gradlew test
```

### 4. Build Project

```bash
./gradlew clean build
```

## CI/CD Integration

GitHub Actions is used to automate the Java application build and testing process.

The pipeline automatically runs when code is pushed to the main branch or a pull request is created for main.

### Workflow Steps

1. Checkout source code.
2. Set up Java 25.
3. Set up Gradle.
4. Build the application.
5. Run automated tests.

## Learning Outcomes

- Learned Java application development.
- Understood Gradle build automation.
- Learned dependency management.
- Implemented unit testing using JUnit.
- Integrated GitHub Actions for CI/CD.
- Understood automated build and testing.

## Author

Yogesh Saini

## Internship

CodeAlpha DevOps Internship
