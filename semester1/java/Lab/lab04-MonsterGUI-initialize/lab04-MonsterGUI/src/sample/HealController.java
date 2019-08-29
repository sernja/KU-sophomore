package sample;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.Node;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class HealController {

    private GameController gameController;

    @FXML
    Label nameMonsLabel;
    @FXML
    TextField healTextField;
    @FXML
    Button healButton;


    @FXML
    public void handleOnBtnOnAction(ActionEvent event) {
        int healHp = Integer.parseInt(healTextField.getText());
        gameController.healState(healHp);

        ((Node)event.getSource()).getScene().getWindow().hide();
    }


    public void setHp(GameController gameController) {
        this.gameController = gameController;
    }

}
