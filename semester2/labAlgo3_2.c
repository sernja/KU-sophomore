#include <stdio.h>

int sum_abc(int a, int b, int c){
    printf("\n%d %d %d : %d", a, b, c, (a*a) + (b*b) + (c*c));
    return (a*a) + (b*b) + (c*c);
}

void find_abc(int k, int *a, int *b, int *c){
    *a = -1;
    int ans;
    if(k != 0){
        while(1){
            *a += 1;
            *b = *a;
            *c = *a;
            ans = sum_abc(*a, *b, *c);
            if(ans > k){
                *a = -1;
                break;
            }
            else if(ans != k){
                while(1){
                    *b += 1;
                    *c = *b;
                    ans = sum_abc(*a, *b, *c);
                    if(ans > k){
                        break;
                    }
                    else if(ans != k){
                        while (1){
                            *c += 1;
                            ans = sum_abc(*a, *b, *c);
                            if(ans == k){
                                break;
                            }
                            else if(ans > k){
                                break;
                            }
                        }
                    }
                    if(ans == k){
                        break;
                    }
                }
            }
            if(ans == k){
                break;
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