package javasessions;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class ArrayArrayListAssignments {
	static int wheels = 4;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// WAP to delete a specific number from the given array.
		int p[] = { 1, 4, 5, 2, 3, 22, 31, 2, 23 }; // remove 22
		int[] updatedArray = new int[p.length - 1];
		int j = 0;
		for (int i = 0; i < p.length; i++) {
			if (p[i] != 22) {
				updatedArray[j] = p[i];
				j++;
			}
		}
		System.out.println("Updated Array: " + Arrays.toString(updatedArray));

		// Write a program to create a static Array, having following cricket data:
		Object cricketPlayer1[] = new Object[6];
		cricketPlayer1[0] = "sachin";
		cricketPlayer1[1] = 45;
		cricketPlayer1[2] = "Mumbai Indians";
		cricketPlayer1[3] = "14-Apr-1979";
		cricketPlayer1[4] = "M";
		cricketPlayer1[5] = 100;
		System.out.println("sachine records:" + Arrays.toString(cricketPlayer1));

		Object cricketPlayer2[] = { "M.S. Dhoni", 40, "Chennai SuperKings", "20-March-1988", "M", 98 };
		System.out.println("sachine records:" + Arrays.toString(cricketPlayer2));

		// Write a Java program to create a new array list, which contains all color
		// names
		ArrayList<String> colors = new ArrayList<String>();
		colors.add("Red");
		colors.add("Pink");
		colors.add("Blue");
		System.out.println("Colors in Array list are : " + colors);
		// using for each loop
		for (String color : colors) {
			System.out.println(color);
		}

		// Write a Java program to retrieve an element at a specified index from a given
		// array list.
		colors.add("Yellow");
		colors.add("green");
		for (int i = 0; i < colors.size(); i++) {
			System.out.println("Colour at index " + i + " is:-" + colors.get(i));
		}

		// Write a Java program to update specific array element by given element.
		colors.set(1, "pinkishRed");
		System.out.println("updated color array:- " + colors);

		// Write a Java program to remove the third element from an array list. 
		colors.remove(2);
		System.out.println("updated color array after removing index 3:- " + colors);

		// Write a Java program to search an element in an array list using for loop.
		// Once we find that element, break the loop.
		colors.add(2, "Blue");
		String searchColor = "Blue";
		for (String color : colors) {
			if (color.equalsIgnoreCase(searchColor)) {
				System.out.println("Searched Color found- " + searchColor);
				System.out.println("Searched Color found: " + color);
				break;
			}
		}

		// reverse array list
		ArrayList<String> studentNames = new ArrayList<>();
		studentNames.add("Varun");
		studentNames.add("Reena");
		studentNames.add("Naveen");
		studentNames.add("Robin");
		studentNames.add("Peter");
		Collections.reverse(studentNames); // collections to reverse the array
		System.out.println("Reverse array list:- " + (studentNames));

		// Write a Java program to extract a portion of an array list. last 4
		// colors.remove(0);
		if (colors.size() != 0 && colors.size() > 4) {
			ArrayList<String> portionList = new ArrayList<String>(colors.subList(colors.size() - 4, colors.size()));
			System.out.println("portion of color list:- " + portionList);
		} else {
			System.out.println("Array list has less than 4 values");
		}

		// Write a Java program to empty an array list.
		if (colors.size() != 0) {
			// colors.clear(colors);
			colors.removeAll(colors);
		}
		System.out.println("Colors List after removing all values:- " + colors);

		// Write a Java program to trim the virtual capacity of an array list to the
		// current list size.
		colors.add("Red");
		colors.add("Green");
		colors.add("Blue");
		colors.add("Yellow");
		System.out.println("Original Size" + colors.size());
		colors.trimToSize();
		System.out.println("trimmed Size" + colors.size());

		// Write a Java program to print all the elements of an ArrayList using the
		// position of the elements.
		int q = 1;
		for (String color : colors) {
			System.out.println("Color at index: " + q + " is " + color);
			q++;
		}

		for (int i = 0; i < colors.size(); i++) {
			System.out.println("Element at index " + i + " is " + colors.get(i));
		}

		// Sample problem jagged array;
		System.out.println("Sample Problem-----Solution");
		int[][] arr1 = new int[3][];
		arr1[0] = new int[] { 1, 2 };
		arr1[1] = new int[] { 4, 5, 6 };
		arr1[2] = new int[] { 7, 8, 9, 10, 11 };
		System.out.println("Output at arr1[2][3]" + arr1[2][3]);

		// java code to count unique alphabets in string
		String alphabets = "geeksforgeeks";
		int alphCount = 0, i = alphabets.length() - 1;
		alphabets = alphabets.toLowerCase();
		alphabets = alphabets.replace(' ', '#');
		char alphaArray[] = alphabets.toCharArray();
		char alphaInitalArray[]= new char [26];
		for(char ch1='a';ch1<='z';ch1++) {
			alphaInitalArray[alphCount]=ch1;
			alphCount++;
		}
		
		System.out.println(Arrays.toString(alphaInitalArray));
		System.out.println(Arrays.toString(alphaArray));
		
//		for(int i1=0;i1<=alphaInitalArray.length-1 ;i1++) {
//			alphCount=0;
//			System.out.println(i1 +" and char " +alphaInitalArray[i1]) ;
//			for(int j1=0;j1<=alphaArray.length-1;j1++) {
//				if(alphaArray[j1] == alphaInitalArray[j1]) {
//					alphCount=alphCount+1;
//					System.out.println("Count for "+alphaInitalArray[j1]);
//				}
//			}
//			if(alphCount>0) {
//				System.out.println("Char count for: " +alphaArray[i1]+" is "+alphCount);
//			}
//			
//		}
		//creat array of size 256 ASCII_SIZE
		int count[]=new int[256];
		//length of string
		int len = alphabets.length();
		// Initialize count array index
		for(int i2=0;i2<len;i2++) {
			count[alphabets.charAt(i2)]++;
		}
		System.out.println(Arrays.toString(count));
		
		//create array of given string size
		char ch2[]= new char [len];
		for(int j2=0;j2<len;j2++) {
			ch2[j2]=alphabets.charAt(j2);
			int find =0;
			for(int j3=0;j3<j2;j3++) {
				//if match is found
				if(alphabets.charAt(j2)==ch2[j3]) {
					find++;
				}
			}
			if (find>0)
                System.out.println("Number of Occurrence of "+ alphabets.charAt(j2)+ " is:" + count[alphabets.charAt(j2)]);
		}
		
		// static initialization is not required and can be accessed via class name
		System.out.println(ArrayArrayListAssignments.wheels);

	}

}
