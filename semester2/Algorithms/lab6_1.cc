#include <iostream>
#include <limits.h> 
#include <stdio.h> 
using namespace std;

int min_distance(int dist[], bool sptSet[],int n) { 
	int min = INT_MAX, min_index=0; 
	for (int v = 0; v < n; v++) 
		if (sptSet[v] == false && dist[v] <= min) 
			min = dist[v], min_index = v; 
	return min_index; 
} 


void p_Solution(int dist[],int dest) { 
  if(dist[dest]==INT_MAX || dist[dest]<0){
    cout << -1 << endl;
  }
  else{
    cout << dist[dest] << endl;
  }
} 

void check_space(int **g,int n, int b,int dest) { 
	int dist[n]; 
	bool sptSet[n]; 
	for (int i = 0; i < n; i++) 
		dist[i] = INT_MAX, sptSet[i] = false; 
	dist[b] = 0; 

	for (int count = 0; count < n - 1; count++) { 
		int u = min_distance(dist, sptSet,n); 
		sptSet[u] = true; 
 
		for (int v = 0; v < n; v++)  
			if (!sptSet[v] && g[u][v] && dist[u] != INT_MAX 
				&& dist[u] + g[u][v] < dist[v]) 
				dist[v] = dist[u] + g[u][v]; 
	} 
	p_Solution(dist,dest); 
} 

int main() {
  int v,e,s,d,m,b,f;
  int **x;
  cin>>v>>e;
  int *g[v];
  x = g;
  for(int i = 0; i < v; i++){
    g[i]  = new int[v];
  }
  
  for(int i = 0; i < e; i++){
    cin>>s>>d>>m;
    g[s][d] = m;
    g[d][s] = m;
  }
  cin>>b>>f;
  check_space(x,v,b,f);
  
}