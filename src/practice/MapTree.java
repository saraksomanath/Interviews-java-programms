package practice;

import java.util.Map.Entry;
import java.util.TreeMap;

public class MapTree {

	public static void main(String[] args) {


		TreeMap <Integer,String> map=new TreeMap<>();
		map.put(1, "India");
		map.put(2, "China");
		map.put(3, "Shreelanka");
		map.put(4, "Japan");
		map.put(5, "Rusia");
		
		 for(Entry<Integer, String> m:map.entrySet()){    
		       System.out.println(m.getKey()+" "+m.getValue());    
		      }    

	}

}
