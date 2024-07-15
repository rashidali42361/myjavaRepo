package DataDrivenTesting;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class ToFetchDataFromPropertyFilee {

	public static void main(String[] args) throws IOException {
		
		FileInputStream fis=new FileInputStream("./testdata/propertyData.properties");
		Properties property=new Properties();
		property.load(fis);
		String url = property.getProperty("url");
		String username = property.getProperty("username");
		String password = property.getProperty("password");
		System.out.println("Url:"+url);
		System.out.println("Username:"+username);
		System.out.println("Password:"+password);
		

	}

}
