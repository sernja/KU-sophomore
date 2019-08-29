import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class Main {

    public static class SortHeight implements Comparator<Student> {
        public int compare(Student a, Student b) {
            return a.getHeight() - b.getHeight();
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int line = sc.nextInt();
        ArrayList<Student> arrstd = new ArrayList<Student>();
        for(int i = 0; i < line; i++){
            String name = sc.next();
            int height = sc.nextInt();
            sc.nextLine();
            arrstd.add(new Student(name, height));
        }
        Collections.sort(arrstd, new SortHeight());
        int num = sc.nextInt();
        int countarr = arrstd.size();
        int printLine = countarr/num + (countarr %  num > 0 ? 1 : 0);
        System.out.println(printLine);
        int count = 0;
        for(Student i : arrstd){
            count++;
            if (count == 1) System.out.println(i.getName());
            if (count == num) count = 0;
        }
    }

}
