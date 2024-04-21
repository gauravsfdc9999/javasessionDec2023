package javasessions;

import java.util.ArrayList;

public class ArrayListDemo {

	public static void main(String[] args) {
		//ArrayList
		ArrayList<String> empNamesList = new ArrayList<String>();//pc=0 and vc=10
		empNamesList.add(0,"Gaurav");
		System.out.println(empNamesList);
		empNamesList.add(1,"Anshul");
		System.out.println(empNamesList);
		System.out.println(empNamesList.size());
		empNamesList.set(0, "Anshu1");
		System.out.println(empNamesList.size());
		System.out.println(empNamesList);
		System.out.println(empNamesList.hashCode());
		empNamesList.add(0, "Anshu2");

		System.out.println(empNamesList);
		empNamesList.add(0, "Anshu3");
		System.out.println(empNamesList);
		empNamesList.add("Anshul");
		empNamesList.add("Anshul");
		
		System.out.println("----------------");
		//print index and values
		int i=0;
		for(String e:empNamesList) {
			if(e.equalsIgnoreCase("anshul")) {
				System.out.println("Requested Value Found at Index : "+i+"-"+e);
				}
			i++;
		}
		System.out.println("value of i: "+i);
	}

}
