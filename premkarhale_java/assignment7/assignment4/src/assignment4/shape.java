package assignment4;
import java.util.Scanner; 
//Abstract base class 
abstract class Shape { 
//Attributes for dimensions 
double dimension1; 
double dimension2; 
//Method to input dimensions 
public void inputDimensions() { 
Scanner scanner = new Scanner(System.in); 
System.out.print("Enter the first dimension: "); 
dimension1 = scanner.nextDouble(); 
System.out.print("Enter the second dimension: "); 
dimension2 = scanner.nextDouble(); 
} 
//Abstract method to compute area 
public abstract double computeArea(); 
} 
//Derived class for Triangle 
class Triangle extends Shape { 
//Implement computeArea for Triangle 
@Override 
public double computeArea() { 
// Area of triangle = 0.5 * base * height 
return 0.5 * dimension1 * dimension2; 
} 
} 
//Derived class for Rectangle 
class Rectangle extends Shape { 
//Implement computeArea for Rectangle 
@Override 
public double computeArea() { 
// Area of rectangle = width * height 
return dimension1 * dimension2; 
} 
} 
class Assign_4 { 
public static void main(String[] args) { 
Scanner scanner = new Scanner(System.in); 
Shape shape = null; 
System.out.println("Choose the shape (1 for Triangle, 2 for Rectangle): "); 
int choice = scanner.nextInt(); 
// Create an instance of the appropriate shape based on user choice 
switch (choice) { 
case 1: 
shape = new Triangle(); 
break; 
case 2: 
shape = new Rectangle(); 
break; 
default: 
System.out.println("Invalid choice!"); 
System.exit(0); 
} 
// Input dimensions and calculate area 
shape.inputDimensions(); 
double area = shape.computeArea(); 
System.out.println("The area of the shape is: " + area); 
} 
} 
