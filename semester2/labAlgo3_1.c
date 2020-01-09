#include <stdio.h>

int find_boomb(int y, int c){
    int count = 0;
    if(y-1 == c) count++;
    else if(y == c) count++;
    else if(y+1 == c) count++;
    return count;
}

int main(){
    int w, h, n, q, r, c, x, y;
    scanf("%d %d %d %d", &w, &h, &n, &q);
    int arrn_r[n], arrn_c[n];
    for (int i = 0; i < n; i++){
        scanf("%d %d", &r, &c);
        if(w > r && r >= 0 && h > r && h>= 0){
            arrn_r[i] = r;
            arrn_c[i] = c;
        }
        else{
            break;
        }
    }
    for (int i = 0; i < q; i++){
        scanf("%d %d", &x, &y);
        if(h > y && y >= 0 && w > x && x >= 0){
            int count = 0, boolprint = 1;
            for(int j = 0; j < n; j++){
                if(x == arrn_r[j] && y == arrn_c[j]){
                    printf("Bomb\n");
                    boolprint = 0;
                    break;
                }
                else{
                    if(x-1 == arrn_r[j]){
                        count += find_boomb(y, arrn_c[j]);
                    }
                    else if(x == arrn_r[j]){
                        count += find_boomb(y, arrn_c[j]);
                    }
                    else if(x+1 == arrn_r[j]){
                        count += find_boomb(y, arrn_c[j]);
                    }
                }
            }
            if(boolprint){
                printf("%d\n",count);
            }
        }
    }
}