import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int item = sc.nextInt();
        int[] block = new int[item];
        int count = 0;
        for(int i = 0; i < item; i++){
            block[i] = sc.nextInt();
            count += block[i];
        }
        count /= item;
        int moveItem = 0;
        for(int i = 0; i < item; i++){
            if(block[i] > count) moveItem += block[i] - count;
        }
        System.out.println(moveItem);
    }
}
