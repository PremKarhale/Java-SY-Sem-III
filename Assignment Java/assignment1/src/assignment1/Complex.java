package assignment1;
import java.util.Scanner;

public class Complex {
    private double real;
    private double imaginary;

    // Default constructor - used to initialize the data members of the class
    public Complex() {
        this.real = 0;
        this.imaginary = 0;
    }

    // Parameterized constructor - used to initialize the data members of the class with the given values
    public Complex(double real, double imaginary) {
        this.real = real;
        this.imaginary = imaginary;
    }

    // Addition of two complex numbers
    public void add(Complex c1, Complex c2) {
        double realPart = c1.real + c2.real;
        double imaginaryPart = c1.imaginary + c2.imaginary;
        System.out.println("Addition of two complex numbers: " + realPart + " + " + imaginaryPart + "i");
    }

    // Subtraction of two complex numbers
    public void subtract(Complex c1, Complex c2) {
        double realPart = c1.real - c2.real;
        double imaginaryPart = c1.imaginary - c2.imaginary;
        System.out.println("Subtraction of two complex numbers: " + realPart + " + " + imaginaryPart + "i");
    }

    // Multiplication of two complex numbers
    public void multiplication(Complex c1, Complex c2) {
        double realPart = c1.real * c2.real - c1.imaginary * c2.imaginary;
        double imaginaryPart = c1.imaginary * c2.real + c1.real * c2.imaginary;
        System.out.println("Multiplication of two complex numbers: " + realPart + " + " + imaginaryPart + "i");
    }

    // Division of two complex numbers
    public void division(Complex c1, Complex c2) {
        if (c2.real != 0 || c2.imaginary != 0) {
            double denominator = c2.real * c2.real + c2.imaginary * c2.imaginary;
            double realPart = (c1.real * c2.real + c1.imaginary * c2.imaginary) / denominator;
            double imaginaryPart = (c1.imaginary * c2.real - c1.real * c2.imaginary) / denominator;
            System.out.println("Division of two complex numbers: " + realPart + " + " + imaginaryPart + "i");
        } else {
            System.out.println("Division by zero is not possible");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the real part of the first complex number: ");
        double real1 = sc.nextDouble();
        System.out.println("Enter the imaginary part of the first complex number: ");
        double imaginary1 = sc.nextDouble();
        Complex firstComplexNumber = new Complex(real1, imaginary1);
        System.out.println("Enter the real part of the second complex number: ");
        double real2 = sc.nextDouble();
        System.out.println("Enter the imaginary part of the second complex number: ");
        double imaginary2 = sc.nextDouble();
        Complex secondComplexNumber = new Complex(real2, imaginary2);
        sc.close();

        Complex result = new Complex();
        result.add(firstComplexNumber, secondComplexNumber);
        result.subtract(firstComplexNumber, secondComplexNumber);
        result.multiplication(firstComplexNumber, secondComplexNumber);
        result.division(firstComplexNumber, secondComplexNumber);
    }
}
