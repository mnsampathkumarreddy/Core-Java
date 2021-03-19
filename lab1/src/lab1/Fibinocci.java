package lab1;
/**
 * Date:17/03/2021
 * @author REDDY
 * To generate the fibinocci series upto number given by user 
 */
import java.util.*;
public class Fibinocci {
	static int fib0 =0,fib1=1,fib2=0;
	static void fib(int count)
	{
		if (count>0)
		{
			fib2=fib0+fib1;
			fib0=fib1;
			fib1=fib2;
			System.out.print(" "+fib2);
			fib(count - 1);
		}
	}
	
	
	

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in); 
		System.out.println("Count:");
		int count=input.nextInt();
		System.out.print(fib0 + " "+ fib1);
		fib(count-2);
		
	}
	

}
