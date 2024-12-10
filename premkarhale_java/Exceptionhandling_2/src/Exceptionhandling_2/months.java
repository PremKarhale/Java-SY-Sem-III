package Exceptionhandling_2;
import java.util.Scanner;
public class months {
	public void MONTHSINYEAR() throws NumberFormatException{
		
		int a;
		System.out.println("enter the no of month ");
		Scanner sc =new Scanner(System.in);
		a=sc.nextInt();
		if(a>12) {
			throw new NumberFormatException();
			
		}
		else {
			System.out.println("month no is valid");
		}
		
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			months obj=new months();
			obj.MONTHSINYEAR();
			}
		catch(Exception e) {
			System.out.println("error type is :"+e);
			
		}
		finally {
			System.out.println("programm ends..");
		}
		

	}

}
