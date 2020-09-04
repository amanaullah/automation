package Accessmodifierscode;

public class foodstores {
private int i=60;
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
public void addition() {
	System.out.println("this is the public class modifier");
	
}
private void subtraction () {
	System.out.println("This is data hiding");
}
protected void divition() {
	System.out.println("this is protected");
}
void multiplication () {
	
}
public int getI() {
	return i;
}
public void setI(int i) {
	this.i = i;
}
public void privateofmethods() {
	subtraction();
}

}
// create public method
//call your private method into public method
//then call public method into your another class