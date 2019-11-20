// Java program for write JSON to a file 

import java.io.FileNotFoundException; 
import java.io.PrintWriter; 
import java.util.LinkedHashMap; 
import java.util.Map; 
import org.json.simple.JSONArray; 
import org.json.simple.JSONObject; 

public class JSONWrite
{ 
	public static void main(String[] args) throws FileNotFoundException 
	{ 
		// creating JSONObject 
		JSONObject jo = new JSONObject(); 
		
		// putting data to JSONObject 
		jo.put("firstName", "Subhrodip"); 
		jo.put("lastName", "Mohanta"); 
		jo.put("age", 21); 
		
		// for address data, first create LinkedHashMap 
		Map m = new LinkedHashMap(4); 
		m.put("streetAddress", "subho.xyz"); 
		m.put("city", "Kolkata"); 
		m.put("state", "WB"); 
		m.put("postalCode", 700001); 
		
		// putting address to JSONObject 
		jo.put("address", m); 
		
		// for phone numbers, first create JSONArray 
		JSONArray ja = new JSONArray(); 
		
		m = new LinkedHashMap(2); 
		m.put("type", "mobile"); 
		m.put("number", "9007400495"); 
		
		// adding map to list 
		ja.add(m); 
		
		m = new LinkedHashMap(2); 
		m.put("type", "webiste"); 
		m.put("value", "subho.xyz"); 
		
		// adding map to list 
		ja.add(m); 
		
		// putting phoneNumbers to JSONObject 
		jo.put("phoneNumbers", ja); 
		
		// writing JSON to file:"JSONExample.json" in cwd 
		PrintWriter pw = new PrintWriter("JSONExample.json"); 
		pw.write(jo.toJSONString()); 
		
		pw.flush(); 
		pw.close(); 
	} 
} 

//compile	= javac -cp ".:./jars/json-simple-1.1.jar" JSONWrite.java 
//run		= java -cp ".:./jars/json-simple-1.1.jar" JSONWrite