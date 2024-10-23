package assignment6;
import java.util.Scanner;
public class ExceptionHandlingDemo {
 public static void main(String[] args) {
 Scanner scanner = new Scanner(System.in);
 int num1 = 0, num2 = 0;
 
 try {

 System.out.print("Enter Num1: ");
 num1 = Integer.parseInt(scanner.nextLine()); 
 System.out.print("Enter Num2: ");
 num2 = Integer.parseInt(scanner.nextLine());
 // Performing division
 int result = num1 / num2; // May throw ArithmeticException
 System.out.println("The result of division is: " + result);
 
 int[] arr = new int[1];
 System.out.println(arr[2]);
 
 } catch (NumberFormatException e) {
 System.out.println("Number Format Exception: Please enter valid integers.");
 } catch (ArithmeticException e) {
 System.out.println("Arithmetic Exception: Cannot divide by zero.");
 } catch (ArrayIndexOutOfBoundsException e) {
 System.out.println("Array Index Out of Bounds Exception: Accessed invalid array index.");
 } finally {
 System.out.println("Program execution completed.");
 }
 scanner.close();
 }
}
