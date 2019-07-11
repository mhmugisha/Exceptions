//Example on page 414 Java, a Beginner's Guide.


package beginnersGuide;

public class ExceptionInMethodTest {

	public static void main(String[] args) {
		
		//Method generateException called in main. Recall this method 
		//generated an exception in class ExceptionInMethod.
		
		try {
			ExceptionInMethod.generateException();
		}

		//Exception generated in method call caught here.
		catch(IndexOutOfBoundsException excptn) {
			System.out.println("Index out of bounds!");
			System.out.println(excptn);//Display just to show that an exception
									//can be passed as a parameter to a method. 
		}
		
		System.out.println("After catch statement");
	}

}
