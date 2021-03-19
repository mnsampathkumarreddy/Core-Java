package lab3;
/**
 * Date:18/03/2021
 * @author REDDY
 *Create a method to accept the date and print the duration in days, months and years with
regards to the current system date
 */
import java.util.Date; 
import java.time.Month; 
import java.time.LocalDate; 
import java.util.*;

class CurrentSystemDate 
{
	public static void getDayMonthYear(String date) 
	{
		 LocalDate currentDate = LocalDate.parse(date);
		 
		 int day = currentDate.getDayOfMonth(); 
		 
		 Month month = currentDate.getMonth(); 
		 
		 int year = currentDate.getYear(); 
		  
		 System.out.println("Day: " + day); 
	     System.out.println("Month: " + month); 
	     System.out.println("Year: " + year); 
	}
	
	public static void main(String args[]) 
    { 
        // Given Date 
       
		String date = "2020-07-18"; 
		//Scanner sc=new Scanner(System.in);
		//String date=sc.toString();
  
        // Function Call 
        getDayMonthYear(date); 
    } 

	    

	 
}
