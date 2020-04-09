#include <stdio.h>
int main(){
    long x, y, a, b, ans = 0;
    scanf("%ld", &x);
    scanf("%ld", &y);
    scanf("%ld", &a);
    scanf("%ld", &b);
    while (x != 1) {
        if(x%y!=0){
            if(y> x ){
                ans += (x-1)*a;
                break;
            }
            else ans += a*(x%y);
            x -= x%y;
        }
        if(x-(x/y) >= b){
            x = x/y;
            ans += b;
        }
        else{
            ans += a*(x-1);
            break;
        }
    }
    printf("%ld", ans);
}