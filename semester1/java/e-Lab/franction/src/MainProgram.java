//elab-source:MainProgram.java
//elab-mainclass:MainProgram

import java.util.Scanner;

public class MainProgram {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Franction f1 = new Franction(sc.nextInt(),sc.nextInt());
        Franction f2 = new Franction(sc.nextInt(),sc.nextInt());
        Franction f3 = f1.add(f2);
        System.out.println(f3);

    }
}