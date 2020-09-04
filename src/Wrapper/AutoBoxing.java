package Wrapper;

import java.util.ArrayList;
import java.util.Iterator;
//import java.util.Arrays;

public class AutoBoxing {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
/*int s=30;
Integer convert=new Integer(s);
System.out.println(convert);// process is known as wrapping/ autoboxing.

int d=convert;
System.out.println(d); // is called unwrapping or unboxing.

boolean shumi= true;
Boolean toknow=new Boolean(true);
System.out.println(toknow);// toknow is object , so i am printing the 

boolean r=toknow;
System.out.println(r);


String S="Shumi";
String obj=new String(S);
System.out.println(obj);*/


		
		// how to declare Arraylist?
		
ArrayList obj=new ArrayList();
//System.out.println(obj);
//System.out.println(obj.size());// how to see size for arraylist.


obj.add (500);// autoboxing
obj.add(true);
obj.add(6.6666);
/*System.out.println(obj.get(0));
System.out.println(obj.size());
System.out.println(obj.get(2));*/

// how to print all of together with help of forloop. there are 3 way to print.

for(int i=0; i<obj.size(); i++) {
	System.out.println(obj.get(i));
	
	// 2nd way to print 
	
	for (Object u:obj) {
		System.out.println(u);
		
		//3rd way to print:
	Iterator itr=obj.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		
		
		
	}
	
}




	}

}
