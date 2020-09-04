package Arrays;

public class differentwaymethods {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
// non static into static with arguments.
		differentwaymethods ob=new differentwaymethods();
		ob.howmanystudentspass(100, 15);
				
		
	}

	public void howmanystudentspass (int totalstudents,int fail) {
		int pass=totalstudents-fail;
		System.out.println(pass);
	}

	
	
	
}
