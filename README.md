# Toaster-Library
Used to display desired toast message in android.

It removes the boiler plate code of typing the lengthy toast statement which saves time. It is very easy and simple to use. Just simply add the following dependency and start using its method(s).

 - Step-1: Add it in your root build.gradle at the end of repositories:

```java
allprojects {
  repositories {
    ...
    maven { url 'https://jitpack.io' }
  }
}
```

- Step-2: Add the dependency

```java
dependencies {
  implementation 'com.github.VaibhavAWD:Toaster-Library:v1.0'
}
```

- Step-3: Simply call the method showToast and display the message as follows,

```java
Toaster.showToast(this, "Hello, World!");
```

It is super easy to use. Isn't it!

# Common Toast Messages

The library also contains some common toast messages which are very useful in some common use case scenarios in many different projects. This helps developers saving lot of time instead of creating same string resources in every project repeatedly. The list of common toast messages can be <a href='https://github.com/VaibhavAWD/Toaster-Library/blob/master/toaster/src/main/res/values/strings.xml'>here</a>.
