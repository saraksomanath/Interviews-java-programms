import java.util.HashMap;

public class Number_of_words_in_string {

	public static void main(String[] args) {
	String str="This this is is done by Saket Saket";
	
	String [] split_w=str.split(" ");
	
	HashMap <String,Integer> map=new HashMap <String,Integer> ();
	

	for (int i =0;i<split_w.length;i++) {
		
		
		if (map.containsKey(split_w[i])) {
			int count = map.get(split_w[i]);
			
			map.put(split_w[i], count+1);
		}
			
			else {
				map.put(split_w[i], 1);
			}
		}
	
	System.out.println(map);
	}
	
	

	}


