#include <stdio.h>
#include <string.h>
int main(){
    int num_color, count = 0;
    scanf("%d", &num_color);
    char color[num_color+1];
    scanf("%s", color);
    char color_st[num_color+1];
    strcpy(color_st, color);
    for (int i = 0; i < num_color; i++){
        if (color[i] == color[i+1] && color[i] == color[i+2]){
            if(color[i] == 'R')color[i+1] = 'G';
            else if(color[i] == 'G') color[i+1] = 'B';
            else if(color[i] == 'B') color[i+1] = 'R';
        }
        else if (color[i] == color[i+1] && color[i+2] == '\0'){
            if(color[i] == 'R') color[i+1] = 'G';
            else if(color[i] == 'G') color[i+1] = 'B';
            else if(color[i] == 'B') color[i+1] = 'R';
        }
        else if(color[i] == color[i+1]){
            if(color[i] == 'R'){
                if(color[i+2] == 'G') color[i+1] = 'B';
                else if(color[i+2] == 'B') color[i+1] = 'G';
            }
            else if(color[i] == 'G'){
                if(color[i+2] == 'R') color[i+1] = 'B';
                else if(color[i+2] == 'B') color[i+1] = 'R';
            }
            else if(color[i] == 'B'){
                if(color[i+2] == 'R') color[i+1] = 'G';
                else if(color[i+2] == 'G') color[i+1] = 'R';
            }
        }
    }

    for (int i = 0; i < num_color; i++){
        if(color_st[i] != color[i]) count++;
    }
    
    printf("%d\n%s",count, color);
}