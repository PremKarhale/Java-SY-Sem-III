package filehandling;
import java.io.File;
import java.util.Scanner;

public class filehandling {
	public static void main(String[] args) {
	/*	File myfile=new File("chwh111.txt");
	 try {
		 myfile.createNewFile();
	 }
	 catch(Exception e) {
		 System.out.println("my file is not created ");
		 e.printStackTrace();
 
	 }
	 
		try {
            FileWriter fileWriter = new FileWriter("cwh111.txt"); // Create FileWriter object
            fileWriter.write("It is my first file");             // Write to the file
            fileWriter.close();                                  // Close the file
            System.out.println("File written successfully!");
        } catch (IOException e) {
            System.out.println("An error occurred: " + e.getMessage());
        }*/
		
		int marks[]=new int[3];
		marks[1]=98;
		marks[2]=24;
		marks[3]=46;
		try {
			Scanner sc=new Scanner(System.in);
			System.out.println("enter the no index of array");
			int a=sc.nextInt();
			System.out.println("enter the no you want to divide with:");
			int b=sc.nextInt();
			
			System.out.println("array index is :"+marks[a]);	
			System.out.println("no divided by array is :"+marks[a]/b);
			
		}
		catch(ArithmeticException e){
			System.out.println("no you have chossen is invalid : \nchosse another no.:");
			System.out.println(e);
			
		}
		catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("invalid out of bound");
			System.out.println(e);
			
		}
		catch(Exception e) {
			System.out.println(e);
		}
		
		
		
		
		
    }
		}
	 
	



