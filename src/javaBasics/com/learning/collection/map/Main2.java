package javaBasics.com.learning.collection.map;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class Main2 {
	
	public static void main(String args[]) {
		System.out.println("----------Below is LinkedHashMap output-----------");
		
		Map<Integer, String> map=new LinkedHashMap<>();
		map.put(1, "A");
		map.put(21, "B");
		map.put(23, "C");
		map.put(141, "D");
		map.put(25, "E");
		map.forEach((Integer key,String value)-> System.out.println("key:"+key+",value:"+value));
		
		System.out.println("------Below is normal HashMap output------------");
		
		Map<Integer, String> map2=new HashMap<>();
		map2.put(1, "A");
		map2.put(21, "B");
		map2.put(23, "C");
		map2.put(141, "D");
		map2.put(25, "E");
		map2.forEach((Integer key,String value)-> System.out.println("key:"+key+",value:"+value));
		
		//With Access ORDER=TRUE
		System.out.println("----------Below is LinkedHashMap output with Access Order True-----------");
		//Map<Integer, String> map3=new LinkedHashMap<>(int initialCapacity,float loadFactor,boolean accessOrder);
		Map<Integer, String> map3=new LinkedHashMap<>(16,0.75F,true);		
		map3.put(1, "A");
		map3.put(21, "B");
		map3.put(23, "C");
		map3.put(141, "D");
		map3.put(25, "E");
		
		//Access some data
		map3.get(23);
		map3.forEach((Integer key,String value)-> System.out.println("key:"+key+",value:"+value));
		
	}

}
