package lab3;
/**
 * Date:18/03/2021
 * @author REDDY
 *Create a class containing a method to create the mirror image of a String. The method
should return the two Strings separated with a pipe(|) symbol
 */
import java.util.*;
public class MirrorImage

{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter The String:");
		String str=sc.nextLine();
		System.out.println("Mirror Image Of String:");
		System.out.println(getImage(str));
	}
	
	private static String getImage(String pStr)
	{
		StringBuffer buffer=new StringBuffer(pStr).reverse();
		 
		return pStr+"|"+buffer;
	}
}


