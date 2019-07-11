//Page 414, Java a Beginner's Guide.
//Method in this class generates an exception but does not handle it.
//When this method is called in main, it is caught by the catch in main.

package beginnersGuide;

public class ExceptionInMethod {

	//Generate an exception.
	 static void generateException()
	 {
		int[] nums = new int[4];
		System.out.println("Before exception is generated");
		
		nums[7] = 10; //exception generated and compiler has no prob. 
					  //Because it is a run-time error. 
		
		System.out.println("This won't be displayed");
	}
	
}
