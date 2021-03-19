package lab2;
/**
 * Date:17/03/2021
 * @author REDDY
 *Write a Java program to convert an ArrayList to an array
 */
import java.util.ArrayList;
import java.util.Arrays;

public class ArrayListToArray 
{
	public static void main(String[]args)
	{
		ArrayList<String> list=new ArrayList<String>();    
	      list.add("Mango");  
	      list.add("Apple");    
	      list.add("Banana");    
	      list.add("Grapes");    
	     
	      System.out.println(list);  
	      Object[] array = list.toArray();
	    
	      
	      for(Object o : array) 
	      {
	            String s = (String) o;
	             
	            System.out.println(s);
	     
		
	      }
		
		
		
		
		
	}
	

}
