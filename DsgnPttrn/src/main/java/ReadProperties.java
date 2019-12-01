import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Properties;

public class ReadProperties {
    public static void main(String[] args)throws Exception {

        FileReader reader = null;

        {
            try {
                reader = new FileReader("D:\\Apps\\DsgnPttrn\\src\\main\\resources\\ServiceProvider.properties");
            } catch (FileNotFoundException e) {
                e.printStackTrace();
            }
        }

        Properties prop = new Properties();
        prop.load(reader);

        System.out.println(prop.getProperty("service.s1"));
        System.out.println(prop.getProperty("service.s2"));
    }

}
