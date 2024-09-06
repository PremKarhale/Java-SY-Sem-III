
// You have to implement the library using java class library, Method : Addbook() , issueBook() and ShowAvailableBook()
package problem1;
	
	
	 public class library {
		
		int  result = 50;
		int i;
		
		 int remaining_books(int ...arr) {
			
			for (int a:arr) {
				this.result -=a;
				
			}
			
			return result;
		}
		 int issued_books(int ...arr) {
	         i=0;

			for (int a:arr) {
				this.i +=a;
			}
			return i;
		}
		 int return_books () {
			int sum = this.remaining_books() + this.issued_books();
			return sum ;
		}
		
		 public static void main(String[] args) {

			library obj=new library();
		    System.out.println("Remaining Books : " + obj.remaining_books(1,2));
		    System.out.println("Issued Books : " + obj.issued_books(1,2));
		    System.out.println("Total number of books : " + obj.return_books()); 
			}	
	 }
	