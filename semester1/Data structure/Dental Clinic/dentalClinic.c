#include <stdio.h>
#include <string.h>

typedef struct customer_{
    char name[41];
    int time;
} StructCustomer;

int inputNumcustomer(){
    int num;
    scanf("%d", &num);
    return num;
}


void intputArrStcCustomer(StructCustomer arrStcCustomer, char *arr){
    int boolean = 0;
    int j = 0;
    for(int i = 0; arr[i] != '\0'; i++){
        if(arr[i] == ' ') {
            i += 5;
            boolean = 1;
        }
        else {
            if(boolean) {
                arrStcCustomer.time = atoi(arr[i]);
            } else {
                arrStcCustomer.name[j] = arr[i];
                j++;
            }
        }
    }
}

int skipStcCustomer(char *arrName, StructCustomer arrStruct[], int out){
    for(int i = 0; i < out; i++){
        if(strcmp(arrName, arrStruct[i].name) == 0){
            return i;
        }
    }
}

int main(){
    int numcustomer, numCustomerOut;
    
    numcustomer = inputNumcustomer();

    StructCustomer arrStcCustomer[numcustomer];

    //printf("%d\n", numcustomer);
    getchar();//customer_in
    for(int i = 0; i < numcustomer; i++){
        char arr[58];
        getchar();
        gets(arr);
        intputArrStcCustomer(arrStcCustomer[i], arr);
        //puts(arr);
    }

    numCustomerOut = inputNumcustomer();//customerOut
    int arrIndexCustomerOut[numCustomerOut];

    getchar();
    for(int i = 0; i < numCustomerOut; i++){
        char arrNameOut[41];
        getchar();
        gets(arrNameOut);
        arrIndexCustomerOut[i] = skipStcCustomer(arrNameOut, arrStcCustomer, numCustomerOut);
    }

    int timeCount;
    scanf("%d", timeCount);
    for(int i = 0; i < numcustomer; i++){
        for(int j = 0; j < numCustomerOut; j++){
            if(arrIndexCustomerOut[j] == i){
                break;
            }
        }
    }
}