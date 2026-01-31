package config;

import java.io.InputStream;
import java.util.Map;

import com.fasterxml.jackson.databind.ObjectMapper;

public class ConfigReader {
 
	public static RootConfig config;	
	static {		
		try {
			ObjectMapper mapper = new ObjectMapper();
			InputStream stream = ConfigReader.class.getClassLoader().getResourceAsStream("config/EnviornmentConfig.json");
			config = mapper.readValue(stream, RootConfig.class);
		}
		catch(Exception e) {
			System.out.println("Failed to read the json");
			e.printStackTrace();
		}
	}
	public static EnviornmentConfig getActiveEnviornment() {
		
		String runtime = System.getProperty("env");
		String selectEnv = (runtime != null) ? runtime : config.getDefaultEnv();
		//OR
//		if(runtime != null) {
//			selectEnv = runtime;}
//		else{
//			selectEnv = config.getDefaultEnv();	}
		System.out.println("Selected enviornment is: " + selectEnv);
		Map<String, EnviornmentConfig> envs = config.getEnviornment();
		return envs.get(selectEnv);
	}
}
