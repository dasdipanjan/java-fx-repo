# Java FX Examples
This repository is the source of various example of Java FX's implementation. It is starting with simple Hello World program for desktop application. Later on you will find important implementation whic are really required in professional level development.

## Java FX Applications.

### 1. Hello World Program with Gradle setup.
For this program and rest other programs I have used *Oracle Java SDK-11*, Java Fx Gradle plugins *org.openjfx.javafxplugin (version: 0.0.9)* and *Intellij Community Edition(2018.3.6)* as development IDE. To understand gradle configuration please check the gradle.build file under hello-world project. Check the [hello-world](https://github.com/dasdipanjan/java-fx-repo/tree/master/hello-world) source code for all information.

### 2. Improved Hello World Program 
This program is an advanced version of hello-world program. In this program I am dynamically adding Label, TextField, Label, Button to VBox. And Later on VBox is added to Scene and Scene is added to Stage.
Few events have been attached to Buttons and they are functional. check the [improved-hello-world](https://github.com/dasdipanjan/java-fx-repo/tree/master/improved-hello-world) source code for all information.

### 3. Java FX Application Life Cycle Program
There are three important methods are in Java Fx's Application class. Important methods are following.

    1. *init()*
    2. *start(Stage primaryStage)*
    3. *stop()*

Java FX runtime creates so many threads in JavaFX application's life cycle. But among somany JavaFX launcher and application threads are very important. JavaFX-Launcher thread calls init() method and application thread calls start and stop method. In init() method you can initialize resources but you are not allowed to create Scene or Stage in this method. JavaFX Application Thread calls start(Stage primaryStage) and stop() method. But default constructor is called by JavaFx Application Thread.
For more details please check the [life-cycle](https://github.com/dasdipanjan/java-fx-repo/tree/master/fx-lifecycle) code for more information.
