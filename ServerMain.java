package Offline2;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import java.io.IOException;

public class ServerMain extends Application  {

    @Override
    public void start(Stage primaryStage) throws Exception {
        FXMLLoader loader = new FXMLLoader();
        loader.setLocation(getClass().getResource("TableView.fxml"));
        Parent root = loader.load();

        TableViewController controller = loader.getController();
        controller.initializeColumns();
        primaryStage.setTitle("Server");
        primaryStage.setScene(new Scene(root, 700, 575));
        primaryStage.show();

    }


    public static void main(String[] args) {
        launch(args);
    }
}
