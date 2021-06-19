package allMethodTestNg;

import java.io.FileInputStream;

import java.util.Properties;

public class PropertyRead {
	
	public static Properties prop;

	public static  String getProp(String key) {
		
		try {
			prop = new Properties();
			FileInputStream fi = new FileInputStream(System.getProperty("user.dir")+"/src/test/resources/config.properties");
			prop.load(fi);
			
			//Users/ibrahimmiah/Desktop/Eclipesjava/Ptw_Practice/allMethodTestNg
		} catch (Exception e) {
			
		}
		String value = prop.getProperty(key);	
		return value;
	}
	
}
