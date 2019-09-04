//elab-source:Main.java
//elab-mainclass:Main
import java.util.Scanner;

public class Main {

    private static Detector create() {
        Scanner sc = new Scanner(System.in);

        long trueAns = sc.nextLong();

        int line = sc.nextInt();

        long arrAns[] = new long[line];
        for (int i = 0; i < line; i++) {
            arrAns[i] = sc.nextLong();
        }
        return new Detector(arrAns, trueAns);
    }

    public static void main(String[] args) {
        Detector detector = create();

        int avg = 0;
        for(int i = 0; i < detector.getArrAns().length; i++){
            int numTrue = detector.findNumTrue(i);
            avg += numTrue;
            System.out.println(i+1 +": " + numTrue + "/" + detector.getNumAns());
        }
        System.out.println("Average: " + avg/(double)detector.getArrAns().length);
    }
}
