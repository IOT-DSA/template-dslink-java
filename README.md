# template-dslink-java

Template for Java-based DSLinks. Use it!

## Building and running distributions

1. Run `./gradlew distZip`
2. `cd` into `build/distributions`
3. unzip/untar the distribution
4. `cd` into the distribution folder
5. Run `./bin/template-dslink-java -b http://localhost:8080/conn`

## Creating your own link

1. Change the group and project name in Gradle
2. Change the dslink.json file to match
3. Refactor to fit your domain
4. Hack away!
