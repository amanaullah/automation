package Wrapper;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class Browsers {

	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub


	Browsers crt=new Browsers();
	crt.parameters();
		
		
		
	}
public void parameters () throws IOException{
Properties writing=new Properties();
FileInputStream obj=new FileInputStream("C:\\Users\\amana\\eclipse-workspace\\Automation\\src\\Automation.properties");

writing. load(obj);
System.out.println(writing.getProperty("Name"));
System.out.println(writing.getProperty("job"));
System.out.println(writing.getProperty("city"));

}
}

