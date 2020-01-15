#include <stdio.h>
#include <string.h>
int main(){
    int line, bool_check = 1;
    scanf("%d",&line);
    char str1[line][101];
    for(int i = 0; i < line; i++) {
        scanf("%s",str1[i]);
    }
    while(bool_check){
        bool_check = 0;
        for(int i = 0; i < line-1; i++){
            if(strlen(str1[i]) > strlen(str1[i+1])){
                bool_check = 1;
                char temp_[100];
                strcpy(temp_, str1[i]);
                strcpy(str1[i], str1[i+1]);
                strcpy(str1[i+1], temp_);
            }
        }
    }
    int bool_is_notSub = 0;
    for(int i = 0; i <line-1; i++) {
        char *is_not_sub = strstr(str1[i+1], str1[i]);
        if(is_not_sub == NULL) {
            bool_is_notSub =  1;
            break;
        }
    }
    if(bool_is_notSub) printf("NO");
    else{
        printf("YES");
        for(int i = 0; i < line; i++) {
            printf("\n%s", str1[i]);
        }
    }
}