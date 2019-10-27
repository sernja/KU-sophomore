import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        ArrayList<Student> students = new ArrayList<>();
        double avg;
        double countScore = 0;
        int i = 0;

        try {
            FileReader file = new FileReader("score-file.csv");
            BufferedReader reader = new BufferedReader(file);
            String line;
            while ((line = reader.readLine()) != null){
                String[] arrstd = line.split(",");
                students.add( new Student(arrstd[0], Double.parseDouble(arrstd[1])));
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

        Scanner sc = new Scanner(System.in);
        String input = sc.next();
        while(!input.equals("E")){
            if (input.equals("A")){
                System.out.println("show score (max to min) or (min to max): 1 or 2");
                int n = sc.nextInt();

                //calculate avg score
                for (Student student : students) {
                    i += 1;
                    countScore += student.getScore();
                }
                avg = countScore/i;

                //print number of std pass
                System.out.println(printNumOfPass(avg, students) + "");

                //fund print students
                printStudentPass(avg, students, n);

            }else if (input.equals("X")){
                System.out.println("What is avg?");
                avg = sc.nextInt();
                System.out.println("show score (max to min) or (min to max): 1 or 2");
                int n = sc.nextInt();

                //print number of std pass
                System.out.println(printNumOfPass(avg, students) + "");

                //fund print students
                printStudentPass(avg, students, n);
            }
            else {
                System.out.println("Wrong input please try again");
            }
            input = sc.next();
        }
    }

    private static void printStudentPass(double avg, ArrayList<Student> students, int n) {
        boolean loopPrint = false;

        //sort min or max
        if (n == 2){
            students.sort(new SortScoreMinToMax());
            loopPrint = true;
        } else if(n == 1){
            students.sort(new SortScoreMaxToMin());
            loopPrint = true;
        }

        //print students
        if (loopPrint){
            for (Student student : students) {
                if (student.getScore() >= avg) {
                    System.out.println(student.getId() + " " + student.getScore());
                }
            }
        }

    }

    private static int printNumOfPass(double avg, ArrayList<Student> students) {
        int numOfPass = 0;
        for (Student student : students) {
            if (student.getScore() > avg) numOfPass++;
        }
        return numOfPass;
    }
}
