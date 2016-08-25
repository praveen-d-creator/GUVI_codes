import java.util.*;
import java.lang.*;
import java.io.*;
 

{
	public static void main (String[] args) throws java.lang.Exception
	{
		
		int arr[]=new int[]{5,3,1,6,4};
		int h=arr.length;
		System.out.println("enter the nos");
		for(int a=0;i<h;a++)
		{
			for(int j=i+1;j<h;j++)
			{
 
				if(arr[j]<arr[a])
				{
					System.out.print(arr[j]);
					break;
				}
				else 
				{
					System.out.print(-1);
					break;
				}
 
			}
			if(a==h-1)
			{
				System.out.print(-1);
				break;
			}
		}
	}
}