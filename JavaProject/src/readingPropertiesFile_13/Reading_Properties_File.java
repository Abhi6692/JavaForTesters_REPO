package readingPropertiesFile_13;

import java.io.FileInputStream;

import java.util.Properties;



public class Reading_Properties_File {

	public static void main(String[] args) throws Throwable {
		
		String propFilePath = "C:\\Users\\OM\\git\\JavaForTesters\\JavaProject\\src\\readingProperties_13\\propertyFile.properties";
		
		Properties prop = new Properties();
		FileInputStream fs = new FileInputStream(propFilePath);
		
		prop.load(fs);
		
		System.out.println(prop.getProperty("name"));
		System.out.println(prop.getProperty("course"));
	}
	
	
}
