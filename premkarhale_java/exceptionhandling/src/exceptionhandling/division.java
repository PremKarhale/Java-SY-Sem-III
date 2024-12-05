package exceptionhandling;

public class division {
	public static void main(String[] args) {
		
	try{
		int a=4; 
	
	int b=0;
	int c=a/b;
	System.out.println("result is :"+c);
	
	}
	catch(Exception e){
		System.out.println("incorrect division ");
		System.out.println("error type : "+e);
	}

	}

}
