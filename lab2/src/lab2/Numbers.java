package lab2;
/**
 * Date:17/03/2021
 * @author REDDY
 *Write a program to Take 20 integer inputs from user and print the following:
1. number of positive numbers
2. number of negative numbers
3. number of odd numbers
4. number of even numbers
5. number of 0s
 */
import java.util.*;

public class Numbers 
{
	public static void main(String[] args)

	{
		Scanner s = new Scanner(System.in);
	    int[] z = new int[20];
	    int pos = 0;
	    int neg = 0;
	    int odd = 0;
	    int even = 0;
	    int zero = 0;
	    for(int i = 0;i<z.length;i++)
	    {
	      System.out.println("Print the value of z["+i+"]");
	      z[i] = s.nextInt();

	      if(z[i]>0)
	      {								//number of positive numbers
	        pos++;
	      }
	      else if(z[i]<0)
	      {								//number of negative numbers
	        neg++;
	      }
	      else
	      {								//number of  zeros
	        zero++;
	      }
	      if(z[i]%2==0)
	      {								// no.of even numbers
	        even++;
	      }
	      else
	      {								// no.of odd numbers
	          odd++;
	      }
	    }
	    
	      System.out.println("Positive : "+pos+"\nNegative : "+neg+"\nZero : "+zero+"\nodd : "+odd+"\neven : "+even);

	}

}
