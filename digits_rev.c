#include <stdio.h>
 
int main()
{
   int p, rev = 0;
 
   printf("Enter a number to reverse\n");
   scanf("%d", &p);
 
   while (p != 0)
   {
      rev = rev * 10;
      rev = rev + p%10;
      p       = p/10;
   }
 
   printf("Reverse of entered number is = %d\n", rev);
 
   return 0;
}