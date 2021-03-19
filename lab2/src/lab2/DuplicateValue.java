package lab2;
/**
 * Date:16/03/2021
 * @author REDDY
 *To find the duplicate values in the given array
 */
import java.util.*;

public class DuplicateValue
{

	public static void main(String[] args) 
	{
		int n,i,j;
		
		Scanner sc=new Scanner (System.in);
		System.out.println("ENTER NO. OF ELEMENTS TO STORE:");//Enter the no.of  the elements from use
		
		n=sc.nextInt();
		
		int[]array=new int[n];
		
		System.out.println("ENTER THE ELEMENTS IN THE ARRAY");//Reading inputs into array
	
		for(i=0;i<n;i++)
		{
			array[i]=sc.nextInt();
		}
		
		int count=0;	
		String output=" ";
		System.out.println("Duplicate Values In Array:");//
		
		for(i=0;i<array.length;i++)
		{
			count=0;
			for(j=i+1;j<array.length;j++)
			{
				if (array[i]==array[j])
				{
					count++;
					break;
				 }
			}		
			if (count==1)
			{
				if(output.contains(Integer.toString(array[i]))==false) 
			
					output+=Integer.toString(array[i])+",";
			}
		
	
		}
		System.out.println(output.substring(0,output.length()-1));		
	}
}

		
	


