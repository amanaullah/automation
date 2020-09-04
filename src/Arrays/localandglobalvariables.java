package Arrays;

public class localandglobalvariables {
//Global variables should be inside the class and outside of the methods.
	int a=70;
	int s=90;
	int d;
	

	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//local variable should be inside the method.
		localandglobalvariables obj=new localandglobalvariables();
		obj.addition ();
		obj.subtraction();
		obj.multiplication ();
		obj.percentage();		
	}
public void addition() {
	d=a+s;
	System.out.println(d);
}
public void subtraction() {
	d=a-s;
	System.out.println(d);
}
public void multiplication () {
	d=a*s;
	System.out.println(d);
}
public void percentage () {
	d=a%s;
	System.out.println(d);
}
}

