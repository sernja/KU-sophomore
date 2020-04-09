import java.util.*;
public class labAlgo5_1 {
    public static List<String> restoreIpAddresses(String s) {
        List<String> ans = new ArrayList();
        if (s.length() > 3 && s.length() < 13)
            help(s, new char[s.length()+3], 0, ans, 0, 0);
        return ans;
    }
    static void help(String str, char[] arr_c, int count, List<String> ans, int start, int i){
        int digit = 0;
        for (int l = start; l < 3+start && l < str.length(); l++){
            digit = 10*digit + (str.charAt(l)-'0');
            if (digit > 255) return;
            arr_c[i++] = str.charAt(l);
            if (count == 3){
                if (l+1==str.length()) ans.add(new String(arr_c));
            }else{
                arr_c[i] = '.';
                help(str, arr_c, count+1, ans, l+1, i+1);
            }
            if (digit == 0) return;
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        for (int i = 0 ; i < number ;i++){
            String str = sc.next();
            System.out.println(restoreIpAddresses(str).size());
        }
    }

}
