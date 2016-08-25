import java.lang.*;
public class Palindrome
{
public static void main(String[] args)
{

int n=Integer.parseInt(args[0]);
int num=n;

int sum=0;
while(n>0)
{
sum+=n%10;
n=n/10;
}
if(sum==num)
{
System.out.println(" It is a palindrome");
}
else
{
System.out.println("It is not a palindrome");
}
}
}