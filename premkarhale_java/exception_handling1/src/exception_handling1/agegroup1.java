package exception_handling1;
import java.util.Scanner;
public class agegroup1  {
public static void main(String[] args) {
		  int age;
		  System.out.println("enter age:");
			Scanner sc=new Scanner(System.in);
			age=sc.nextInt();

	if(age>100) {
		try {
			throw new ArithmeticException("age is invalid ");
			
		}
		catch(Exception e){
			System.out.println(e.getMessage());
			System.out.println("error type:"+e.toString());
		}
	}
	else {
		System.out.println("you are in the correct age group ");
	}

}
}
