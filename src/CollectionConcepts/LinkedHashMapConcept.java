package CollectionConcepts;

import java.util.HashMap;
import java.util.LinkedHashMap;

public class LinkedHashMapConcept {

	public static void main(String[] args) {
		
		//it maintains the insertion order
		LinkedHashMap<String,String> empData1 = new LinkedHashMap<>();
		empData1.put("Tom", "SDET1"); // k-v pair -->entry set
		empData1.put("Peter", "SDET2");
		empData1.put("Ravi", "SDET3");
		empData1.put("Lisa", "SDET4");
		empData1.put(null, "SDET Manager");
		empData1.put(null, "SDET Director");
		empData1.put("Prateek", null);
		empData1.put("Usha", null);
		
		System.out.println(empData1);
	}

}
