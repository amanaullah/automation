package Arrays;

public class codingprogram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// runtime exceptions are those which is not caught during compolization.
		
	/*System.out.println("This is beggining");
	int s=50;
	int d=6;
	int i=d/s;
	System.out.println(i);
	System.out.println("This is end");*/
	
		try {
	System.out.println("This is begining");
	int i=60;
	int r=i/0;
	System.out.println(r);
	
		} catch(Exception e) {
System.out.println("there error displaying");
System.out.println(e.getMessage());
e.printStackTrace();

		}finally {
			System.out.println("This is final");
		}
		System.out.println("this is end");
		
	/*try {
		/* create db cnnection
		 * validate the sql quiries
		 close the connection*/
	
	}

}
