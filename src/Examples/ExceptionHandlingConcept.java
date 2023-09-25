package Examples;

public class ExceptionHandlingConcept {

	public static void main(String[] args) {
		
		
		int i=10;
		
		try {//implement the risky code
			System.out.println(10/110);
		}catch(ArithmeticException E) {// catch the errors from the try block
			
			System.out.println(E.getMessage());
		}
		
		finally { ///must and should executable code implement in finally block
			System.out.println("executing my code ");
		}


	}

}
