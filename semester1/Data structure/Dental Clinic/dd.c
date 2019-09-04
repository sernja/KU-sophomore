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
        // printf("%s  %d\n", arrStcCustomer[i].name, arrStcCustomer[i].time);
    }

    numCustomerOut = inputNumcustomer();//customerOut
    StructCustomer arrNameOut[numcustomer-numCustomerOut];
    StructCustomer arrOut[numCustomerOut];
    getchar();
    for(int i = 0; i < numCustomerOut; i++){
        char arrNameOut[20];
        getchar();
        gets(arrNameOut);
        strcpy(arrOut[i].name, arrNameOut);
    }
    for (int i = 0; i < numCustomerOut; i++){
        for(int j = 0; j < numcustomer; j++){
            if(strcmp(arrOut[i].name, arrStcCustomer[j].name) == 0){
                strcpy(arrStcCustomer[j].name, "-");
            }
        } 
    }


    int timeCount;
    int count = -1;
    scanf("%d", &timeCount);
    for(int i = 0; i < numcustomer; i++){
        if(strcmp(arrStcCustomer[i].name,"-") == 0){
            count += 0; 
        }else{
            count += arrStcCustomer[i].time;
            if (count > timeCount){
                printf("%s\n", arrStcCustomer[i].name);
            }
        }
    }
}