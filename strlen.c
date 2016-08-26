#include <stdio.h>
#include<conio.h> 
void main()
{
 char str[50];
 int  i, len = 0;
 
 printf("Enter a string\n");
 gets(str);
 
 for (i=0; str[i] != '\0'; i++)
 {                                
  len++;                    
 }
  printf("The length of %s =%d\n", str, len);
getch();
}