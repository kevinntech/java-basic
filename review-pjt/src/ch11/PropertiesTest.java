package ch11;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

public class PropertiesTest {
    public static void main(String[] args) {
        Properties p = new Properties();
        /*
        p.setProperty("autosave", "5");
        p.setProperty("language", "한글");
        p.setProperty("timeout", "10");

         */

        System.out.println(p);
        System.out.println(p.getProperty("autosave2", "0"));
        System.out.println(p.getProperty("autosave2"));

        p.list(System.out);

        try{
            p.load(new FileInputStream("output.txt"));
            System.out.println(p);
            p.store(new FileOutputStream("output.txt"), "Properties Example");
            p.storeToXML(new FileOutputStream("output.xml"), "Properties Example");
        }catch (IOException ex){
            ex.printStackTrace();
        }
    }
}
