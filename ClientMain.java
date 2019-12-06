package Offline2;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class ClientMain extends Application {

    Stage stage;
    @Override
    public void start(Stage primaryStage) throws Exception{
        stage=primaryStage;
        showClientLoginPage();

    }



    public void showClientLoginPage() throws IOException {

        FXMLLoader loader = new FXMLLoader();
        loader.setLocation(getClass().getResource("ClientLogin.fxml"));
        Parent root = loader.load();


        ClientLoginController controller = loader.getController();
        controller.setMain(this);

        stage.setTitle("Client");
        stage.setScene(new Scene(root, 700, 575));
        stage.show();


    }



    public void showClientMsgBox(String username) throws IOException {

        FXMLLoader loader = new FXMLLoader();
        loader.setLocation(getClass().getResource("ClientMessageBox.fxml"));
        Parent root = loader.load();

        ClientMessageBoxController controller = loader.getController();
        controller.setClientMain(this);


        stage.setTitle(username);
        stage.setScene(new Scene(root, 700, 575));
        stage.show();

    }


    public static void main(String[] args) {
        launch(args);
    }

}