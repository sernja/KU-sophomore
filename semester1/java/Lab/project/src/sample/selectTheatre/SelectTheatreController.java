package sample.selectTheatre;

import javafx.event.Event;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.application.Platform;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.stage.Stage;
import sample.movie.Movie;



public class SelectTheatreController {
    private Movie movie;

    @FXML
    Label textName, textDate, textType, textTime;
    @FXML
    ImageView movieImgV;
    @FXML
    Button btnTheatre1_1, btnTheatre1_2, btnTheatre2_1, btnTheatre2_2, btnTheatre3_1, btnTheatre3_2, btnTheatre4_1, btnTheatre4_2;

    @FXML public void initialize(){

        Platform.runLater(() -> {
            movieImgV.setImage(new Image(movie.getImage()));
            textName.setText(movie.getName());
            textDate.setText(movie.getDate());
            textType.setText(movie.getType());
            textTime.setText(movie.getTime());
        });
    }

    public void BtnOnAction(Event event) throws Exception{
        ((Node)event.getSource()).getScene().getWindow().hide();

        Stage stage = new Stage();
        FXMLLoader loader = new FXMLLoader(getClass().getResource("../theatre/TheatreMovie.fxml"));
        stage.setTitle("Theatre");
        stage.setScene(new Scene(loader.load()));
        stage.show();
    }

    public void setMovie(Movie movie){
        this.movie = movie;
    }
}
