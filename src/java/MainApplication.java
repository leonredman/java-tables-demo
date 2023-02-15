package wgu.tables01;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class MainApplication extends Application {

 @Override
    public void start(Stage primaryStage) throws IOException {

        Parent root = FXMLLoader.load(MainApplication.class.getResource("/view/main.fxml"));
        primaryStage.setTitle("Basketball All Stars");
        primaryStage.setScene(new Scene (root, 1400,675));
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}