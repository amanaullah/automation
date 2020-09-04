package Accessmodifierscode;

import java.io.ObjectInputStream.GetField;

public class storagehouse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		foodstores ob=new foodstores();
		ob.addition();
		ob.divition();
		ob.privateofmethods();
		int d=ob.getI();
		ob.setI(4000);
		
				
				System.out.println(ob.getI());
				System.out.println(d);
				
	}
}