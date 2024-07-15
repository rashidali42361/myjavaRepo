package DataDrivenTesting;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class Practice {

	public static void main(String[] args) throws IOException {
		FileInputStream fis=new FileInputStream("./testdata/new.properties");
		Properties property=new Properties();
		property.load(fis);
	String	url=property.getProperty("url");
	String userName=property.getProperty("username");
	String password=property.getProperty("password");  
	
	System.out.println(url);
	System.out.println(userName);
	System.out.println(password);
	}

}
