package Mapping;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class MapTest {

	public static void main(String[] args) {
		
		//<key , value>
		// may have null value
		//Maintain no order
		HashMap<Integer , String> map = new HashMap<Integer , String>();
		
		map.put(100, "Tom");
		map.put(200, "Peter");
		map.put(300, "Naveen");
		map.put(200, "Arthi");
		map.put(400, null);
		map.put(null, "Automation");
		
		System.out.println(map.get(100));
		System.out.println(map.get(200));
		System.out.println(map.get(500));
		System.out.println(map.get(200));
		System.out.println(map.get(400));
		System.out.println(map.get(null));
		System.out.println("*****************");
		
		// example 2
		// no order in HashMap
		//HashMap<String , String> empMap = new HashMap<String , String>();
		
		// with linkedMap , we pure sequence order as added 
		//Map<String , String> empMap = new LinkedHashMap<String , String>();
		
		//Map<String , String> empMap = new HashMap<String , String>();
		// Maintains Alphabetical order
		Map<String , String> empMap = new TreeMap<String , String>();
		
		
		
		empMap.put("IBM", "tom");
		empMap.put("Google", "Naveen");
		empMap.put("Amazon", "Sham");
		empMap.put("CTS", "Ali");
		empMap.put("Infosys", "Ravi");
		empMap.put("HCL", "Praveen");
		
		System.out.println(empMap.get("IBM"));
		
		//to print all the values from hashMap
		
		empMap.forEach((Key, Value) -> System.out.println(Key +":"+ Value));
		
		
		
		
		
		
		
	}

}
