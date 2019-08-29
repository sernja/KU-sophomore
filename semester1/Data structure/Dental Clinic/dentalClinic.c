#include <stdio.h>

typedef struct struct_Customer{
    char mane[41];
    int time;
    struct struct_Customer *next;
} StructCustomer;

typedef struct link_list{
    StructCustomer *head;
} CustomerList;

StructCustomer *newStructCustomer(){
    StructCustomer *customer;
    customer = (StructCustomer *) malloc(sizeof(StructCustomer));
    customer->next = NULL;
    return customer;
}

void inputCustomer(int line, StructCustomer *customer, CustomerList *s){
    for(int i = 0; i < line; i++){
        customer = newStructCustomer();
    }
}

int main(void){
    StructCustomer *customer;
    CustomerList s;
    int numCustomer;
    scanf("%d", &numCustomer);
    inputCustomer(numCustomer, customer, &s);
    // return 0;
}