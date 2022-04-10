package org.hash;

import java.util.Collection;
import java.util.HashMap;
import java.util.Hashtable;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.Map.Entry;

public class Table {
	 public static void main(String[] args) {
		Map<String,String> a=new Hashtable<String,String>();
		 a.put("Stdid","121");
		 a.put("stdname", "sam");
		 a.put("stdphno", "9876547809");
		 a.put("address", "NO,5,kknagar,chennai");
		 a.put("dob", "10/09/1996");
		 a.put("email","samimman94@gmail.com");
		 a.put("gender", "male");
		System.out.println(a);
		 Set<Entry<String,String>> m= a.entrySet();
		 for(Entry<String,String> x:m) {
		//System.out.println(x);
			System.out.println("Keys:"+x.getKey()); 
			System.out.println("Values:"+x.getValue());
		 
	 }								 }
}