import java.util.Scanner;

public class labAlgp5_2 {
    public static boolean equal(String str1, String str2){
        if (str1.length() == 1 && str2.length() == 1){
            if (str1.equals(str2)) return true;
            return false;
        }
        String str_a1 = str1.substring(0,(str1.length()+1)/2);
        String str_a2 = str1.substring(str1.length()/2);
        String str_b1 = str2.substring(0,(str1.length()+1)/2);
        String str_b2 = str2.substring(str1.length()/2);
        return (equal(str_a1,str_b1) && equal(str_a2,str_b2)) || (equal(str_a1,str_b2) && equal(str_a2,str_b1));
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str1 = sc.next();
        String str2 = sc.next();
        if (equal(str1,str2)){
            System.out.println("YES");
        }
        else {
            System.out.println("NO");
        }
    }
}
