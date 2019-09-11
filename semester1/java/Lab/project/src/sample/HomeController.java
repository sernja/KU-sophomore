package sample;

import sample.selectTheatre.SelectTheatreController;

import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.input.MouseEvent;
import javafx.scene.text.Text;
import javafx.stage.Stage;
import sample.movie.SetMovie;
import sample.movie.Movie;

import javafx.fxml.FXML;
import javafx.scene.image.ImageView;

import java.io.IOException;

public class HomeController {
    private SetMovie setMovie = new SetMovie();
    private Movie[] m = setMovie.getM();

    @FXML
    ImageView m1ImageView, m2ImageView, m3ImageView, m4ImageView, m5ImageView, m6ImageView;
    @FXML
    Text movieName;


    public void SetOnMouseClicked(MouseEvent event) throws IOException {

//        movieName.setText(m[0].getImage().substring(1));
//        movieName.setText(m1ImageView.getImage().impl_getUrl().substring(68));
        //movieName.setText(String.valueOf(event.getSource().equals(m1ImageView)));
        boolean[] boolCheckMovie = new boolean[6];
        boolCheckMovie[0] = CheckMovie(m1ImageView, event, 0);
        boolCheckMovie[1] = CheckMovie(m2ImageView, event, 1);
        boolCheckMovie[2] = CheckMovie(m3ImageView, event, 2);
        boolCheckMovie[3] = CheckMovie(m4ImageView, event, 3);
        boolCheckMovie[4] = CheckMovie(m5ImageView, event, 4);
        boolCheckMovie[5] = CheckMovie(m6ImageView, event, 5);

        for(int i = 0; i < 7; i++){
            if(boolCheckMovie[i]){
                ((Node)event.getSource()).getScene().getWindow().hide();

                Stage stage = new Stage();
                FXMLLoader loader = new FXMLLoader(getClass().getResource("selectTheatre/selectTheatre.fxml"));
                stage.setTitle("Select Theatre");
                stage.setScene(new Scene(loader.load()));

                SelectTheatreController selectTheatreController = loader.getController();
                selectTheatreController.setMovie(m[i]);

                stage.show();

                break;
            }
        }
    }

    private boolean CheckMovie(ImageView imgMovie, MouseEvent event, int i) {
        if(imgMovie.equals(event.getSource())){
            m[i].setImage(imgMovie.getImage().impl_getUrl());
            return true;
        }
        else return false;
    }

}
