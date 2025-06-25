package Map.Property;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties; 

public class TestProperty {
    public static void main(String[] args) throws IOException {
        
        Properties p=new Properties();
    
        FileInputStream fis=new FileInputStream("abc.properties");
        p.load(fis);
        System.out.println(p);

        String s=p.getProperty("username");
        System.out.println(s);

        p.setProperty("Mobile No.","9911675637");
        FileOutputStream fos=new FileOutputStream("abc.properties");
        p.store(fos, "Updated By Megha Singh");
    }
    
    
}
