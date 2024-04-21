package CollectionConcepts;

import java.util.Collections;
import java.util.Map;
import java.util.TreeMap;

public class TreeMapConcept {

	public static void main(String[] args) {
		//it maintain sorted order but null key is not allowed
		TreeMap<String,String> empData1 = new TreeMap<>(Collections.reverseOrder());
		empData1.put("Tom", "SDET1"); // k-v pair -->entry set
		empData1.put("Peter", "SDET2");
		empData1.put("Ravi", "SDET3");
		empData1.put("Lisa", "SDET4");
		//empData1.put(null, "SDET Manager");
		//empData1.put(null, "SDET Director");
		empData1.put("Prateek", null);
		empData1.put("Usha", null);
		empData1.put("Amit", "SDET5");
		empData1.put("amar", "SDET7");
		empData1.put("1", "SDET6");
		
		System.out.println(empData1);
		
		
		//iterating hashmap
		//type 1 for logic
		for(Map.Entry<String, String> entry : empData1.entrySet()) {
			System.out.println(entry.getKey()+":"+entry.getValue());
		}
		
		System.out.println("-----------");
		//using for each method:
		empData1.forEach((k,v)-> System.out.println(k +":"+v));
		
		//reverse order
		//while declaring use constructor collections.order
		
		System.out.println("-----------");
		TreeMap<String,String> empMap = new TreeMap<>();
		empMap = empData1;
		empMap.forEach((k,v)-> System.out.println(k +":"+v));
	}

}
