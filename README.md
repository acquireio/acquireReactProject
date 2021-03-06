# Acquire React Native Android Project

### Requirements
-------------
- Android Studio 2.2.x
- Gradle 2.2.x
- Android 7.1.1 SDK
- Android device running Android 5.0 or newer (To get fully functioning sdk)
- A React native project built using **Building Projects with Native Code** option from https://facebook.github.io/react-native/docs/getting-started.html 

## Installation Instructions:

### Steps to Install Acquire with all required dependencies 

Add the following dependency to your app's `build.gradle` file:
```groovy
dependencies {
implementation 'com.android.support:appcompat-v7:27.1.0' // if not added already
implementation 'com.android.support:design:27.1.0' // if not added already
implementation 'com.android.support:support-emoji-appcompat:27.1.0' // if not added already
implementation 'com.android.support:customtabs:27.1.0' // if want to give support for links
implementation ('io.socket:socket.io-client:1.0.0') {
   exclude group: 'org.json', module: 'json'
}
implementation 'pl.droidsonroids.gif:android-gif-drawable:1.2.+'
implementation 'com.amitshekhar.android:android-networking:1.0.2'
implementation 'com.acquireio:core:2.+'
implementation 'com.squareup.picasso:picasso:2.71828'
}
```

For our sdk you will need to add these lines to your project's `build.gradle`.
```javascript
// Add these lines to your project gradle:
   
allprojects {
    repositories {
        maven {
            url "http://107.155.116.28:8086/artifactory/libs-release-local"
        }
    }
}
```
Same way if you want to use our co-browse only sdk you can do by adding the following dependency to your app's `build.gradle` file:  
```groovy 
implementation 'com.acquireio:cobrowse_only:1.+'
implementation 'com.android.support:design:27.1.1'
implementation 'com.android.support:appcompat-v7:28.0.0-rc01'
implementation('io.socket:socket.io-client:1.0.0') {
   exclude group: 'org.json', module: 'json'
}
```
And project gradle remains same for both sdks.

## Setup and Configuration

* Our [installation guide](https://developers.acquire.io/integration-sdk) contains full setup and initialisation instructions.
* The [configuration guide](https://developers.acquire.io/initialization-android) provides info on how to configure Acquire for Android.
* Please contact us on [Acquire](https://www.acquire.io/) with any questions you may have, we're only a message away!

## Permissions

We include the [INTERNET](http://developer.android.com/reference/android/Manifest.permission.html#INTERNET) permission by default as we need it to make network requests:

```xml
<uses-permission android:name="android.permission.INTERNET"/>
```  

Run-time permissions:

```xml
<uses-permission android:name="android.permission.CAMERA" />
<uses-permission android:name="android.permission.RECORD_AUDIO" />
```
It will ask audio/video permissions when required to make a video call.

```xml
<uses-permission android:name="android.permission.READ_EXTERNAL_STORAGE" />
<uses-permission android:name="android.permission.WRITE_EXTERNAL_STORAGE" />
```
These permissions needed when an attachment is selected to share from the app.

## Building 
- Make sure you've installed the Android 7.1.1 SDK and upgraded to the latest version of Android Studio
- Make sure you've updated all support repository and Google Play Services repository packages in the Android SDK manager
- See the configuration and clone the environment into your project to run our Acquire chat sdk.

Note : _**If you are using gradle Plugin version 3.0 then use implementation instead of compile**_.         
For release apk if you want to give support to arm-v7 ABI only then use "```'com.acquireio:core-arm-v7a:1.+'```" instead of "```'com.acquireio:core:1.+'```". to reduce apk size.

-------------

And that's it :thumbsup: 
Voila!! You had integrated whole chat module in few minutes.
