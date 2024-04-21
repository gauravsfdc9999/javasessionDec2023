package StringManipulation;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import ExceptionHandling.MyException;

public class StringConcept {

	public static void main(String[] args) {
		String str = "Hello This is my java code and i am so happy i am also sad"; //collection of characters
		System.out.println("Length of String--> "+str.length());
		//li = 0;
		//hi = 37
		//lenght = hi+1
		
		System.out.println("char at 0 index --> "+str.charAt(0));
		System.out.println("char at 0 index --> "+str.charAt(37));
		//System.out.println("char at 0 index --> "+str.charAt(38));
		//throw new MyException("Exception occured");
		System.out.println(str.indexOf("T"));
		System.out.println(str.indexOf("i"));
		System.out.println(str.indexOf("i", 0));
		int index1 = str.indexOf("i", 0)+1; //1st occurrence of i
		
		System.out.println(str.indexOf('i', index1)); //2nd occurrence of i
		int index2=str.indexOf("i", index1)+1;
		System.out.println(str.indexOf('i', index2)); //3d occurrence of i
		
		//3rd occurence - str.indexOf('i', str.indexOf("i", str.indexOf("i", 0)+1)+1)
		
		System.out.println("------");
		int count=0;
		char valueString = 'p';
		int firstIndex = str.indexOf(valueString);
		for(int i=0;i<str.length();i++) {
			//int index = firstIndex+count;
			if(str.charAt(i)== valueString) {
				count++;
				//System.out.println("values of count --> "+count );
			}
			
			
		}
		System.out.println("final of count --> "+valueString +" char is :"+count );
		
		String mesg = "this is my java code";
		System.out.println(mesg.indexOf("java"));
		System.out.println(mesg.indexOf("python"));
		
		if(mesg.indexOf("java") == -1) {
			System.out.println("incorrect message FAIL");
		}
		else {
			System.out.println("correct message");
		}
		
		//to remove corner spaces
		String test = "    hello world    ";
		System.out.println(test.trim());
		
		//replace method
		String dob = "01-01-1990";
		System.out.println(dob.replace("-", "/"));
		
		//removing middle spaces
		System.out.println(test.replace(" ", ""));
		
		String top = "      hello    World  testtt  ";
		System.out.println(top.replaceAll(" ", "")); //performance is good
		
		String msg = "Java Python Ruby";
		System.out.println(msg.replace("Java", "JS"));
		
		//split function -- splitting the string on basis on something
		String pop="javascript;java;python;ruby";
		String arr[] = pop.split(";");
		System.out.println(Arrays.toString(arr));
		System.out.println(arr.length);
		
		String rest = "xXHelloSeleniumxxXPythonXxXAutomationXxXLabs";
		String rs[]=rest.split("xX");
		System.out.println(rs[0]);
		System.out.println(rs[0].length());
		System.out.println(Arrays.toString(rs));
		
		String empData = "gaurav;gupta;pune;india;999000999";
		//System.out.println(StringUtils.cap);
		String empData1=empData.replace(";", ".");
		System.out.println(empData1);
		String [] ed = empData1.split("\\.");
		System.out.println(Arrays.toString(ed));
		
		System.out.println("***************");
		//uppercase or lower case
		String name="Test Automation Labs";
		System.out.println(name.toLowerCase());
		System.out.println(name.toUpperCase());
		
		String domain = "          hello   selenium    ";
		String dom = domain.replaceAll("\\s+", ""); //replace white spaces
		System.out.println(dom);
		
		String t1="your order id is 12345t";
		System.err.println(t1.replaceAll("[\\D+]", "")); //non digit will be remove
		
		String t2="your user id is 9090 order is is 12345";
		System.out.println(t2.replaceAll("\\D+", "")); //909012345
		
		//pattern and matches
		Pattern pattern= Pattern.compile("\\d+");
		Matcher matcher= pattern.matcher(t2);
		Map<String,String> variable= new HashMap<>();
		ArrayList<String> arrayList= new ArrayList<>();
//		if(matcher.find()) {
//			variable.put("userId", matcher.group());
//		}
//		
//		if(matcher.find()) {
//			variable.put("orderID", matcher.group());
//		}
		
		while(matcher.find()) {
			System.out.println(matcher.group());
			arrayList.add(matcher.group());
		}
		

		
		System.out.println("User ID "+variable.get("userId") );
		System.out.println("Order ID "+variable.get("orderID") );
		System.out.println("Array list ->"+arrayList.get(0));
		System.out.println("Array list ->"+arrayList.get(1));
		
		String tr = "hello!! this is my value .$12334*";
		System.out.println(tr.replaceAll("[^0-9a-zA-Z\\s]", ""));
		System.out.println(tr.replaceAll("[a-zA-Z\\s!!.]", ""));
		System.out.println(tr.replaceAll("[^a-zA-Z\\s!!.]", ""));
		
		//prog to change string first letter as capital
		String message = "this is about java";
		char[] newMessage = message.toCharArray();
		boolean foundSapce = true;
		
		for(int i=0;i<newMessage.length;i++) {
			// if the array element is a letter
			if(Character.isLetter(newMessage[i])) {
				// check space is present before the letter
				if(foundSapce) {
					newMessage[i]=Character.toUpperCase(newMessage[i]);
					foundSapce=false;
				}
			}
			else {
				foundSapce=true;
			}
		}
		message=String.valueOf(newMessage);
		System.out.println("message updated -->"+message);
		
		
		
	}
	


}
