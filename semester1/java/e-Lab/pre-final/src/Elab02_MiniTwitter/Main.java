package Elab02_MiniTwitter;

//elab-source:Main.java
//elab-mainClass:Main
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Twitter twitter = new Twitter();
        int n = input.nextInt();
        for(int i=0;i<n;i++){
            String username = input.next();
            twitter.addToTwitter(new Account(username));
        }
        int relation = input.nextInt();
        for(int i=0;i<relation;i++){
            twitter.addFollower(input.next(),input.next());
        }

        int numOfStatus = input.nextInt();
        for(int i=0;i<numOfStatus+1;i++){
            String post = input.nextLine();
            twitter.checkAndAdd(post);
        }

        twitter.print();
    }
}
