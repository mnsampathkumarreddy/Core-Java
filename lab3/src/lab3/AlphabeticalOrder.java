package lab3;
/**
 * Date:18/03/2021
 * @author REDDY
 *
 */
import java.util.Arrays;

public class AlphabeticalOrder 
{

	static boolean isAlphabaticOrder(String s)  
	    {  
	        // length of the string  
	        int n = s.length();  
	        
	        // create a character array  
	        // of the length of the string  
	        char c[] = new char [n];  
	        
	        // assign the string  
	        // to character array  
	        for (int i = 0; i < n; i++) {  
	            c[i] = s.charAt(i);  
	        }  
	        
	        // sort the character array  
	        Arrays.sort(c);  
	        
	        // check if the character array  
	        // is equal to the string or not  
	        for (int i = 0; i < n; i++)  
	            if (c[i] != s.charAt(i))   
	                return false;  
	                
	        return true;      
	    }  
	      
	static boolean isAlphabaticOrder(String s)  
    {  
        // length of the string  
        int n = s.length();  
        
        // create a character array  
        // of the length of the string  
        char c[] = new char [n];  
        
        // assign the string  
        // to character array  
        for (int i = 0; i < n; i++) {  
            c[i] = s.charAt(i);  
        }  
        
        // sort the character array  
        Arrays.sort(c);  
        
        // check if the character array  
        // is equal to the string or not  
        for (int i = 0; i < n; i++)  
            if (c[i] != s.charAt(i))   
                return false;  
                
        return true;      
    }  
	
	
	public static void main(String args[]) 
    { 
        String s = "aabbbcc";  
          
        // check whether the string is  
        // in alphabetical order or not  
        if (isAlphabaticOrder(s))  
           System.out.println( "Given String is POSITIVE STRING");  
        else
            System.out.println("Given String is NOT POSITIVE STRING"); 
		
		
	}

}
