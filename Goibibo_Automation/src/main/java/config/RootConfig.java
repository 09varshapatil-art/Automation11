package config;

import java.util.Map;

public class RootConfig {

	private String defaultEnv;	
	private Map<String, EnviornmentConfig> enviornment;
	public String getDefaultEnv() {
		return defaultEnv;
	}
	public Map<String, EnviornmentConfig> getEnviornment(){
		return enviornment;
	}
}
