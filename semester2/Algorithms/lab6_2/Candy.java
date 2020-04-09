package algorithm.week9;

import java.util.Scanner;

public class Candy {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int len = input.nextInt();
        String string = input.next();
        int red1 = 0, blue1 = 0;
        for(int i = 0; i < len; i++){
            if(string.charAt(i) == 'b' && i%2 == 0){
                red1++;
            }
            else if(string.charAt(i) == 'r' && i%2 != 0){
                blue1++;
            }
        }

        int red2 = 0, blue2 = 0;
        for(int i = 0; i < len; i++){
            if(string.charAt(i) == 'b' && i%2 != 0) blue2++;
            else if(string.charAt(i) =='r' && i%2 == 0) red2++;
        }

        if(red1 + blue1 < red2 + blue2){
            if(red1==blue1) System.out.println(red1);
            else{
                if(red1>blue1){
                    int ans = blue1 + Math.abs(blue1-red1);
                    System.out.println(ans);
                }else{
                    int ans = red1 + Math.abs(blue1-red1);
                    System.out.println(ans);
                }
            }
        }else{
            if(red2==blue2) System.out.println(red2);
            else{
                if(red2 > blue2){
                    int ans = blue2 + Math.abs(blue2-red2);
                    System.out.println(ans);
                }else{
                    int ans = red2 + Math.abs(blue2-red2);
                    System.out.println(ans);
                }
            }
        }
    }
}
