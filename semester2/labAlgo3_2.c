#include <stdio.h>
#include <math.h>

int sum_abc(int a, int b, int c){
    return pow(a,2) + pow(b,2) + pow(c,2);
}

void find_abc(int k, int *a, int *b, int *c){
    *a = 0, *b = 0, *c = 0;
    int ans = 0;
    if(k != 0){
        *a = -1;
        while(ans != k){
            *a += 1;
            *b = *a;
            *c = *a;
            ans = sum_abc(*a, *b, *c);
            if(ans > k){
                *a = -1;
                break;
            }
            else {
                if(ans != k){
                    *b -= 1;
                }
                while(ans != k){
                    *b += 1;
                    *c = *b;
                    ans = sum_abc(*a, *b, *c);
                    if(ans > k){
                        break;
                    }
                    else{
                        double num_root_c = sqrt(k - sum_abc(*a, *b, 0));
                        double num = num_root_c - (int)num_root_c;
                        if(num == 0){
                            *c = (int)num_root_c;
                            ans = sum_abc(*a, *b, *c);
                        }
                    }
                }
            }
        }
    }
}

int main(){
    int line, k;
    int a, b, c;
    scanf("%d", &line);
    for(int i = 0; i < line; i++){
        scanf("%d", &k);
        find_abc(k, &a, &b, &c);
        if(a == -1){
            printf("%d\n", a);
        }
        else{
            printf("%d %d %d\n", a, b, c);
        }
    }
}