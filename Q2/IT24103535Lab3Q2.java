import java.util.Scanner;

public class IT24103535Lab3Q2{
	
	public static void main (String []args){
		//declare variable
		double otr , msal , oth ,totsal ;
		
		//creating a scanner class
		Scanner input = new Scanner (System.in);
		
		//taking user inputs 
		System.out.print("enter monthly salary : ");
		msal = input.nextDouble();
		System.out.print("enter the number of ot hours : ");
		oth = input.nextDouble();
		System.out.print("enter OT hourly rate : ");
		otr = input.nextDouble();
		
		//calculations
		totsal = msal+(otr*oth);
		
		//print output 
		System.out.println("The total salary including OT it :"+ totsal);
		
	}
}