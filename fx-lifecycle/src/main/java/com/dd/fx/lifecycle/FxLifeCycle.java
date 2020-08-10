package com.dd.fx.lifecycle;

import javafx.application.Application;
import javafx.application.Platform;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class FxLifeCycle extends Application {

    /**
     * This constructor is the first entry point of the execution.
     * Caller thread name: JavaFX Application Thread
     */
    public FxLifeCycle() {
        System.out.println("Default constructor of FxLifeCycle class.");
        String threadName = Thread.currentThread().getName();
        System.out.println("Execution Thread Name : "+threadName);
    }

    /**
     * This method is called after default constructor.
     * Caller thread name:  JavaFX-Launcher
     * @throws Exception
     */
    @Override
    public void init() throws Exception {
        super.init();
        System.out.println("Init method of the application class has been executed.");
        String threadName = Thread.currentThread().getName();
        System.out.println("Execution Thread Name : "+threadName);
    }

    /**
     * This method is called after init() method.
     * Caller thread name: JavaFX Application Thread
     * @param primaryStage
     * @throws Exception
     */
    @Override
    public void start(Stage primaryStage) throws Exception {
        System.out.println("start(Stage primaryStage) method of the application class has been executed.");
        String threadName = Thread.currentThread().getName();
        System.out.println("Execution Thread Name : "+threadName);
        Button exitButton = new Button("EXIT APPLICATION");
        exitButton.setOnAction(e -> {
            Platform.exit();
        });
        VBox root = new VBox();
        root.setSpacing(5);
        root.getChildren().add(exitButton);
        Scene scene = new Scene(root, 500, 400);
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    /**
     * This method is called after start(Stage primaryStage) method.
     * Caller thread name: JavaFX Application Thread
     * @throws Exception
     */
    @Override
    public void stop() throws Exception {
        super.stop();
        System.out.println("stop() method of the application class has been executed.");
        String threadName = Thread.currentThread().getName();
        System.out.println("Execution Thread Name : "+threadName);
    }
}
