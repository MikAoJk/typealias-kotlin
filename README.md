# Typealias kotlin
https://typealias.com/start/kotlin-variables-expressions-types/

### Prerequisites
Make sure you have the Java JDK 21 installed
You can check which version you have installed using this command:
``` bash script
java -version
```

### Build code
Build the code
```bash script
./gradlew clean build
```

### Test code
Run all the tests
```bash script
./gradlew test
```

### Run main method
Run the main method
```bash script
./gradlew run
```

### Upgrading the gradle wrapper
Find the newest version of gradle here: https://gradle.org/releases/ Then run this command:
(Remember to replace $gradleVersjon with the newest version, example: 8.12)
```shell script
./gradlew wrapper --gradle-version $gradleVersjon
```