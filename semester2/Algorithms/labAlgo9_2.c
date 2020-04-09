#include <stdio.h>
int main(){
    int n, m, t;
    scanf("%d %d %d", &n, &m, &t);
    int company[10][10] = {0}, num_company, num_student;
    for (int i = 0; i < t; i++){
        scanf("%d %d", &num_student, &num_company);
        company[num_company][num_student] = 1;
    }

    for (int i = 0; i < m; i++){
        for (int j = 0; j < n; j++){
            if(company[i][j])
        }
        
        
    }
    
    
}