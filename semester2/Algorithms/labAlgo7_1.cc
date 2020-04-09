#include <iostream>
#include <algorithm>
#include <cstring>
#include <queue>

using namespace std;

#define SIS std::ios::sync_with_stdio(false),cin.tie(0),cout.tie(0);

char str[100][100][100];
int aab[100][100][100];
int a, b, c, ax, ay, az, bx, by, bz;
int dr[6][3] = {{0,0,1}, {0,0,-1}, {-1,0,0}, {1,0,0}, {0,1,0}, {0,-1,0}};

struct Node {
  int x, y, z;
};

bool bfs() {
  queue<Node> qee;
  Node n;
  n.x=ax; n.y=ay; n.z = az;
  qee.push(n);
  aab[n.x][n.y][n.z] = 1;
  while(!qee.empty()) {
    Node node=qee.front();
    qee.pop();
    for(int i = 0; i < 6; i++) {
      int dx = node.x+dr[i][0];
      int dy = node.y+dr[i][1];
      int dz = node.z+dr[i][2];

      if(dx < 0 || dy < 0 || dz < 0 || dx >= a || dy >= b || dz >= c || aab[dx][dy][dz] || str[dx][dy][dz] == 'X') continue;

      aab[dx][dy][dz]=aab[node.x][node.y][node.z]+1;
      
      if(dx == bx && dy == by && dz == bz) return true;
            n.x = dx; n.y = dy; n.z = dz;
            qee.push(n);
        }
    }
    return false;
}

int main() {
  cin >> b >> c >>  a;
  for(int i = 0;i < a; i++)
    for(int j = 0; j < b; j++)
      for(int k = 0; k < c; k++) {
        cin >> str[i][j][k];
        if(str[i][j][k] == 'S') { ax = i; ay = j; az = k; }
        else if(str[i][j][k] == 'M') { bx = i; by = j; bz = k; }
      }
  memset(aab,0,sizeof(aab));
  if(bfs()) cout << aab[bx][by][bz]-1 << '\n';
}