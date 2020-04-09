#include <stdio.h>
int main(){
    long long num_input, max_num_multiply = 0;
    scanf("%lld", &num_input); //input number
    long long num_multiply[num_input];
    for (int i = 0; i < num_input; i++){
        if(i == num_input-1) scanf("%lld", &num_multiply[i]);//input number multiply
        else scanf("%lld ", &num_multiply[i]);
    }
    
    for (int  i = 0; i < num_input-1; i++){
        long long num_multiple = num_multiply[i]*num_multiply[i+1]; //num in array multiply
        if(num_multiple > max_num_multiply) max_num_multiply = num_multiple;
    }
    printf("%lld", max_num_multiply);
}