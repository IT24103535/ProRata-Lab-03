import java.util.Scanner;

public class IT24103535Lab3Q1A{
	
	public static void main(String[]args){
		
		//declare variable
		double price , nkg, uprice;
		
		//creating a scanner class
		Scanner sc = new Scanner(System.in);
		
		//taking user input
		System.out.println("enter the price of 1 kilograms rice");
		uprice = sc.nextDouble();
		System.out.println("enter the kilograms you want");
		nkg = sc.nextDouble();
		
		//calculation
		price = uprice*nkg;
		
		
		//display price of kilogs
		System.out.println("price is : " + price );
		
		
	}
}
