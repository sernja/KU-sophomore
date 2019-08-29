//elab-source:MainProgram.java
//elab-mainclass:MainProgram

import java.util.Scanner;

public class MainProgram {
    public static void main(String[] args) {

        MasterMind mtm = new MasterMind();

        Scanner sc = new Scanner(System.in);
        mtm.setArrayFirst(sc.nextInt());
        mtm.setArraySecond(sc.nextInt());
        mtm.findDigitsAndPositions();

        System.out.println(mtm.toString());
    }
}
