package javaBasics.com.learning.collection.map;
import java.util.Map;
import java.util.TreeMap;

public class Main3 {
	
	public static void main(String args[]) {
		
		//decreasing order
		Map<Integer,String> treeMap=new TreeMap<>((Integer key1, Integer key2)->key2-key1);
		treeMap.put(21, "SJ");
		treeMap.put(11, "PJ");
		treeMap.put(13, "KJ");
		treeMap.put(5, "TJ");
		
		treeMap.forEach((Integer key, String value)->System.out.println("key="+key+",value="+value));
		
		//increasing order
		Map<Integer,String> treeMap2=new TreeMap<>();
		treeMap2.put(21, "SJ");
		treeMap2.put(11, "PJ");
		treeMap2.put(13, "KJ");
		treeMap2.put(5, "TJ");
		
		System.out.println("-------------------------------------------");
		for(Map.Entry<Integer, String> treeMapele:treeMap2.entrySet()) {
			int key=treeMapele.getKey();
			String value=treeMapele.getValue();
			System.out.println("key:"+key+",value:"+value);
		}
	}

}
