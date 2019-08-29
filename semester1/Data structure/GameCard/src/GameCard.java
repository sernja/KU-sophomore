import java.util.Arrays;
import java.util.Scanner;

public class GameCard {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String word = scanner.nextLine();
        char[] wordChar = word.toCharArray();
        char[] answer = new char[500];
        int lenghtAnswer = 0;
        boolean end = true;
        for (;;) {
            for (int i = 0;i<(wordChar.length);i++) {
                if (i == wordChar.length-1) {
                    answer[lenghtAnswer] = wordChar[i];
                    lenghtAnswer++;
                }else if (wordChar[i] == wordChar[i + 1]) {
                    end = false;
                    i++;
                } else {
                    answer[lenghtAnswer] = wordChar[i];
                    lenghtAnswer++;
                }
            } answer = Arrays.copyOf(answer,lenghtAnswer);
            if (end) {
                break;
            } else {
                wordChar = Arrays.copyOf(answer,lenghtAnswer);
                lenghtAnswer = 0;
                end = true;
            }
        } for (int i = 0;i<answer.length;i++) {
            System.out.print(answer[i]);
        }
    }
}
