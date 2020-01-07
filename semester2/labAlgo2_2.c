#include <stdio.h>
int main(){
    int num_input, x, y;
    scanf("%d", &num_input);
    for (int i = 0; i < num_input; i++){
        scanf("%d %d", &x, &y);
        if((x-2) == y){
            if((y%2) == 0){
                printf("%d\n", (y*2)+2);
            }
            else{
                printf("%d\n", (y*2)+1);
            }
        }
        else if(x == y){
            if((y%2) == 0){
                printf("%d\n", y*2);
            }
            else{
                printf("%d\n", (y*2)-1);
            }
        }
        else{
            printf("No Number\n");
        }
    }
}