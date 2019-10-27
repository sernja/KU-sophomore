import java.util.Comparator;

public class SortScoreMaxToMin implements Comparator<Student> {
    @Override
    public int compare(Student o1, Student o2) {
        double diff = o1.getScore() - o2.getScore();
        if (diff > 0) return -1;
        if (diff < 0) return 1;
        return 0;
    }
}
