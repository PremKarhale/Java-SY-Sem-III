package practice1;
import java.util.Scanner;

public class complex {
	double real;
	double imaginary;
	
	complex(){
		this.real=0;
		this.imaginary=0;
		
	}
	
	complex (double real,double imaginary){
		this.real=real;
		this.imaginary=imaginary;
	
	}
	
	public void add(complex c1,complex c2) {
		double real=c1.real+c2.real;
		double imaginary=c1.imaginary+c2.imaginary;
		System.out.println("Additation of two complex no are: "+real+"+"+imaginary+"i");
		
	}
	public void subtract (complex c1,complex c2) {
		double real=c1.real-c2.real;
		double imaginary=c1.imaginary-c2.imaginary;
		System.out.println("subtraction of two complex no are : "+real+"+"+imaginary+"i");
		
		
	}
	public void multiplicaton(complex c1,complex c2) {
		double real = c1.real*c2.real-c1.imaginary*c2.imaginary;
		double imaginary =c1.imaginary*c2.real+c2.imaginary*c1.real;
		System.out.println("multiplacation of two complex no are: "+real+"+"+imaginary+"i");
		
		
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner Sc=new Scanner (System.in);
		System.out.println("Enter the firt real no");
		double real1=Sc.nextDouble();
	    System.out.println("Enter the first imaginary no: ");
	    double imaginary1 =Sc.nextDouble();
	    complex c1=new complex(real1,imaginary1);
	    System.out.println("Enter the secound real no:");
	    double real2=Sc.nextDouble();
	    System.out.println("Enter the secound imaginary no : ");
	    double imaginary2 =Sc.nextDouble();
	    complex c2= new complex (real2,imaginary2);
	    
	    complex result =new complex(   );
	    result.add(c1, c2);
	    result.subtract(c1, c2);
	    result.multiplicaton(c1, c2);

	}

}
