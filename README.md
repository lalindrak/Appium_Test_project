# Appium_Test_project

This is a simple project that I have tried out when I first started automating with Appium. I have used Java as the programming language and testNG as the testing framework 

`prerequisites`


  1) Downlaod and install Java JDK(I have used JDK8) and maven
  2) Downloand and install Android Studio
  3) Create a new Andoird Virtual device - https://developer.android.com/studio/run/managing-avds
  4) Download and install Appium Desktop server

`Steps`



1) Clone this repository
2) Open the project as a maven project(You can open the project by clicking on the pom.xml file)
3) I have used testNG, appium java client and selenium and dependencies on pom file. You will need to reimport maven dependencies
4) Open Android Studio and run the virtual device that you have created in the prerequisites section
5) Once you start the Virtual Device you can login to Play store and downlad an app that show APK information. Ex- https://play.google.com/store/apps/details?id=com.wt.apkinfo&hl=en
6) I have automated the default calculator app that comes with the android phones. Reason for installing the APK info app is to get the _appPackage_ and _appActivity_
7) Open the APK info app and get the values for the _appActivity_ and _appPackage_
8) Get the _deviceName_, _platformName_, _platformVersion_ from the settings section of you virtual device
9) To get the _udid_ you can click on use the command `adb devices`
10) Replace your values for the follwings in `caps.properties` file

    ```
    deviceName=AOSP on IA Emulator
    udid = emulator-5554
    platformName =Android
    platformVersion = 9
    appPackage = com.android.calculator2
    appActivity  = com.android.calculator2.Calculator
    ```
    
11) Now start the Appium Desktop server and start server 
12) All looks good! Now you should be able to run your project Try it out! Happy learning :) 

`Extras`

13) Once you start the appium server click on `Start Inspector session`
14) Fill the Desired capabilitites section and using the above values you generated and click Start session
15) This will start the session and you can use this to inspect mobile element locations for your automation purposes
