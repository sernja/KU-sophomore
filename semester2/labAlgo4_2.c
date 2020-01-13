#include <stdio.h>
int main(){
    unsigned long line;
    scanf("%lu", &line);
    unsigned long arr_num[line];
    for(int i = 0; i < line; i++) scanf("%lu", &arr_num[i]);
    for(int j = 0; j < line; j++) {
        printf("%lu",arr_num[j]);
        if(j != line-1) printf(", ");
    }
    printf("\n");
    for(int i = 0; i < line-1; i++){
        if(arr_num[i] > arr_num[i+1]){
            int temp = arr_num[i];
            arr_num[i] = arr_num[i+1];
            arr_num[i+1] = temp;
            for(int j = 0; j < line; j++) {
                printf("%lu",arr_num[j]);
                 if(j != line-1) printf(", ");
            }
            printf("\n");
            i = 0;
        }
    }
}