package com.hellofx;

import java.io.IOException;
import javafx.fxml.FXML;
import javafx.scene.control.Label;

public class PrimaryController {
    public double firstnumber=0;
    public double secondnumber=0;
    public boolean isDecimal=false;
    public boolean onFirstOrSecond = true;

    public int decimalDigits=1;
    @FXML
    private Label numberLabel;
    @FXML
    private void switchToSecondary() throws IOException {
        App.setRoot("secondary");
    }
    @FXML
    private void press1(){
        pressNumberButton(1);
    }
    @FXML
    private void press2(){
        pressNumberButton(2);
    }
    @FXML
    private void press3(){
        pressNumberButton(3);
    }
    @FXML
    private void press4(){
        pressNumberButton(4);
    }
    @FXML
    private void press5(){
        pressNumberButton(5);
    }
    @FXML
    private void press6(){
        pressNumberButton(6);
    }
    @FXML
    private void press7(){
        pressNumberButton(7);
    }
    @FXML
    private void press8(){
        pressNumberButton(8);
    }
    @FXML
    private void press9(){
        pressNumberButton(9);
    }
    @FXML
    private void press0(){
        pressNumberButton(0);
    }
    private void pressNumberButton(int num){
        System.out.println(firstnumber);
        if(onFirstOrSecond){
            if(isDecimal){
                decimalDigits*=10;
                firstnumber+= (num/decimalDigits);
            }else{
            firstnumber= (firstnumber*10)+num;
            }
            numberLabel.setText(""+firstnumber);
        }else{
            if(isDecimal){
                decimalDigits*=10;
                secondnumber+= (num/decimalDigits);
            }else{
            secondnumber= (secondnumber*10)+num;
            }   
            numberLabel.setText(""+secondnumber);
        }

    }
}
