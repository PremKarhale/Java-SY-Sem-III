package constructor;

public class area {
	public  int height;
	 public int radius;
	
	public area(int radius,int height){
		 this. radius=radius;
          this. height=height;
			
		
	}
	public double getarea() {
		return Math.PI*radius*radius*height;
		
		
	}
	public static void main (String [] args) {
		area obj=new area(12,24);
		System.out.println("vol of cyclinder is : "+obj.getarea());
		
		
	}

}
