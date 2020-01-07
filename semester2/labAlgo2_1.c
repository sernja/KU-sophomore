#include <stdio.h>
int main(){
    char str_num[9000001];
    int count_num[10] = {0};
    scanf("%s", str_num);
    char chr_num;
    for(int i = 0; str_num[i] != '\0'; i++){
        chr_num = str_num[i];
        int num = chr_num - '0';
        count_num[num] += 1;
    }
    int count = 0;
    int ans = 0;
    int bool_print = 1;
    for(int i = 0; i < 10; i++){
        if(count_num[i] > count){
            count = count_num[i];
            ans = i;
        }
        else if((count_num[i] == count) && count_num[i] > 0){
            bool_print = 0;
        }
    }
    if (bool_print){
        printf("%d", ans);
    } else{
        printf("more");
    }
    return 0;
}