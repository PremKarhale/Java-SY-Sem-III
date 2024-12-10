/*Identify commonalities and differences between Publication, Book and Magazine classes. Title, 
Price, Copies are common instance variables and saleCopy is common method. The differences 
are, Bookclass has author and orderCopies(). Magazine Class has methods orderQty, Current issue, 
recieveissue().Write a program to find how many copies of the given books are ordered and 
display total sale of publication. 
*/
package practice2;
import java.util.Scanner;

class publication{
	String title;
	int price,copies=0;
	void orderqty(int n) {
		copies=copies + n;
		System.out.println("total no of copies: "+copies );
		
	}
	void salecopy(int c) {
		if(c>copies) {
			System.out.println("Stock is unavailable!!! \n Available copies are : 0");
			
		}
		else {
			copies=copies-c;
			System.out.println("copies sold are :"+c);
			System.out.println("copies available are: "+copies);
			
		}
		
	}

}
 class Book extends publication {
	 String author;
	 int sale;
	 Book(){
		 author="prem";
		 price=300;
		 title="the no way home ";
		 
	 }
	 void ordercopies(int n1) {
		 super.orderqty(n1);
		 
	 }
	 void salecopies(int n2) {
		 System.out.println("author : "+author);
		 System.out.println("price :"+price);
		 System.out.println("title : "+title);
		 super.salecopy(n2);
		 
	 }
	 }
     class magzine extends publication{
    	 String author;
    	 int price;
    	 int currentissue,recieveissue=5;
    	 magzine(){
    		 author="shivamBhosale";
    		 price=150;
    		 title="way to healthy lifestyle";
    	
    	 }
    	 void oderqty(int n3) {
    		 super.orderqty(n3);
    		 
    	 }
    	 void currentissue() {
    		 System.out.println("current issue : "+currentissue);
    	 }
    	 void recieveissue() {
    		 System.out.println("recieve issue : "+recieveissue);
    	 }
    	 void salecopy(int n4) {
    		 super.salecopy(n4);
    		 
    	 }
    	 
     }

public class book_seller {

	public static void main(String[] args) {
		// TODO Auto-generated method 
		 int n4,n5,n6,n7;
         Scanner sc=new Scanner(System.in);
         Book obj=new Book();
         System.out.println("no of copies ordered:");
          n4=sc.nextInt();
         System.out.println("no of copies sold ");
          n5=sc.nextInt();
          obj.ordercopies(n4);
          obj.salecopies(n5);
          magzine obj2=new magzine();
          System.out.println("no of magzine ordered  :");
          n6=sc.nextInt();
          System.out.println("no of magzine copies sold :");
          n7=sc.nextInt();
          obj2.orderqty(n6);
          obj2.currentissue();
          obj2.salecopy(n7);
        
	}

}








