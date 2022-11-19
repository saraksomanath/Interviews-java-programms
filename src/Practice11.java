import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class Practice11 {

	public static void main(String[] args) {
		
		
		char vowels []= {'a','e','i','o','u','a','e'};
		
		Map <Character,Integer> map=new HashMap <Character,Integer>();
		
		for (int i = 0; i < vowels.length; i++) {
			
			if (map.containsKey(vowels[i])) {
				
				int count=map.get(vowels[i]);
				
				map.put(vowels[i],count+1);
				
			}
			else
			{
				map.put(vowels[i],1);
			}
			
		}
		
		
		for(Map.Entry<Character,Integer> entry:map.entrySet() ) {
		
			
			System.out.println(entry.getKey()+"="+ entry.getValue());
		}
		
		
	}
}
