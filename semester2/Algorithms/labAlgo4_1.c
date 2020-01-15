#include <stdio.h>
int main(){
    int line, bool_check = 1, i;
    scanf("%d", &line);
    int arr_num[line];
    for( i = 0; i < line; i++) scanf("%d", &arr_num[i]);
    for(int j = 0; j < line; j++) {
        if(j != line-1) printf("%d, ",arr_num[j]);
        else printf("%d\n",arr_num[j]);
    }
    while(bool_check){
        bool_check = 0;
        for(i = 0; i < line-1; i++){
            if(arr_num[i] > arr_num[i+1]){
                bool_check = 1;
                int temp = arr_num[i];
                arr_num[i] = arr_num[i+1];
                arr_num[i+1] = temp;
                for(int j = 0; j < line; j++) {
                     if(j != line-1) printf("%d, ",arr_num[j]);
                     else printf("%d\n",arr_num[j]);
                }
            }
        }
    }
}