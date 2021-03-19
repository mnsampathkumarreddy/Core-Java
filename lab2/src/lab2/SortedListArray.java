package lab2;
/**
 * Date:17/03/2021
 * @author REDDY
 *Create a method that can accept an array of String objects and sort in alphabetical order.
 */

import java.util.*;
import java.util.Arrays;   
public class SortedListArray 
{
	public static void main(String args[])
	
	{
		int i,n;
		Scanner sc=new Scanner (System.in);
		System.out.println("ENTER NO. OF ELEMENTS TO STORE:");//Enter the no.of  the elements from use
		
		n=sc.nextInt();
		
		int[]array=new int[n];
		
		System.out.println("ENTER THE ELEMENTS IN THE ARRAY");//Reading inputs into array
		
		for(i=0;i<n;i++)
		{
			array[i]=sc.nextInt();
		}
		
		Arrays.sort(array);   
		
		
		System.out.println("ENTERED THE ELEMENTS  CAN BE SORTED:  ");  
		//prints array using the for loop  
		for (int j1 = 0; j1 < array.length; j1++)   
		{       
		System.out.println(array[j1]);   
		
		
		}
	}

}
