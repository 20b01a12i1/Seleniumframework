package config;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Properties;

public class PropertiesFile {

	static Properties props = new Properties();
	static String projectpath = System.getProperty("user.dir");
	public static void main(String[] args) {

		getProperties();
		setProperties();
		getProperties();
	}

	public static void getProperties() {

		try {
			InputStream input = new FileInputStream(projectpath+"/src/test/java/config/config.properties");
			props.load(input); //load properties file
			System.out.println(props.getProperty("name"));
		}catch(Exception exp){
			System.out.println(exp.getMessage());
			System.out.println(exp.getCause());
		}
		
	}

	public static void setProperties() {

		try {
			OutputStream output = new FileOutputStream(projectpath+"/src/test/java/config/config.properties");
			props.setProperty("name", "srivalli");
			props.store(output, null); //for storing the output to properties file
		} catch (Exception exp) {
			System.out.println(exp.getMessage());
			System.out.println(exp.getCause());
			exp.printStackTrace();
		}
		
		
	}

}
