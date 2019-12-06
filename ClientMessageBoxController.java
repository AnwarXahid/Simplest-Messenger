package Offline2;


import javafx.fxml.FXML;

import java.awt.*;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;

/**
 * Created by MiNNiE on 11/18/2015.
 */
public class ClientMessageBoxController {





    @FXML
    private TextArea msgClient;
    private ClientMain main;




    public void setMsg(String msg)
    {

        msgClient.setText(msg);

    }

    public void setClientMain(ClientMain main)
    {
        this.main=main;
        ReadThread.setC(this);
    }



}
