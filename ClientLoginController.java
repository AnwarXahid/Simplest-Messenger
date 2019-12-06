package Offline2;

import javafx.event.ActionEvent;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;



public class ClientLoginController {
    private ClientMain main;

    @FXML
    private TextField clientName;
    private  String serverAddress = "127.0.0.2";
    private int serverPort = 33343;



    @FXML
    public void connectOnAction(ActionEvent actionEvent) {
      try {


          NetworkUtil nc = new NetworkUtil(serverAddress, serverPort);
          nc.write(clientName.getText());
          new ReadThread(nc);


          main.showClientMsgBox(clientName.getText());

        } catch (Exception e) {
            e.printStackTrace();
        }
    }




    public void setMain(ClientMain main)
    {
        this.main=main;
    }



}
