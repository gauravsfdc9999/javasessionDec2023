package ExceptionHandling;

public class ThrowKeyword {

	public static void main(String[] args) {
		String data = null;
		try {
			if(data==null) {
				throw new Exception("DATANOTFound");
			}
		}
		catch(Exception e) {
			e.printStackTrace();
		}

		
	}

}
