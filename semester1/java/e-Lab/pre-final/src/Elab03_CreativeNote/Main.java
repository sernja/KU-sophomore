package Elab03_CreativeNote;
//elab-source:Main.java
//elab-mainClass:Main
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Musician musician = new Musician();
        int n = input.nextInt();
        for(int i=0;i<n;i++){
            musician.addKey(input.next(),new Note(input.next(),input.nextInt()),i);
        }
//        System.out.println();
//        musician.print();
        int k = input.nextInt();
        musician.play();
        System.out.println();
        for(int i=0;i<k-1;i++){
            musician.changeMusic();
            musician.play();
            System.out.println();
        }
    }

}
