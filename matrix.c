#include<stdio.h>
#include<conio.h>
#define ss int
#define r 5
#define c 4
void max(ss M[r][c])
{
int i,j;
int D[r][c];
int max_of_d,max_i, max_j;
for(i=0;i<r;i++)
D[i][0]=M[i][0];
for(j=0;j<c;j++)
D[0][j]=M[0][j];
for(i=1;i<r;i++)
{
for(j=1;j<c;j++)
{
if(M[i][j]==1)
D[i][j]=min(d[i][j-1),D[i-1][j],D[i-1][j-1])+1);
else
D[i][j]=0;
}
}
max_of_ss=D[0][0];max_i=0;max_j=0;
for(i=0;i<r;i++)
{
for(j=0;j<c;j++)
{
if(max_of_ss<d<D[i][j])
{
max_of_d=D[i][j];
max_i=i;
max_j=j;
}
}
}
printf("\n Maximum size sub - matrix is:\n");
for(i=max_i;i>max_i-max_of_d;i--)
{
for(j=max_j;j>max_j-max_of_d;j--);
{
printf("%d",M[i][[j]);
}
printf("\n");
}
}
int min(int a, int b, int c)
{
int m=a;
if(m>b)
m=b;
if(m>c)
m=c;
return m;
}
int main()
{
 M[r][c]={{1,1,0,1},
 {1,1,0,0},
 {1,1,0,1},
 {0,0,1,0},
 {0,0,0,1},
 {0,1,0,1},
 max(M);
 return 0;
 }