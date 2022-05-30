# appiumautomationlogin

# 1.Login Tests - Automation project
# 2.Automation of the login page in tis application. The repeated steps during the testing will be automated normally.
# 3. Run an basic manual test on the app and identify the scenarios/functionalities that can be automated. Plan the tests accordingly and prioritize them as per functionality and requirements.
## Tech stack:
- Java 8 ([Install docs](https://docs.oracle.com/javase/8/docs/technotes/guides/install/install_overview.html))
- Maven ([Install docs](http://maven.apache.org/install.html))
- Appium ([Install docs](https://appium.io/docs/en/about-appium/intro/#appium-concepts))
- JUnit (Will be installed automatically)
- Please see pom.xml file for more details on application modules
- install the apk file in the emulator or real device and run the scripts accordingly(currently scripts only for emulator, more time needed for the real device scripts)
- 

## Features (Important)
- Tests for Native Android APK mobile application are written in Java using Appium.
  
  for more details on te environment setup and requiremnts please refer the basicautomation project()



## How to set environment for running tests
Before executing tests there should be set next software:
- Android SDK and tools ([Install docs](https://developer.android.com/studio/index.html))
- Node.js with NPM ([Install docs](https://nodejs.org/en/download/))
- Appium server ([Install docs](https://appium.io/docs/en/about-appium/intro/#appium-concepts))

**[Important]**

All the paths for libraries should be added to ```PATH``` system environment variable and to ```~/.bash_profile``` (for Unix systems):
- ANDROID_HOME
- APPIUM_HOME
- NODE_HOME
