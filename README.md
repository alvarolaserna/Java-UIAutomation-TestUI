# TestUI Mobile Example

## Installation

For the installation of this project first you will need to install the following requirements:

- Java 8 or higher
- Maven
- Android Studio
- Appium (It is recommended to install appium-doctor CLI to check all requirements are well installed)


## Run scenarios

For android app, you first you need to install the APP:

<pre>
    adb install -r -t app.apk  
</pre>

To run all cases just do:
<pre>
    mvn test
</pre>

It is possible to run tests specifying which tag:
<pre>
    mvn test -Dcucumber.options="--tags @RightCreds"
</pre>

# Methods and Framework wiki

Here you will find all you need to know about the framework and methods/Types: https://github.com/testdevlab/TestUI/wiki

## Reports

Allure reports json reports are built in within the framework, you just need to point the CI to the folder `target/allure-results`. You can also generate an html report by installing allure CLI:


<pre>
    npm install -g allure-commandline 
    allure serve target/allure-results
</pre>
