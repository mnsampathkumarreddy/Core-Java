package lab1;
/**
 * Date:17/03/2021
 * @author REDDY
 *Traffic Signals To Indicate the status (Ready, Go, Stop)
 */
import java.util.*;
public class TrafficLight {

	public static void main(String[] args) {
		System.out.println("Enter any one of them (RED,YELLOW,GREEN):");
		Scanner in=new Scanner(System.in);
		String exp=in.nextLine();
		String msg;
		switch(exp)
		{
		case "RED":
			msg="STOP";
			break;
		
		case "YELLOW":
			msg="READY";
			break;
		case "GREEN":
			msg="GO";
			break;
		default:
			msg="INVALID INPUT";
			break;
		}
		 System.out.println(msg);

	}

}
