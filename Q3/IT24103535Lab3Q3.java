import java.util.Scanner;

public class IT24103535Lab3Q3{
	public static void main(String[]args){
		
		//declare variable 
		int rem ,price , not5000, not1000 , not500 , not200 , not100 , not50 , not20 , not10 , not5 , not2 ,not1 ;
		
		//creating Scanner class
		Scanner input = new Scanner (System.in);
		
		//get user input
		System.out.print("enter the Rupee amount : ");
		price = input.nextInt();
		
		//calculations
		
		not5000 = price/5000; //2754/5000 = 0 quotient
		price = price%5000; //2754%5000= 0 remainder
		
		not1000 = price/1000; // 2754/1000 = 2
		price = price%1000; // 2754%100 = 754
		
		not500 = price/500; // 754/500 = 1
		price = price%500; //754%500 = 254
		
		not200 = price/200;
		price = price%200;
		
		not100 = price/100;
		price = price%100;
		
		not50 = price /50;
		price = price%50;
		
		not20 = price /20;
		price = price %20;
		
		not10 = price / 10;
		price = price%10;
		
		not5 = price / 5;
		price = price%5;
		
		not2 = price /2;
		price = price %2;
		
		not1= price/1;
		price = price%1 ;
		
		// print output
		System.out.println("5000 notes : "  + not5000 );
		System.out.println("1000 notes : " + not1000 );
		System.out.println("500  notes  : "  + not500 );
		System.out.println("200  notes  : "  + not200 );
		System.out.println("100  notes  : "  + not100 );
		System.out.println(" 50  notes  : "  + not50 );
		System.out.println(" 20  notes  : "  + not20 );
		System.out.println(" 10  notes  : "  + not10 );
		System.out.println(" 05  notes  : "  + not5 );
		System.out.println(" 02  notes  : "  + not2 );
		System.out.println(" 01  notes  : "  + not1 );
		
		
	}
}