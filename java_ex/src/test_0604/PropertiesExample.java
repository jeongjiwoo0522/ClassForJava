package test_0604;

import java.io.FileReader;
import java.net.URLDecoder;
import java.util.Properties;

public class PropertiesExample {

	public static void main(String[] args) {
		Properties properties = new Properties();
		String path = URLDecoder.decode("D:/study/java/ClassForJava/java_ex/src/test_0604/database.properties", "utf-8");
		properties.load(new FileReader(path));
		
		String driver = properties.getProperty("driver");
		System.out.println(driver);
	}
}
