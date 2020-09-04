package objectorientedcon;

public class area extends circle {
	//public class---parent class
	//super class--sub class

	public static void main(String[] args) {
		// TODO Auto-generated method stub
area ob=new area();
ob.addition ();
int area=ob.width*ob.length;
System.out.println("This is area ="+area);
	}
	
	public void badnews() {
		System.out.println("my grandfather died today");
		
	}
}
