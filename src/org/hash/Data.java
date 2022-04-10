package org.hash;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class Data {
	public static void main(String[] args) {
		Map<Integer,String> a=new LinkedHashMap<Integer,String>();
		 a.put(10,"10");
		 a.put(20, "20");
		 a.put(30, "30");
		 a.put(40, "40");
		 a.put(50, "50");
		 a.put(60, "60");
		 a.put(10, "10");
		 a.put(50, "50");
		 a.put(40, "40");
		 System.out.println(a);
		 Set<Entry<Integer,String>> s =a.entrySet();
				for(Entry<Integer,String> x:s) {
					System.out.println(x);

					//System.out.println("Keys:"+x.getKey());
					//System.out.println("Values:"+x.getValue());
}
}
}