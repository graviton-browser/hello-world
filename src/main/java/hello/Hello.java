package hello;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

public class Hello extends Application  {
    @Override
    public void start(Stage primaryStage) {
        StackPane helloPane = new StackPane(new Button("Hello world!"));
        primaryStage.setScene(new Scene(helloPane));
        primaryStage.setWidth(300);
        primaryStage.setHeight(200);
        primaryStage.show();
    }

    public static void main(String[] args) {
        Application.launch(args);
    }
}
