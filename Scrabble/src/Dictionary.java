import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.HashMap;
import java.util.Map;

public class Dictionary{
	private Map<String, Integer> dictionary = new HashMap<String, Integer>();
	private BufferedReader reader;
	private String word;
	
	public Dictionary(){
		try{
			reader = new BufferedReader(new FileReader(new File("sowpods.txt")));
			
			while((word = reader.readLine()) != null){
				dictionary.put(word, 1);
			}
			
			reader.close();
		}catch(Exception ex){
			ex.printStackTrace();
		}
		
	}
	
	public boolean isValid(String word){
		if(dictionary.containsKey(word))
			return true;
		else
			return false;
	}
}