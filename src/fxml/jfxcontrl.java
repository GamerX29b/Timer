package fxml;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;

import java.net.URL;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.ResourceBundle;

import javafx.event.ActionEvent;
import javafx.scene.control.Button;
import javafx.scene.control.Label;


public class jfxcontrl implements Initializable {

        @FXML
    private Button okButton;

        @FXML
    private Label dataTimeLabel;


        @Override
    public void initialize(URL location, ResourceBundle resources) {

        // TODO (don't really need to do anything here).
    }
        public void setDataTimeLabel(){
            System.out.println("Hello World");

            Date WhatDayIsToday = new Date();
            Calendar thisCalendar = Calendar.getInstance();
            Calendar dammitCalendar = Calendar.getInstance();
            TimeThis th = new TimeThis();
            Date dammitDate = th.getTime();
            thisCalendar.setTime(WhatDayIsToday);
            dammitCalendar.setTime(dammitDate);


            long time = thisCalendar.getTimeInMillis()- dammitCalendar.getTimeInMillis();
            long dammitDay = (((time/1000)/60)/60)/24;
            long dammitHour = ((time/1000)/60)/60;


            String dateTimeString = String.valueOf(dammitDay) + " дней прошло "; //df.format(dammit);


            dataTimeLabel.setText(dateTimeString);
        }

    public void close(ActionEvent actionEvent) {
        setDataTimeLabel();
            //System.exit(0);
    }
}
