package maps;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/*******************************************************
 * <p>	This class is a client of the Map collections.
 * *****************************************************/
public class HashMapClient {
	
	/****************************************************
	 * 	creates a map of students 
	 ****************************************************/
	public static Map<String, Double> make (){
		
		Map<String, Double> map = new HashMap<String,Double>();
		//can be used to store data
		return map;
	}
	
	/****************************************************
	 * 	creates a map of a bridal party
	 ****************************************************/
	public static Map<String, String> party (){
		
		Map<String, String> map = new HashMap<String,String>();
		//used to store data
		return map;
	}
	
	/****************************************************
	 * 	iterates through a map of students.
	 ****************************************************/
	public static Map<String, Double> iterate(Map<String,Double> map){
		Iterator<String> i = map.keySet().iterator();
		while(i.hasNext()) {
			//update
		}
		return map;
		
	}
	
	/****************************************************
	 * 	separation into bride's party.
	 ****************************************************/
	public static Map<String, String> bride(Map<String,String> map){
		//update
		return map;
	}
	
	/****************************************************
	 * 	separation into groom's party.
	 ****************************************************/
	public static Map<String, String> groom(Map<String,String> map){
		//update
		return map;
		
	}
	
	/*********************************************
	 * 	runs program.
	 *********************************************/
	public static void main(String[] args) {
		//update
	}

}
