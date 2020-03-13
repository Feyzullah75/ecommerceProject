
package Utils;

import java.io.FileInputStream;
import java.util.Properties;

public class ConfigReader {

    private static Properties configFile;
    static {

        // This is for github testing
        // test2
        String path="configration.properties";
        try {
            FileInputStream input = new FileInputStream(path);
            configFile=new Properties();
            configFile.load(input);
            input.close();
        }catch(Exception e){
            e.printStackTrace();
        }
    }
    public static String getProperty(String keyValue){
        return configFile.getProperty(keyValue);
    }


}
