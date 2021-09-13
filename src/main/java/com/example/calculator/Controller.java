package com.example.calculator;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.text.Text;

public class Controller {
    @FXML
    private Text output;


    @FXML
    private void handleNumberBtn(ActionEvent event){
        String outputText = output.getText() + ((Button)event.getSource()).getText();
        output.setText(outputText);
    }

    @FXML
    private void handleOperatorBtn(ActionEvent event){

    }

}