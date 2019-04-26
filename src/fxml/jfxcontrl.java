package fxml;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;

import java.net.URL;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.ResourceBundle;

import javafx.event.ActionEvent;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;


import java.awt.*;

public class jfxcontrl implements Initializable {

        @FXML
    private Button okButton;

        @FXML
    private Button dataTimeLabel;


        @Override
    public void initialize(URL location, ResourceBundle resources) {

        // TODO (don't really need to do anything here).
    }
        public void setDataTimeLabel(ActionEvent event){
            System.out.println("Hello World");

            Date now = new Date();
            DateFormat df = new SimpleDateFormat("dd.mm.yyyy");

            String dateTimeString = df.format(now);

            dataTimeLabel.setText(dateTimeString);
        }
}
