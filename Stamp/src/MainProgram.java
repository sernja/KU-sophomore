//elab-source:MainProgram.java
//elab-mainclass:MainProgram
import java.util.Scanner;

public class MainProgram {

    public static void main(String[] args) {
        Stamp stm = new Stamp();
        Scanner sc = new Scanner(System.in);

        int line = sc.nextInt();

        double money[] = new double[line];

        for(int i = 0; i < line; i++){
           money[i] = sc.nextDouble();
        }
        stm.setStamp(money);
        stm.calStamp();

        System.out.println(stm.getStamp() + "");
    }
}
