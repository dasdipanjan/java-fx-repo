package com.dd.fx.view;

import javafx.application.Application;
import javafx.application.Platform;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.VBox;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class ImprovedHelloWorld extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception {
        Label nameLb1 = new Label("Enter Your Name : ");
        TextField nameFld = new TextField();
        Label msgLb2 = new Label();
        msgLb2.setStyle("-fx-text-fill: blue;");
        Button sayHelloBtn = new Button("Say Hello");
        Button exitBtn = new Button("Exit");
        sayHelloBtn.setOnAction(e -> {
            String name = nameFld.getText();
            if (name.trim().length() > 0){
                msgLb2.setText("Hello "+name);
            } else {
                msgLb2.setText("Hello there");
            }
        });
        exitBtn.setOnAction(e -> Platform.exit());
        VBox root = new VBox();
        root.setSpacing(5);
        root.getChildren().addAll(nameLb1, nameFld, msgLb2, sayHelloBtn, exitBtn);
        Scene scene = new Scene(root, 350, 150);
        primaryStage.setScene(scene);
        primaryStage.setTitle("Improved Hello JavaFx Application.");
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
