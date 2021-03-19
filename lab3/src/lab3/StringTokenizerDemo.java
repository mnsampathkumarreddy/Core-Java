package lab3;
/**
 * Date:18/03/2021
 * @author REDDY
 *Write a Java program that reads a line of integers and then displays each integer and the
sum of all integers. (Use String Tokenizer class)
 */
import java.util.*;
 class StringTokenizerDemo
 {

	public static void main(String[] args)
	{
		int sum=0,n;
		Scanner sc = new Scanner(System.in);
        System.out.println("Enter integers with one space gap:");
        String s = sc.nextLine();
		
        StringTokenizer st = new StringTokenizer(s, " ");
        while (st.hasMoreTokens()) {
            String temp = st.nextToken();
            n = Integer.parseInt(temp);
            System.out.println(n);
            sum = sum + n;
        }
        System.out.println("sum of the integers is: " + sum);
        sc.close();
		
		
		
		
		
	}

}
