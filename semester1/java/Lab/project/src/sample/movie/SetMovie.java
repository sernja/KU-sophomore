package sample.movie;
import sample.HomeController;

public class SetMovie {
    private Movie[] m = new Movie[6];

    public SetMovie(){
        m[0] = new Movie("Kingsman", "12/02/2015", "Action/Spy/Comedy", "129");
        m[1] = new Movie("Avatar", "18/12/2009", "Action/Adventure/Fantasy/Sci-Fi", "166");
        m[2] = new Movie("Black Panther", "16/02/2018", "Action/Adventure/Sci-Fi", "134");
        m[3] = new Movie("Jumanji", "20/12/2017", "Action/Adventure/Comedy", "119");
        m[4] = new Movie("Alita", "13/02/2019", "Action/Adventure/Sci-Fi", "122");
        m[5] = new Movie("Captain Marvel", "08/03/2019", "Action/Adventure/Sci-Fi", "123");
    }

    public Movie[] getM() {
        return m;
    }
}
