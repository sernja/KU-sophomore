#include <stdio.h>

void funInputarr(int *arr, int std){
    for(int i = 0; i < std; i++){
        int num;
        scanf("%d", &num);
        arr[i] = num;
    }
}

int main(){
    int numStudent;
    scanf("%d", &numStudent);
    int arr1[numStudent], arr2[numStudent];

    funInputarr(arr1, numStudent);
    funInputarr(arr2, numStudent);

    int count = 0;
    for(int i = 0; i < numStudent; i++){
        for(int j = i; j < numStudent; j++){
            if(arr2[i] != arr1[j] && i == j){
                int x = arr1[j];
                for(int k = j; k < numStudent; k++){
                    if(k == numStudent-1) arr1[k] = x;
                    else arr1[k] = arr1[k+1];
                }
                count++;
            }
            
        }
    }
    printf("%d\n", numStudent+count);

}