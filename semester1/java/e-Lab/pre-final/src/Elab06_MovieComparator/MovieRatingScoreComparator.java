package Elab06_MovieComparator;

import java.util.Comparator;

public class MovieRatingScoreComparator implements Comparator<Movie> {

    @Override
    public int compare(Movie o1, Movie o2) {
        if(o1.getRatingScore() > o2.getRatingScore())
            return -1;
        else if(o1.getRatingScore() < o2.getRatingScore())
            return 1;
        return 0;
    }
}
