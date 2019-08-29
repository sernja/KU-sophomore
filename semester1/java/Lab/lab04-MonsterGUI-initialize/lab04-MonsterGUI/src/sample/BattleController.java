package sample;

import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.ProgressBar;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.text.Text;
import javafx.stage.Stage;
import java.io.IOException;
import java.net.URISyntaxException;

public class BattleController {

    private Monster m1, m2;

    private GameController gameController;


    @FXML
    ImageView m1Image, m2Image, m1WinImageview, m2WinImageview;
    @FXML
    ProgressBar m1HpProgressbar, m2HpProgressbar;
    @FXML
    Button  mAtkButton, mHealButton;
    @FXML
    Label m1NameLabel, m2NameLabel, turnLabel, roundLabel;
    @FXML
    Text m1Text, m2Text;



    @FXML public void initialize(){

        Platform.runLater(new Runnable() {
            @Override
            public void run() {
                try {
                    m1Image.setImage(new Image(getClass().getResource(m1.getImgPath()).toURI().toString()));
                    m2Image.setImage(new Image(getClass().getResource(m2.getImgPath()).toURI().toString()));

                    gameController = new GameController(m1, m2);
                    display();
                } catch (URISyntaxException e) {
                    e.printStackTrace();
                }
            }
        });
    }

    public void setMonster1(Monster m){
        this.m1 = m;
    }
    public void setMonster2(Monster m){
        this.m2 = m;
    }


    @FXML public void handleAtkBtnOnAction(ActionEvent event){

        // call atk method in gameController

        // check isWin
        if(gameController.isWin()) gameController.attackState();
        // display
        display();
    }


    @FXML public void handleHealBtnOnAction(ActionEvent event) throws IOException {
        if(gameController.isWin()) {
            FXMLLoader loader = new FXMLLoader(getClass().getResource("heal.fxml"));

            Stage stage = new Stage();
            stage.setScene(new Scene(loader.load()));

            stage.setTitle("Heal Monster");
            HealController healController = loader.getController();
            healController.setHp(gameController);
            stage.show();
            stage.setOnHidden(event1 -> display());
        }

    }
    public void setColorProgressbar(ProgressBar progressbar) {
        if(progressbar.getProgress() >= 0.8){
            progressbar.setStyle("-fx-accent: green");
        }else if(progressbar.getProgress() >= 0.6){
            progressbar.setStyle("-fx-accent: yellow");
        }else if(progressbar.getProgress() >= 0.4){
            progressbar.setStyle("-fx-accent: orange");
        }else if (progressbar.getProgress() >= 0.2){
            progressbar.setStyle("-fx-accent: orange");
        } else progressbar.setStyle("-fx-accent: red");
    }

    public void setTextMonsInfoAndWin(Monster m1, Monster m2) {
        if(gameController.isWin()) {
            m1WinImageview.setVisible(false);
            m2WinImageview.setVisible(false);
            m1Text.setText(m1.info());
            m2Text.setText(m2.info());
        }else{
            if(m1.getHp() > m2.getHp()) m1WinImageview.setVisible(true);
            else m2WinImageview.setVisible(true);

            m1Text.setText("Monster win is " + gameController.getWinMonster().getName());
            m2Text.setText("Monster win HP " + gameController.getWinMonster().getHp());
        }
    }

    public void display(){
        setTextMonsInfoAndWin(m1, m2);
        // call display next turn monster attribute
        roundLabel.setText("Round " + gameController.getRound());
        turnLabel.setText("Turn " + gameController.turnMon());

        m1HpProgressbar.setProgress(m1.getHp()/(double)m1.getMax_hp());
        m2HpProgressbar.setProgress(m2.getHp()/(double)m2.getMax_hp());
        setColorProgressbar(m1HpProgressbar);
        setColorProgressbar(m2HpProgressbar);

        // call display next turn monster image
        m1NameLabel.setText(m1.getName());
        m2NameLabel.setText(m2.getName());
    }

}
