//elab-source:MainProgram.java
//elab-mainclass:MainProgram
import java.util.Scanner;

public class MainProgram {
    public static void main(String[] args) {
        NumberGuessor ngs = new NumberGuessor();
        Scanner sc = new Scanner(System.in);

        int target = sc.nextInt();
        int line = sc.nextInt();
        for(int i = 0; i < line; i++){
            ngs.setNumberGuessor(sc.nextInt(), target);
            System.out.println(ngs.checkTarget());
        }
    }

}
