//Page 213 Java Complete reference.
//In this example, the ArithmeticException class is a subclass of the 
//Exception class. If the Exception catch block comes before the 
//ArithmeticException one, there will be an error message stating that the
//second catch statement is unreachable because the exception has already 
//been caught. This is because superclasses catch statements catch all 
//exceptions including those of their subclasses.

//Qn. Why don't we then define catch statements at superclass level?
//Probably you wanna be specific to a subclass needs. 
package beginnersGuide;

public class SuperSubCatch1 {

	public static void main(String[] args) {
	
		try 
		{
			int a = 0;
			int b = 42/a;
		}
		
		catch(ArithmeticException e) 
		{ 
			System.out.println(e);
		}
		catch(Exception e) {
			System.out.println("Generic Exception catch.");	
		}
		
	}
}