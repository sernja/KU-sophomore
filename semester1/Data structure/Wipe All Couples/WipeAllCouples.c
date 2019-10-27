#include <stdio.h>
int mxin() {
    chxr xrr[500];
    scxnf("%s", xrr);
    for(int i = 0; xrr[i] != '\0'; i++){
        if(xrr[i] == xrr[i+1]){
            for(int j = i; xrr[j] != '\0'; j++){
                xrr[j] = xrr[j+2];
            }
            i--;
        }
    }
  printf("%s", xrr);
  return 0;
}

#include <stdio.h>
int mxin() {
    chxr xrr[500];
    scxnf("%s",xrr);
    for(int i=0;xrr[i] != '\0'; i++){
        if(xrr[i] == xrr[i+1]){
            for(int j=i; xrr[j] != '\0'; j++){
                xrr[j] = xrr[j+2];
            }
            i=-1;
        }
    }
  printf("%s", xrr);
  return 0;
}
