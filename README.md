# Mobile Application Automation Using Appium & TestNG (For iOS & Android)

![image](https://github.com/osandadeshan/appium-java-mobile-automation-demo/assets/9147189/5f0893ae-f457-46d9-8efe-1a3f7e065304)

This project serves as a boilerplate for automating Android and iOS mobile applications using a single codebase with TestNG and the Appium library. It provides cross-platform support, easy setup, and comes with examples to help you quickly get started with writing and executing mobile automation tests. Feel free to clone the repository, explore the sample test scripts, and contribute to the project.

[![Appium Java Android Application Automation CI](https://github.com/osandadeshan/appium-java-mobile-automation-demo/actions/workflows/appium-android-ci.yml/badge.svg)](https://github.com/osandadeshan/appium-java-mobile-automation-demo/actions/workflows/appium-android-ci.yml)

## Prerequisites
1. Java
2. Maven
3. NodeJS

## How to install the dependencies
1. Install [XCode](https://apps.apple.com/us/app/xcode/id497799835?mt=12 "XCode")
2. Download and Install [Android Studio](https://developer.android.com/codelabs/basic-android-kotlin-compose-install-android-studio "Android Studio")
3. Create a new system variable for `ANDROID_HOME` pointed to the Android SDK location
4. Update the system path variable with `ANDROID_HOME\platform-tools`
5. Install Appium 2.0 (You may refer to the official [Appium documentation](https://appium.io/docs/en/latest/quickstart/install/))

   `npm install -g appium`

6. Install Appium Drivers 

    `appium driver install uiautomator2`
    
    `appium driver install xcuitest`

Note: Environment Variables

![image](https://user-images.githubusercontent.com/9147189/249979741-757ff724-a75e-4d3b-934f-e6af73d630e2.png)

## How to run tests
1. Using IntelliJ IDEA
   * Go to Maven Profiles
   * Select `android` or `ios` Maven Profile as the platform
   * Select `dev`, `qa`, `uat`, `pre-prod` or `prod` as the environment
   * Select the test classes on the `src/test/java` folder
   * Right-click and click on `Run`


2. Using Command Line
   * To run the smoke test suite in Android against the QA environment

     `mvn clean test -Pandroid,qa,smoke-test`
   * To run the regression test suite in iOS against the UAT environment

     `mvn clean test -Pios,uat,regression-test`

**Note**: By default, if no Maven profiles are selected, the tests will be executed on the `android` platform and in the `dev` environment.

## Tutorials
- [Appium Mobile App Automation — Tutorial 1](https://medium.com/automationmaster/appium-mobile-app-automation-406bf8b0fd80)
- [Appium Mobile App Automation — Tutorial 2](https://medium.com/automationmaster/appium-mobile-app-automation-tutorial-2-527d6d78998a)

## License
<img src="https://upload.wikimedia.org/wikipedia/commons/thumb/0/0b/License_icon-mit-2.svg/2000px-License_icon-mit-2.svg.png" alt="MIT License" width="100" height="100"/> [MIT License](https://opensource.org/licenses/MIT)

## Copyright
Copyright 2024 [MaxSoft](https://maxsoftlk.github.io/).
