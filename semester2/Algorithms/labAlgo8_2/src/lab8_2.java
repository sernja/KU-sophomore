import java.util.Scanner;

public class lab8_2 {
    static int les(String X, String Y, int m, int n) {
        int lllu[][]=new int[m + 1][n + 1];
        for (int i = 0; i <= m; i++) {
            for (int j = 0; j <= n; j++) {
                if (i == 0 || j == 0) lllu[i][j] = 0;
                else if (X.charAt(i - 1) == Y.charAt(j - 1)) lllu[i][j] = lllu[i - 1][j - 1] + 1;
                else lllu[i][j] = Math.max(lllu[i - 1][j], lllu[i][j - 1]);
            }
        }
        return lllu[m][n];
    }

    static int find(String X, String Y, int costX, int costY) {
        int m = X.length();
        int n = Y.length();
        int len_LCS;
        len_LCS = les(X, Y, m, n);
        return costX * (m - len_LCS) + costY * (n - len_LCS);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long num = sc.nextInt();
        for (int i = 0 ; i < num ; i++){
            String k = sc.next();
            String j = sc.next();
            int ans = find(k,j,15,30);
            System.out.println(ans);
        }
    }
}
