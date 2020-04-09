import java.util.*;
import java.lang.*;

class lab9_2 {
     static final int m = 10;
     static final int n = 10;
     boolean bpm(boolean[][] bps_G, int u,
                        boolean[] bool_s, int[] m_H) {
        for (int v = 0; v < n; v++) {
            if (bps_G[u][v] && !bool_s[v]) {
                bool_s[v] = true;
                if (m_H[v] < 0 || bpm(bps_G, m_H[v],
                        bool_s, m_H)) {
                    m_H[v] = u;
                    return true;
                }
            }
        }
        return false;
    }
    int maxBPM(boolean[][] bpGraph) {
        int[] m_h = new int[n];
        for(int i = 0; i < n; ++i)
            m_h[i] = -1;
        int result = 0;
        for (int u = 0; u < m; u++) {
            boolean[] bool_s = new boolean[n] ;
            for(int i = 0; i < n; ++i)
                bool_s[i] = false;
            if (bpm(bpGraph, u, bool_s, m_h))
                result++;
        }
        return result;
    }

    public static void main (String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n1 = scanner.nextInt();
        int n2 = scanner.nextInt();
        boolean[][] bps_G = new boolean[][]{
                {false, false, false, false, false, false, false, false, false, false},
                {false, false, false, false, false, false, false, false, false, false},
                {false, false, false, false, false, false, false, false, false, false},
                {false, false, false, false, false, false, false, false, false, false},
                {false, false, false, false, false, false, false, false, false, false},
                {false, false, false, false, false, false, false, false, false, false},
                {false, false, false, false, false, false, false, false, false, false},
                {false, false, false, false, false, false, false, false, false, false},
                {false, false, false, false, false, false, false, false, false, false},
                {false, false, false, false, false, false, false, false, false, false}};
        lab9_2 m = new lab9_2();

        int t = scanner.nextInt();
        for (int i = 0; i < t; i++){
            int x = scanner.nextInt();
            int y = scanner.nextInt();
            bps_G[x-1][y-1]=true;
        }
        System.out.println(n1-m.maxBPM(bps_G));
    }
}
