package Map.Property;

import java.util.Enumeration;
import java.util.Properties;

public class TryProperties {
    
    //legacy Class- Nowadays, people generally use @CongfigurationProperties annotation
    public static void main(String[] args) {
        Properties p=new Properties();
        p.setProperty("username", "Taylor Swift");
        p.setProperty("password", "Alice");
        System.out.println(p.setProperty("username", "Alice"));  //return old value but replaces the key with old one
        
        System.out.println(p);
        
        System.out.println(p.getProperty("password"));
        // p.load();  to lead properties from properties file into java properties object

        // p.store(null, null);    to store properties from java properties object into properties file

        // Enumeration<> e=p.propertyNames();

    }
}
