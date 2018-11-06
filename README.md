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
