package Map;

import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Map.Entry;

public class Hashmap {
	public static void main(String[] args) {
		Map<String,Integer>m =new LinkedHashMap<>();
		m.put("a1",1);
		m.put("a2",2);
		m.put("a3",3);
		m.put("a4",4);
		m.put(null,null);
		Map<String,Integer>n =new LinkedHashMap<>();
		n.put("a5",1);
		n.put("a6",2);
		n.put("a7",3);
		n.put("a8",4);
		n.put(null,null);
		
		//System.out.println(m);
//		System.out.println(m.size());
//		//m.clear();
//		System.out.println(m.isEmpty());
//		System.out.println(m.get("a4"));
//		System.out.println(m.containsKey("a3"));
//		System.out.println(m.containsValue(2));
		//System.out.println(m.keySet());
//		System.out.println(m.values());
//		for(Entry<String, Integer> x:m.entrySet()) {
//			System.out.println(x.getKey()+" "+x.getValue());
			//m.remove("a1");
			//System.out.println(n);
			//m.putAll(n);
			//System.out.println(m);
		//System.out.println(m.containsKey("a3"));
		//
		
		
		
		//m.remove("a4");
		System.out.println(m);
		m.remove("a2",2);
		System.out.println(m);
	}

}
