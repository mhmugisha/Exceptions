package beginnersGuide;

public class ManuallyThrowException {

	public static void main(String[] args) {
		
		try 
		{
		System.out.println("Before throw");
		throw new ArithmeticException();
		}
		
		//Catch exception
		catch(ArithmeticException Aexc) {
			System.out.println("Exception caught");
			System.out.println(Aexc);//show which exception was caught
		}

		System.out.println("After try/catch block");
	}

}
