
package minescampgame;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import java.util.Random;


public class FXMLDocumentController implements Initializable {
    private int life = 100;
    private int point = 0;
    @FXML
    private Label lbLife;
    @FXML
    private Label lbPoint;
    @FXML
    private Button btn1;
    @FXML
    private Button btn11;
    @FXML
    private Label lbSubtittle;
    @FXML
    private void btnEvent(ActionEvent event) {
        Random ran = new Random();
        int action = ran.nextInt(2);
        if(action == 0) {
            life -= 10;
            lbLife.setText("Life: "+Integer.toString(life));
        }else {
            point += 20;
            lbPoint.setText("Points: "+Integer.toString(point));
        };
        winOrLoseGame();
    }
    @FXML
    private void winOrLoseGame() {
        if(life == 0) {
            lbSubtittle.setText("You lost, please restart the program and try again!!!");
        }else if(point == 100) {
            lbSubtittle.setText("You f** won!!! - Congratulations!!!");
        }else if(point > 100 || life < 0) {
            lbSubtittle.setText("Please, restart the program!!");
            lbSubtittle.setText("ERROR on Matrix!!");
        }else {
            lbSubtittle.setText("");
        };
    };
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    
}
