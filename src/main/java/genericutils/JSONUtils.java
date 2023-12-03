package genericutils;
import java.io.FileReader;
import java.io.IOException;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;
public class JSONUtils {

	public String readJSONData(String key) throws IOException, ParseException {
		FileReader fr=new FileReader(IPathConstants.JSON_PATH);
		JSONParser jp=new JSONParser();
		Object obj=jp.parse(fr);
		JSONObject jo=(JSONObject)obj;
		return	(String)jo.get(key);
	}
	
	
}
