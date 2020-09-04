package Arrays;

public class overloadingconcept {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
// Method overloading concepts used to use same methods name but with different arguments.
		
		//overloadingconcept over=new overloadingconcept();
		//over.addtion(25, 30);
		overloadingconcept ob=new overloadingconcept("amana");	
	}
	
	public void addtion() {
		System.out.println("this is addition without argument");
	}
	
	public void addtion(int a, int d) {
		System.out.println("this is addition without argument");
	}
	public void addtion(int a, int t,int r) {
		System.out.println("this is addition without argument");
	}
	public void addtion(float a, String s) {
		System.out.println("this is addition without argument");
	}
		
	//constructor overloading	
	public overloadingconcept (String name) {
		System.out.println(name);
	}
		
	}


