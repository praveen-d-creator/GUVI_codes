import java.io.*;
import java.util.*;
class Prime
{
public static void main(String[] args)
{
int start,m,n,p=0;
Scanner in=new Scanner(System.in);
System.out.println("Enter the start values");
start=in.nextInt();
System.out.println("Enter the end values");
end=in.nextInt();
for(int i=start;i<=end;i++)
{
n=1;
for(int j=2;j<=i;j++)
{
if(i%j==0)
{
n++;
}
}
if(n==2)
{
p++;
}
}
System.out.println(p);
}
}