//Page 419 Java a Beginner's Guide.
//Example demonstrates that if you catch the superclass (in this case
//catch(Throwable) which is a superclass of all Exception classes, then 
//you will catch the exception in class ArithmeticException - division by
//zero. 

package beginnersGuide;

public class SuperSubCatch2 {

	public static void main(String[] args) {
		int[] numerator = {4,8,16,32,64,128,256,512};
		int[] denomin = {2,0,4,4,0,8};
		
		for(int i = 0; i < numerator.length; i++)
			try {
			System.out.println(numerator[i] + "/" + denomin[i] + " = "  + numerator[i]/denomin[i]);
			}
			
		//Note that this subclass catch must come before the superclass
		//catch(Throwable). 
			catch(IndexOutOfBoundsException eI) {
				System.out.println("No matching element found!");
			}
			
		//Since Throwable is the superclass of all Exception classes, its
		//catch catches the exception in class ArithmeticException - division
		//by zero. 
			catch(Throwable et) {
				System.out.println("Some exception occured!!");
				System.out.println(et);
			}
		
	
	}
	
}
