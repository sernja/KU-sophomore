import java.util.LinkedList;
import java.util.Scanner;

public class Main {
    static int lcs(String X, String Y, int m, int n)
    {
        int L[][]=new int[m + 1][n + 1];
        for (int i = 0; i <= m; i++)
        {
            for (int j = 0; j <= n; j++)
            {
                if (i == 0 || j == 0)
                    L[i][j] = 0;

                else if (X.charAt(i - 1) == Y.charAt(j - 1))
                    L[i][j] = L[i - 1][j - 1] + 1;

                else
                    L[i][j] = Math.max(L[i - 1][j], L[i][j - 1]);
            }
        }


        return L[m][n];
    }

    static int findMinCost(String X, String Y, int costX, int costY)
    {

        int m = X.length();
        int n = Y.length();
        int len_LCS;
        len_LCS = lcs(X, Y, m, n);
        return costX * (m - len_LCS) +
                costY * (n - len_LCS);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long num = sc.nextInt();
        for (int i = 0 ; i < num ; i++){
            String k = sc.next();
            String j = sc.next();
            System.out.println(findMinCost(k,j,15,30));

        }


    }

}
