#include <stdio.h>
int main() {
    char arr[500];
    scanf("%s", arr);
    for(int i = 0; arr[i] != '\0'; i++){
        if(arr[i] == arr[i+1]){
            for(int j = i; arr[j] != '\0'; j++){
                arr[j] = arr[j+2];
            }
            i--;
        }
    }
  printf("%s", arr);
  return 0;
}

#include <stdio.h>
int main() {
    char arr[500];
    scanf("%s",arr);
    for(int i=0;arr[i] != '\0'; i++){
        if(arr[i] == arr[i+1]){
            for(int j=i; arr[j] != '\0'; j++){
                arr[j] = arr[j+2];
            }
            i=-1;
        }
    }
  printf("%s", arr);
  return 0;
}
