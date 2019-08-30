#include <stdio.h>
#include <string.h>
#include <stdlib.h>

typedef struct customer_{
    char name[41];
    int time;
} StructCustomer;

int inputNumcustomer(){
    int num;
    scanf("%d", &num);
    return num;
}

StructCustomer intputArrStcCustomer(StructCustomer arrStcCustomer, char *arr){
    int boolean = 0;
    int j = 0;
    for(int i = 0; arr[i] != '\0'; i++){
        if(arr[i] == ' ') {
            i += 5 ;
            boolean = 1;
        }
        else {
            if(boolean) {
                arrStcCustomer.time = atoi(&arr[i]);
                break;
            } else {
                arrStcCustomer.name[j] = arr[i];
                j++;
            }
        }
    }
    arrStcCustomer.name[j] = '\0';
    return arrStcCustomer;
}

int main(){
    int numcustomer, numCustomerOut;
    
    numcustomer = inputNumcustomer();

    StructCustomer arrStcCustomer[numcustomer];

    getchar();//customer_in
    for(int i = 0; i < numcustomer; i++){
        char arr[58];
        getchar();
        gets(arr);
        arrStcCustomer[i] = intputArrStcCustomer(arrStcCustomer[i], arr);
    }

    numCustomerOut = inputNumcustomer();//customerOut
    char arrNameOut[numCustomerOut][41];
    getchar();
    for(int i = 0; i < numCustomerOut; i++){
        
        getchar();
        gets(arrNameOut[i]);
    }

    int timeCount;
    scanf("%d", &timeCount);
    for(int i = 0; i < numcustomer; i++){
        int boolean = 0;
        for(int j = 0; j < numCustomerOut; j++){
            if(strcmp(arrNameOut[j] ,arrStcCustomer[i].name) == 0){
                boolean = 1;
                break;
            }
        }
        if(boolean){
            boolean = 0;
            continue;
        }else{
            timeCount -= arrStcCustomer[i].time;
            if(timeCount <= 0){
                int a = timeCount*(-1);
                if(a <= arrStcCustomer[i].time){
                    i += 2;
                    puts(arrStcCustomer[i].name);
                } else {
                    puts(arrStcCustomer[i].name);
                }
            }
        }
    }
}