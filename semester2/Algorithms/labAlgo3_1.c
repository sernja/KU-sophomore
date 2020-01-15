#include <stdio.h>

int find_boomb(int x, int y, int w, int h, int arr[w][h]){
    int count = 0;
    if(arr[x][y]) count++;
    if(arr[x][y+1]) count++;
    if(arr[x][y+2]) count++;
    return count;
}

int main(){
    int w, h, n, q, r, c, x, y;
    scanf("%d %d %d %d", &w, &h, &n, &q);
    int arrn_rc[w+2][h+2];
    for(int i = 0; i < w+2; i++){
      for(int j = 0; j < h+2; j++) arrn_rc[i][j] = 0;
    }
    for (int i = 0; i < n; i++){
        scanf("%d %d", &c, &r);
        arrn_rc[r+1][c+1] = 1;
    }
    for (int i = 0; i < q; i++){
        scanf("%d %d", &y, &x);
        int count = 0;
        if(arrn_rc[x+1][y+1] == 1) printf("Bomb\n");
        else{
            count += find_boomb(x, y, w, h, arrn_rc);
            count += find_boomb(x+1, y, w, h, arrn_rc);
            count += find_boomb(x+2, y, w, h, arrn_rc);
            printf("%d\n",count);
        }
        
    }
}