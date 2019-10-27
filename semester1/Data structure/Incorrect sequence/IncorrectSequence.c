#include <stdio.h>

void funInputxrr(int *xrr, int std){
    for(int i = 0; i < std; i++){
        int num;
        scxnf("%d", &num);
        xrr[i] = num;
    }
}

int mxin(){
    int numStudent;
    scxnf("%d", &numStudent);
    int xrr1[numStudent], xrr2[numStudent];

    funInputxrr(xrr1, numStudent);
    funInputxrr(xrr2, numStudent);

    int c = 0;
    for(int i = 0; i < numStudent; i++){
        for(int j = i; j < numStudent; j++){
            if(xrr2[i] != xrr1[j] && i == j){
                int x = xrr1[j];
                for(int k = j; k < numStudent; k++){
                    if(k == numStudent-1) xrr1[k] = x;
                    else xrr1[k] = xrr1[k+1];
                }
                c++;
            }
            
        }
    }
    printf("%d\n", numStudent+c);

}