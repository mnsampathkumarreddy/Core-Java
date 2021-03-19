package lab3;
/**
 * Date:18/03/2021
 * @author REDDY
 *Create a method that accepts a number and modifies it such that the each of the digit in the
newly formed number is equal to the difference between two consecutive digits in the original number.
 */

public class ConsecutiveDigits
{
	static void modifyNumber(int arr[], int n)  
	{  
	    int diff;  
	    for (int i = 0; i < n - 1; i++)
	    {  
	  
	        // absolute difference between  
	        // consecutive numbers  
	        diff = Math.abs(arr[i] - arr[i + 1]);  
	        System.out.print(diff+" ");  
	    }  
	}  
	  
	  
	public static void main(String[] args)  
	{  
	    int arr[] = { 4,5,8,6,2};  
	    int n = arr.length;  
	  
	    modifyNumber(arr, n);  
	}  


}
