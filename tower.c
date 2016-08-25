#include <stdio.h>
#include<conio.h>
void tower(int n, char fromrod, char torod, char auxrod)
{
    if (n == 1)
    {
        printf("\n Move disk 1 from rod %c to rod %c", fromrod, torod);
        return;
    }
    tower(n-1, fromrod, auxrod, torod);
    printf("\n Move disk %d from rod %c to rod %c", n, fromrod, torod);
    tower(n-1, auxrod, torod, fromrod);
}

int main()
{
    int n = 4; // Number of disks
    tower(n, 'A', 'C', 'B');  
    return 0;
}