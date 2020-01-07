package Elab06_MovieComparator;

import java.util.Comparator;

public class MovieLengthComparator implements Comparator<Movie> {

    @Override
    public int compare(Movie o1, Movie o2) {
        if(o1.getLength()>o2.getLength())
            return 1;
        else if(o1.getLength() < o2.getLength())
            return -1;
        return 0;
    }
}
