import java.io.*;
import java.util.Scanner;
class Reverse
{
public static void main(String [] args)
{
String str;
System.out.println("enter the sentence");
Scanner sc=new Scanner(System.in);
str=sc.nextLine();
String str1[]=str.split(" ");
String w="";
for(int i=str1.length-1;i>=0;i--)
{
w +=str1[i]+" ";
}
System.out.println("reverse word");
System.out.println(w);
}
}
