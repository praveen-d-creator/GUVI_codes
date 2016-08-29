#include<stdio.h>
#include<conio.h>
void main()
{
int arr[10],brr[10][10],e=0,m,i,j,n,t=0;
scanf("%d %d",&m,&n);
for(i=0;i<n*m;i++)
{
scanf("%d",&arr[i]);
}
for(i=0;i<m*n;i++)
{
for(j=i+1;j<n*m;j++)
{
if(arr[i]>arr[j])
{
t=arr[i];
arr[i]=arr[j];
arr[j]=t;
}
}
}
for(i=0;i<m;i++)
{
for(j=0;j<n;j++)
{
brr[i][j]=arr[e];
k++;
}
}
for(i=0;i<m;i++)
{
for(j=0;j<n;j++)
{
printf(" %d",brr[i][j]);
}
printf("\n");
}
getch();
}