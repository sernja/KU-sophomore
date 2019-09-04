//elab-source:Main.java
//elab-mainclass:Main
import java.util.Scanner;

public class Main {
    private static Detector2 create() {
        Scanner sc = new Scanner(System.in);

        String ans = sc.nextLine();
        int line = sc.nextInt();
        String[] ansStd = new String[line];

        for(int i = 0; i < line; i++){
            ansStd[i] = sc.next();
        }
        return new Detector2(ansStd, ans, line);
    }

    private static int compare(char c, String[] strArr, int i){
        int count = 0;
        for(String str : strArr){
            char[] arrCharAnsStd = str.toCharArray();
            if(arrCharAnsStd[i] == c) count++;
        }
        return count;
    }

    public static void main(String[] args) {
        Detector2 detector2 = create();
        char[] charAnsTrue = detector2.getAns().toCharArray();
        int i = 0;
        for(char c : charAnsTrue){
            int numTrue = compare(c, detector2.getAnsStd(), i);
            i++;

            System.out.println(i + ": " + numTrue);
        }

    }

}
