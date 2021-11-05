package Utils;

import java.io.FileNotFoundException;
import java.util.Properties;

public class ConfigLoader {

    private  final Properties properties;
    private static ConfigLoader configLoader;

    private ConfigLoader() throws FileNotFoundException {
        properties=PropertyUtils.propertLoader("src/test/resources/config.properties");

    }
public static ConfigLoader getInstance() throws FileNotFoundException {
        if(configLoader==null){
            configLoader=new ConfigLoader();
        }
        return configLoader;
}
public String getHeader(){
        String prop=properties.getProperty("x-api-key");
        if(prop !=null) return prop;
        else throw new RuntimeException("property Header is not specified in config.properties file");
}
}
