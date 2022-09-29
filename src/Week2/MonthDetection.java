package Week2;
import java.util.Scanner;

public class MonthDetection {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
	String[] month = new String[12];
    
	month[0]= ("January");
	month[1] = ("February");
	month[2] = ("March");
	month[3] = ("April");
	month[4]=
	
			
	
	
    Scanner scan = new Scanner (System.in);
    
    System.out.println("Enter number for month");
    System.out.println("Enter 1 for January");
    System.out.println("Enter 2 for February");
    System.out.println("Enter 3 for March");
    System.out.println("Enter 4 for April");
    System.out.println("Enter 5 for May");
    System.out.println("Enter 6 for June");
    System.out.println("Enter 7 for July");
    System.out.println("Enter 8 for August");
    System.out.println("Enter 9 for September");
    System.out.println("Enter 10 for October");
    System.out.println("Enter 11 for November");
    System.out.println("Enter 12 for December");  
    
   month = scan.nextInt();
   System.out.println(month);
   }

}
