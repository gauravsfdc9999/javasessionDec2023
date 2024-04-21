package StringManipulation;
//String builder (thread non-safe/non-sync for read operation) and String buffer (thread safe/sync for write operation) are used for string manipulation

public class StringVsStringBuilderVsStringBuffer {

	public static void main(String[] args) {
		//mutable
		StringBuffer stringMessage= new StringBuffer("some message");//1--heap
		stringMessage.append(" additional messages");
		System.out.println(stringMessage);
		
		String message = "my message ";
		StringBuilder stringbuilderMessage = new StringBuilder(message);
		stringbuilderMessage.append(stringMessage);
		System.out.println(stringbuilderMessage);
		
	}

}
