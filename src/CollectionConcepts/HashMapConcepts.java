package CollectionConcepts;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class HashMapConcepts {

	public static void main(String[] args) {
		String name1 = "Lisa";
		System.out.println("hashcode for name1: "+name1.hashCode());
		String name2 = "Tom";
		System.out.println("hashcode for name2: "+name2.hashCode());
		String name3 = "peter";
		System.out.println("hashcode for name3: "+name3.hashCode());
		String name4 = "lisa";
		System.out.println("hashcode for name4: "+name4.hashCode());
		
		//k,v
		HashMap<String,String> empData = new HashMap<String,String>();
		empData.put("Tome", "SDET1");
		empData.put("Abc", "SDET2");
		empData.put("Welcome", "SDET3");
		System.out.println(empData);
		empData.put("NewTome1", empData.remove("Tome")); //create a new entry with new key as Tome1
		System.out.println(empData);
		empData.remove(empData);
		
		HashMap<String, Integer> empMap = new HashMap<String, Integer>(); //Integer is wrapper class Integer primitive data type is not allowed
		empMap.put("Tom",101);
		empMap.put("Lisa",200);
		
		System.out.println("Size of empMap"+empMap.size());
		System.out.println("User ID: "+empMap.get("Tom"));
		empMap.put("Lisa",300); //key value is updated
		System.out.println("User ID of Lisa: "+empMap.get("Lisa"));
		
		//non order based collection index is not maintained JDK 1.7 O(n) and after JDK 1.8 O(logn) (binary tree)
		HashMap<String,String> empData1 = new HashMap<>();
		empData1.put("Tom", "SDET1"); // k-v pair -->entry set
		empData1.put("Peter", "SDET2");
		empData1.put("Ravi", "SDET3");
		empData1.put("Lisa", "SDET4");
		empData1.put(null, "SDET Manager");
		empData1.put(null, "SDET Director");
		empData1.put("Prateek", null);
		empData1.put("Usha", null);
		
		System.out.println(empData1.get(null));
		System.out.println(empData1.get("test"));
		
		System.out.println(empData1);
		
		HashMap<String, ArrayList<String>> map1 = new HashMap<>();
		ArrayList<String> citiesList = new ArrayList<>();
		citiesList.add("Pune");
		citiesList.add("Kanpur");
		map1.put("Tom", citiesList);
		map1.put("Lisa", citiesList);
		System.out.println("Tom array list: "+map1.get("Tom"));
		System.out.println("Lisa array list: "+map1.get("Lisa"));
		
		boolean flag = empData1.containsKey("Lisa");
		System.out.println(flag);
		//iterating hashmap
		//type 1 for logic
		for(Map.Entry<String, String> entry : empData1.entrySet()) {
			System.out.println(entry.getKey()+":"+entry.getValue());
		}
		
		System.out.println("-----------");
		//using for each method:
		empData1.forEach((k,v)-> System.out.println(k +":"+v));
		
		
		
	}

}
