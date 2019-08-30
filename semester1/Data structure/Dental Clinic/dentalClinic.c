#include <stdio.h>
#include <stdlib.h>
#include <string.h>

typedef struct struct_Customer{
    char name[41];
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

void appendHeadCustomerList(StructCustomer *customer, CustomerList *s){
    if(s->head == NULL){
        s->head = customer;
    }else{
        customer->next = s->head;
        s->head = customer;
    }
}

void deleteStructCustomer(char str[], CustomerList *s){
    StructCustomer *pCurr = s->head;
    StructCustomer *pPrev = NULL;
    StructCustomer *pTemp;
    while (s->head != NULL){
        if(strcmp(pCurr->name, str) == 0){
			if (pCurr == s->head)
				s->head = pCurr->next;
			else
				pPrev->next = pCurr->next;
			//free(pCurr);
        }else{
			pPrev = pCurr;
			pCurr = pCurr->next;
        }
    }
    
}

void deleteCustomer(int num, CustomerList *s){
    char str[41];
    //getchar();
    for(int i = 0; i < num; i++){
        getchar();
        gets(str);
        //puts(str);
        deleteStructCustomer(str, s);
    }
}

void cutStr(char str[], StructCustomer *customer){
    char newStr[41];
    int time = 0;
    int booLean = 0;
    int j = 0;
    for(int i = 0; str[i] != '\0'; i++){
        if(str[i] == ' '){
            i += 5;
            booLean = 1;
        }else{
            if(booLean){
                customer->time = atoi(&str[i]);
                booLean = 0;
            }else{
                customer->name[j] = str[i];
                j++;
            }
        }
    }
   // printf("str = %s ,time = %d\n", str, time);
    //*customer->name = newStr;
    //customer->time = time;
}

void inputCustomer(int line, StructCustomer *customer, CustomerList *s){
    char str[50];
    //getchar();
    for(int i = 0; i < line; i++){
        customer = newStructCustomer();
        getchar();
        gets(str);
        cutStr(str, customer);
        //puts(str);
        appendHeadCustomerList(customer, s);
    }
}

void printCustomer(int time, CustomerList *s){
    StructCustomer *pCurr = s->head;

    while (pCurr != NULL){
        time -= pCurr->time;
        if(time > 0){
            pCurr = pCurr->next;
        }else {//time <= 0
            printf("%s\n", pCurr->name);
            break;
        }
    }
    
}

int main(void){
    StructCustomer *customer;
    CustomerList *s;
    int numCustomer, numCustomerOut, time;
    scanf("%d", &numCustomer);
    inputCustomer(numCustomer, customer, s);

    scanf("%d", &numCustomerOut);
    deleteCustomer(numCustomerOut, s);

    scanf("%d", &time);
    printCustomer(time, s);
    return 0;
}