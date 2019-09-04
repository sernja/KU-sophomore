//elab-source:Main.java
//elab-mainclass:Main
import java.util.Scanner;

public class Main {

    private static Detector create(){
        Scanner sc = new Scanner(System.in);

        long trueAns = sc.nextLong();

        int line = sc.nextInt();

        long arrAns[] = new long[line];
        for(int i = 0; i < line; i++){
            arrAns[i] = sc.nextLong();
        }
       return new Detector(arrAns, trueAns, line);
    }

    public static void main(String[] args) {
        Detector detector = create();

        int line = 1;
        for(long i : detector.getArrAns()){

            long countTrue = 0;
            long countAns = 0;
            long trueAns = detector.getTrueAns();

            while (trueAns > 0){
                countAns++;
                if(i%10 == trueAns%10){
                    countTrue++;
                }
                i /= 10;
                trueAns /= 10;
            }

            detector.saveAns(countAns, countTrue, line);

            System.out.println(detector.toString());
            line++;
        }
        System.out.println(detector.avg());
    }
}
