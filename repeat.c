#include<stdio.h>
#include<conio.h>
void main()
{
int arr[100],n,count;
scanf("%d",&n);
for(int a=0;a<n;a++)
{
scanf("%d",&arr[i]);
}
for(a=0;a<n;a++)
{
count=0;
for(int b=0;b<n;b++)
{
if(arr[a]==arr[b])
count++;
}
if(count>1)
printf("%d",arr[a]);
break;
}
getch();
}