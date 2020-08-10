package com.dd.fx.lifecycle;

import javafx.application.Application;
import javafx.application.Platform;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class FxLifeCycle extends Application {

    public FxLifeCycle() {
        System.out.println("Default constructor of FxLifeCycle class.");
    }

    @Override
    public void init() throws Exception {
        super.init();
        System.out.println("Init method of the application class has been executed.");
    }

    @Override
    public void start(Stage primaryStage) throws Exception {
        System.out.println("start(Stage primaryStage) method of the application class has been executed.");
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

    @Override
    public void stop() throws Exception {
        super.stop();
        System.out.println("stop() method of the application class has been executed.");
    }
}
