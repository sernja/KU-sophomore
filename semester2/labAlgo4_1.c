#include <stdio.h>
#include <string.h>
int main(){
    int line, j, k;
    char str1[line][100];
    scanf("%d",&line);
    printf("line = %d\n", line);
    for(int i = 0; i < line; i++) {
        printf("i = %d, ",i);
        printf("line = %d\n", line);
        scanf("%s", str1[i]);
    }
    // for(int i = 0; i < line-1; i++) {
    //     // printf("before ");
    //     for(j =0; str1[i][j] != '\0'; j++);
    //     for(k = 0; str1[i+1][k] != '\0'; k++);
    //     if(j > k){
    //         char temp[100];
    //         printf("error = %d\n", k);
    //         strcpy(temp, str1[i]);
    //         strcpy(str1[i],str1[i+1]);
    //         strcpy(str1[i+1], temp);
    //         i = 0;
    //     }
    // }
    
    // for(int i = 0; i <line; i++) printf("\n%s", str1[i]);
}