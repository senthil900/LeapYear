import java.util.Scanner;

public class LeapYear {
	public static void main(String args[]) {
		System.out.println("Enter a Year :");
		Scanner s=new Scanner(System.in);
		int a=s.nextInt();
		if(a%4==0 && a%100==0 || a%400==0 ) {
			System.out.println(" leap year");
			
		}
		else {
			System.out.println("not a leapyear");
		}
		
	}

}