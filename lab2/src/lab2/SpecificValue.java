package lab2;
/**
 * Date:17/03/2021
 * @author REDDY
 *Write a Java program to test if an array contains a specific value.
 */

import java.util.Scanner;

public class SpecificValue 
{
	public static void main(String agrs[])	
	{
		int n,i;
		Scanner sc=new Scanner (System.in);
		System.out.println("ENTER NO. OF ELEMENTS TO STORE:");//Enter the no.of  the elements from use
		
		n=sc.nextInt();
		
		int[]array=new int[n];
		
		System.out.println("ENTER THE ELEMENTS IN THE ARRAY");//Reading inputs into array
		
		for(i=0;i<n;i++)
		{
			array[i]=sc.nextInt();
		}
		
		System.out.println("ENTER THE VALUE TO CHECK:");
		int num = sc.nextInt();
		boolean status=false;
		
		for(int j1 = 0; j1<array.length; j1++)
		{
			if(num == array[j1])
			{
				status=true;
				
				break;
			}

		}
		if (status==true)
		{
			System.out.println("Array contains the given element:"+num);
		}
		else
		{
			System.out.println("Array not contains the given element:"+num);
		}
	}
}
