package collection.com;

import java.util.HashMap;
import java.util.Map;

public class mycollectionHash {

	public static void main(String[] args) {
		HashMap<Integer, String> hmap=new HashMap<Integer, String>();
		hmap.put(1,"Gopi");
		hmap.put(2,"Gopi2");
		hmap.put(3,"Gopi3");
		System.out.println(hmap.get(3));
		for(Map.Entry m:hmap.entrySet()){
			System.out.println("Key:"+m.getKey() + ", Value:"+ m.getValue());
		}
		hmap.put(1,"Gopi 5");
		System.out.println(hmap.get(1));
		hmap.remove(1);
		System.out.println(hmap.get(1));
	}
}
