package ExceptionHandling;

public class FinallyBlockQuestion {

	public static int getMarks(String studentName) {
		System.out.println("getting marks for : "+studentName);
		switch (studentName.toLowerCase()) {
		case "rahul":
			try {
				int i=9/3;
				return 80;
			} catch (ArithmeticException e) {
				System.out.println("AE exception is coming--line 11 class FinallyBlockQuestion");
				return 70;
			}
			finally {
				System.out.println("inside finally");
				return 60;
			}
			//return 90;
			//break;
		case "gaurav":
			return 100;
		case "om":
			return 90;
		default:
			throw new IllegalArgumentException("Student does not exists");
		}

	}
	
	public static void main(String[] args) {

		FinallyBlockQuestion obj = new FinallyBlockQuestion();
		int marks = obj.getMarks("ffg");
		System.out.println(marks);
		
		
		
		
		
	}

}
