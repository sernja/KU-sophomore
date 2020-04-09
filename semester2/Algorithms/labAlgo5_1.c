#include <stdio.h>

int find_ip(char arr_ip[21]){
    int ans = 0, a = 0, b = 0, c = 0, d = 0;
    for (int i = 0; a/10 < 255 && i <= 3; i++){
        a += '0' - arr_ip[i];
        int j = i+1;
        while(b/10 < 255 && j <= i+4){
            b += '0' - arr_ip[j];
            int k = j+1;
            while(c/10 < 255 && k <= j+4){
                c += '0' - arr_ip[k];
                d = 0;
                for(int x = k+1; arr_ip[x] != '0'; x++){
                    if(d/10 > 255 && x <= k+4) {
                        if(arr_ip[x+1] == '\0') ans++;
                        break;
                    }
                    else{
                        d += '0' - arr_ip[x];
                        printf("\nd = %d ",d);
                        d *= 10;
                    }
                }
                c *= 10;
                k++;
            }
            b *= 10;
            j++;
        }
        a *= 10;
    }
    return ans;
}

int main(){
    int line, ans;
    char arr_ip[21];
    scanf("%d", &line);
    for(int i = 0; i < line; i++){
        scanf("%s", arr_ip);
        ans = find_ip(arr_ip);
        printf("%d\n", ans);
    }
}