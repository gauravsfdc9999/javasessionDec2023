package javasessions;

import java.util.Arrays;

public class FrequencyCharacters {

	public static void main(String[] args) {
		
		String str = "My Name is Gaurav Gupta ji.";
		String lowerStr = str.toLowerCase().replace(' ', '#');
		System.out.println(lowerStr);
		int [] counter = new int[127];
		//length of string
		int lengthString = lowerStr.length();
		
		//loop through string and count the frequency of every character
		for(int i=0;i<lengthString;i++) {
			if(lowerStr.charAt(i)!= '#' & lowerStr.charAt(i)!= '.') {
				counter[(int) lowerStr.charAt(i)]++;
			}
		}
		//System.out.println("counter -> "+Arrays.toString(counter));
		
		//print frequency
		for(int i=0;i<127;i++) {
			if(counter[i]!=0 ) {
				System.out.println((char)i +" --> "+counter[i]);
			}
			
		}

	}

}
