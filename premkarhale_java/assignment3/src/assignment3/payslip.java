package assignment3;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
// Base class for all employees
class payslip {
 String empName; // Employee name
 String empId; // Employee ID
 String address; // Employee address
 String mailId; // Employee email ID
 String mobileNumber; // Employee mobile number
 // Constructor to initialize employee details
 payslip(String empName, String empId, String address, String mailId, String mobileNumber) 
{
 this.empName = empName;
 this.empId = empId;
 this.address = address;
 this.mailId = mailId;
 this.mobileNumber = mobileNumber;
 }
 // Method to display employee information
 void display() {
 System.out.println("Employee Name: " + empName);
 System.out.println("Employee ID: " + empId);
 System.out.println("Address: " + address);
 System.out.println("Mail ID: " + mailId);

 System.out.println("Mobile Number: " + mobileNumber);
 }
}
// Class for Programmer which extends Employee
class Programmer extends payslip {
 double basicPay; // Basic pay for the programmer
 // Constructor to initialize programmer details
 Programmer(String empName, String empId, String address, String mailId, String 
mobileNumber, double basicPay) {
 super(empName, empId, address, mailId, mobileNumber);
 this.basicPay = basicPay; // Set basic pay
 }
 // Calculate Dearness Allowance (DA)
 double calculateDA() {
 return 0.97 * basicPay;
 }
 // Calculate House Rent Allowance (HRA)
 double calculateHRA() {
 return 0.10 * basicPay;
 }
 // Calculate Provident Fund (PF)
 double calculatePF() {
 return 0.12 * basicPay;
 }
 // Calculate Staff Club Fund (SCF)

 double calculateStaffClubFund() {
 return 0.001 * basicPay;
 }
 // Calculate Gross Salary
 double calculateGrossSalary() {
 return basicPay + calculateDA() + calculateHRA() - calculatePF() - calculateStaffClubFund();
 }
 // Override display method to show salary details
 @Override
 void display() {
 super.display(); // Call parent display method
 System.out.println("------------------------------------------------------------------");
 System.out.println("| Emp ID | Basic Pay | DA | HRA | PF | SCF | Gross Salary |");
 System.out.println("|----------|-----------|--------|--------|--------|--------|--------------|");
 System.out.printf("| %-8s | %-9.2f | %-6.2f | %-6.2f | %-6.2f | %-6.2f | %-12.2f |%n",
 empId, basicPay, calculateDA(), calculateHRA(), calculatePF(), calculateStaffClubFund(), 
calculateGrossSalary());
 System.out.println("------------------------------------------------------------------");
 }
}
// Class for Team Lead which extends Employee
class TeamLead extends payslip {
 double basicPay; // Basic pay for the team lead

 // Constructor to initialize team lead details
 TeamLead(String empName, String empId, String address, String mailId, String 
mobileNumber, double basicPay) {
 super(empName, empId, address, mailId, mobileNumber);
 this.basicPay = basicPay; // Set basic pay
 }
 // Same salary calculation methods as Programmer
 double calculateDA() {
 return 0.97 * basicPay;
 }
 double calculateHRA() {
 return 0.10 * basicPay;
 }
 double calculatePF() {
 return 0.12 * basicPay;
 }
 double calculateStaffClubFund() {
 return 0.001 * basicPay;
 }
 double calculateGrossSalary() {
 return basicPay + calculateDA() + calculateHRA() - calculatePF() - calculateStaffClubFund();
 }
 // Override display method to show salary details
 @Override
 void display() {
 super.display(); // Call parent display method
 System.out.println("------------------------------------------------------------------");
 System.out.println("| Emp ID | Basic Pay | DA | HRA | PF | SCF | Gross Salary |");
 System.out.println("|----------|-----------|--------|--------|--------|--------|--------------|");
 System.out.printf("| %-8s | %-9.2f | %-6.2f | %-6.2f | %-6.2f | %-6.2f | %-12.2f |%n",
 empId, basicPay, calculateDA(), calculateHRA(), calculatePF(), calculateStaffClubFund(), 
calculateGrossSalary());
 System.out.println("------------------------------------------------------------------");
 }
}
// Class for Assistant Project Manager which extends Employee
class AssistantProjectManager extends payslip {
 double basicPay; // Basic pay for the assistant project manager
 // Constructor to initialize assistant project manager details
 AssistantProjectManager(String empName, String empId, String address, String mailId, String 
mobileNumber, double basicPay) {
 super(empName, empId, address, mailId, mobileNumber);
 this.basicPay = basicPay; // Set basic pay
 }
 // Same salary calculation methods as Programmer
 double calculateDA() {
 return 0.97 * basicPay;
 }
 double calculateHRA() {

 return 0.10 * basicPay;
 }
 double calculatePF() {
 return 0.12 * basicPay;
 }
 double calculateStaffClubFund() {
 return 0.001 * basicPay;
 }
 double calculateGrossSalary() {
 return basicPay + calculateDA() + calculateHRA() - calculatePF() - calculateStaffClubFund();
 }
 // Override display method to show salary details
 @Override
 void display() {
 super.display(); // Call parent display method
 System.out.println("------------------------------------------------------------------");
 System.out.println("| Emp ID | Basic Pay | DA | HRA | PF | SCF | Gross Salary |");
 System.out.println("|----------|-----------|--------|--------|--------|--------|--------------|");
 System.out.printf("| %-8s | %-9.2f | %-6.2f | %-6.2f | %-6.2f | %-6.2f | %-12.2f |%n",
 empId, basicPay, calculateDA(), calculateHRA(), calculatePF(), calculateStaffClubFund(), 
calculateGrossSalary());
 System.out.println("------------------------------------------------------------------");
 }
}

// Main class to run the payslip application
 class main {
 public static void main(String[] args) {
 Scanner scanner = new Scanner(System.in); // Scanner for user input
 List<payslip> employees = new ArrayList<>(); // List to store employee objects
 // Loop to enter multiple employees
 while (true) {
 System.out.println("Enter Employee Type (1 for Programmer, 2 for Team Lead, 3 for Assistant Project Manager): ");
 int empType = scanner.nextInt(); // Read employee type
 scanner.nextLine(); // Consume newline
 // Read common employee details
 System.out.println("Enter Employee Name: ");
 String empName = scanner.nextLine();
 System.out.println("Enter Employee ID: ");
 String empId = scanner.nextLine();
 System.out.println("Enter Address: ");
 String address = scanner.nextLine();
 // Email ID validation
 String mailId;
 while (true) {
 System.out.println("Enter Mail ID: ");
 mailId = scanner.nextLine();
 if (isValidEmail(mailId)) {
 break; // Exit loop if valid email

 } else {
 System.out.println("Invalid email format. Please enter a valid email (e.g., abc@gmail.com).");
 }
 }
 // Mobile number validation
 String mobileNumber;
 while (true) {
 System.out.println("Enter Mobile Number: ");
 mobileNumber = scanner.nextLine();
 if (isValidMobileNumber(mobileNumber)) {
 break; // Exit loop if valid mobile number
 } else {
 System.out.println("Invalid mobile number. Please enter a 10-digit mobile number.");
 }
 }
 System.out.println("Enter Basic Pay: ");
 double basicPay = scanner.nextDouble(); // Read basic pay
 // Create employee object based on type
 payslip employee = null;
 switch (empType) {
 case 1:
 employee = new Programmer(empName, empId, address, mailId, mobileNumber, 
basicPay);

 break;
 case 2:
 employee = new TeamLead(empName, empId, address, mailId, mobileNumber, 
basicPay);
 break;
 case 3:
 employee = new AssistantProjectManager(empName, empId, address, mailId, 
mobileNumber, basicPay);
 break;
 default:
 System.out.println("Invalid Employee Type!"); // Handle invalid type
 continue;
 }
 employees.add(employee); // Add employee to list
 System.out.println("Do you want to add another employee? (yes/no): ");
 scanner.nextLine(); // Consume newline
 String continueInput = scanner.nextLine();
 if (continueInput.equalsIgnoreCase("no")) {
 break; // Exit loop if user does not want to continue
 }
 }
 // Display pay slips for all employees
 System.out.println("\nPay Slips for All Employees:");
 for (payslip emp : employees) {
 emp.display(); // Display each employee's pay slip

 System.out.println();
 }
 scanner.close(); // Close scanner
 }
 // Email validation method
 private static boolean isValidEmail(String email) {
 // Check for valid email format (basic validation)
 return email.endsWith("@gmail.com") && email.length() > "@gmail.com".length() && 
email.indexOf('@') > 0;
 }
 // Mobile number validation method
 private static boolean isValidMobileNumber(String mobileNumber) {
 // Check if mobile number is exactly 10 digits and contains only digits
 if (mobileNumber.length() != 10) {
 return false;
 }
 for (int i = 0; i < mobileNumber.length(); i++) {
 if (!Character.isDigit(mobileNumber.charAt(i))) {
 return false; // Return false if non-digit found
 }
 }
 return true; // Return true if all checks passed
 }
}
