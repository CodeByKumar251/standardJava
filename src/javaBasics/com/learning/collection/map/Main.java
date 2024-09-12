package javaBasics.com.learning.collection.map;

import java.util.Map;
import java.util.HashMap;

public class Main {
	
	public static void main(String args[]) {
		Map<Integer, String> map=new HashMap<>();
		map.put(1, "SJ");
		map.put(2, "kj");
		map.put(3, "tk");
		
		map.forEach((Integer k, String v)->System.out.println("k="+k+", v="+v));
		
		Map<Integer,String> rollNumberVsNameMap=new HashMap<>();
		rollNumberVsNameMap.put(null, "Test");
		rollNumberVsNameMap.put(0, null);
		rollNumberVsNameMap.put(1, "A");
		rollNumberVsNameMap.put(2, "B");
		
		//add if key is not avialabe or if key is avialbe and values is null put this value
		rollNumberVsNameMap.putIfAbsent(null, "test");
		rollNumberVsNameMap.putIfAbsent(0, "Zero");
		rollNumberVsNameMap.putIfAbsent(3, "c");
		
		//traverse
		for(Map.Entry<Integer, String>entryMap:rollNumberVsNameMap.entrySet()) {
			Integer key=entryMap.getKey();
			String val=entryMap.getValue();
			System.out.println("key:"+key+", val="+val);
		}
		
		//isEmpty()
		System.out.println("isEmpty():"+rollNumberVsNameMap.isEmpty());
		
		//size
		System.out.println("size: "+rollNumberVsNameMap.size());
		
		//containsKey
		System.out.println("containsKey(3):"+rollNumberVsNameMap.containsKey(3));
		
		//getKey
		System.out.println("get(1):"+rollNumberVsNameMap.get(1));
		
		//getOrDefaultKey
		System.out.println("get(9):"+rollNumberVsNameMap.getOrDefault(9, "default value"));
		
		//removeKey
		System.out.println("remove(null):"+rollNumberVsNameMap.remove(null));
		for(Map.Entry<Integer, String> mapEle:rollNumberVsNameMap.entrySet()) {
			Integer key=mapEle.getKey();
			String val=mapEle.getValue();
			System.out.println("key:"+key+", val:"+val);
			
		}
		
		//keySet()
		for(Integer key:rollNumberVsNameMap.keySet()) {
			System.out.println("key:"+key);
		}
		
		//values
		for(String value:rollNumberVsNameMap.values()) {
			System.out.println("value:"+value);
		}
		
	}
	
}
