package genericutils;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
public class PropertyFileUtils {

	public String getPropertyData(String key) throws IOException {
		FileInputStream fis=new FileInputStream(IPathConstants.PROPERTY_PATH);
		Properties p=new Properties();
		p.load(fis);
		return p.getProperty(key);
	}
	
	
	
	
	
}
