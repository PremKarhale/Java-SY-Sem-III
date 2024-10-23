package assignment2;
import java.util.Scanner;
// Main class for handling the polymorphism demonstration
public class polymorphism {
 public static void main(String[] args) {
 Scanner input = new Scanner(System.in);
 System.out.println("\n-----------------------------------------------------------------------\n");
 System.out.println("\n-------------------SET THE INFORMATION ABOUT BOOK---------------------\n");
 // Create a Books object and set its information
 Books book = new Books(); 
 book.setBookInformation();
 System.out.println("\n-------------------SET THE INFORMATION ABOUT MAGAZINE----------------\n");
 // Create a Magazine object and set its information
 Magazine mag = new Magazine(); 
 mag.setMagInformation();
 System.out.println("\n-------------------OPTIONS------------------------\n");
 // Main menu loop
 while (true) {
 menu(); // Display menu options
 int choice = input.nextInt(); // Get user choice
 // Handle user choices
 if (choice == 1) {
 System.out.print("How many Books do you want to Buy: ");
 int quantity = input.nextInt();
 book.order_copies(quantity); // Process book order
 System.out.println("Thank you for shopping with us! ☺");
 line();
 } else if (choice == 2) {
 System.out.print("How many Magazines do you want to Buy: ");
 int quantity = input.nextInt();
 mag.order_copies(quantity); // Process magazine order
 System.out.println("Thank you for shopping with us! ☺");
 line();
 } else if (choice == 3) {
 // Receive new issue for magazine
 String issue;
 int quantity;
 System.out.println("New Issue: ");
 issue = input.next();
 System.out.println("Quantity: ");
 quantity = input.nextInt();
 mag.receive_new_issue(issue, quantity);
 System.out.println("Fresh Issue has been added to the stock!");
 line();
 } else if (choice == 4) {
 book.information(); // Display book information
 line();
 } else if (choice == 5) {
 mag.information(); // Display magazine information
 line();
 } else if (choice == 6) {
 break; // Exit the program
 }
 }
 line(); // Final line separator
 input.close(); // Close the scanner
 }
 // Method to display menu options
 public static void menu() {
 System.out.println("1. Buy books");
 System.out.println("2. Buy magazines");
 System.out.println("3. Receive new Publication [Magazine]");
 System.out.println("4. Get Book Information");
 System.out.println("5. Get Magazine Information");
 System.out.println("6. Exit the program");
 System.out.print("Enter your choice: ");
 }
 // Method to print a line separator
 public static void line() {
 System.out.println("----------------------------------------------------------------");
 }
}
// Base class for publication details
class Publication {
 String title;
 double price;
 int copies;
 Scanner input = new Scanner(System.in);
 Publication() {}
 Publication(String title, double price, int copies) { // Constructor
 this.title = title;
 this.price = price;
 this.copies = copies;
 }
 public int getCopies() { // Getter for copies
 return this.copies;
 }
 public void setCopies(int copies) { // Setter for copies
 this.copies = copies;
 }
 public void add_copies(int copies) { // Add copies to stock
 this.copies += copies;
 }
 public void display_Current_Sales_Statistics(int quantity) { // Display sales statistics
 System.out.println("\nTotal Sales: " + this.price * quantity + "\n");
 }

 public void sellCopy(int quantity) { // Sell copies
 this.copies -= quantity;
 display_Current_Sales_Statistics(quantity);
 }
 public void display_publication_data() { // Display publication data
 System.out.println("TITLE: " + this.title);
 System.out.println("PRICE: " + this.price);
 System.out.println("COPIES REMAINING IN STOCK: " + this.copies);
 }
}
// Class for book details, inheriting from Publication
class Books extends Publication {
 String author;
 static int total_books = 0;
 public void setBookInformation() { // Set book information
 System.out.print("TITLE OF THE BOOK: ");
 String t = input.nextLine();
 System.out.print("PRICE OF THE BOOK: ");
 double p = input.nextDouble();
 System.out.println("INITIAL COPIES OF THE BOOK: ");
 int c = input.nextInt();
 System.out.println("AUTHOR OF THE BOOK: ");
 get_author();

 title = t;
 price = p;
 copies = c;
 total_books += c;
 }
 public void display_Current_Sales_Statistics(int quantity) { // Display sales for books
 System.out.println("\nTotal Sales of Book: " + this.price * quantity + "\n");
 }
 public void get_author() { // Get author information
 input.nextLine();
 this.author = input.nextLine();
 }
 public void order_copies(int quantity) { // Order copies of the book
 if (quantity > copies) {
 System.out.println("Sorry, we don’t have this number of Copies left");
 return;
 }
 total_books -= quantity;
 this.copies -= quantity;
 display_publication_data();
 display_Current_Sales_Statistics(quantity);
 }
 public void information() { // Display book information

 display_publication_data();
 System.out.println("Author of the book: " + this.author);
 }
}
// Class for magazine details, inheriting from Publication
class Magazine extends Publication {
 static int total_magazine = 0;
 String current_issue;
 int orderQty = 0;
 public void information() { // Display magazine information
 display_publication_data();
 System.out.println("Total Number of magazines are: " + total_magazine);
 System.out.println("Current issue OF THE Magazine: " + current_issue);
 }
 public void display_Current_Sales_Statistics(int quantity) { // Display sales for magazines
 System.out.println("\nTotal Sales of Magazine: " + this.price * quantity + "\n");
 }
 public void order_copies(int quantity) { // Order copies of the magazine
 orderQty = quantity;
 adjustQty(quantity);
 display_publication_data();
 display_Current_Sales_Statistics(quantity);
 }
 public void adjustQty(int quantity) { // Adjust quantity of magazines

 if (quantity > copies) {
 System.out.println("Sorry, we don’t have this number of Copies left");
 return;
 }
 total_magazine -= quantity;
 copies -= quantity;
 }
 public void receive_new_issue(String new_issue, int quantity) { // Receive a new magazine 

 this.copies += quantity;
 total_magazine += quantity;
 current_issue = new_issue;
 display_publication_data();
 information();
 }
 public void setMagInformation() { // Set magazine information
 System.out.print("TITLE OF THE MAGAZINE: ");
 String t = input.nextLine();
 System.out.print("PRICE OF THE MAGAZINE: ");
 double p = input.nextDouble();
 System.out.print("INITIAL COPIES OF THE MAGAZINE: ");
 int c = input.nextInt();
 System.out.print("CURRENT ISSUE: ");
 input.nextLine();
 String cr = input.nextLine();

 title = t;
 price = p;
 copies = c;
 total_magazine += c;
 current_issue = cr;
 }
}
