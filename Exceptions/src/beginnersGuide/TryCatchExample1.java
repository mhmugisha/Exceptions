//Page 413 - Java a Beginner's guide.
//Example demonstrates exception handling.
//Here, the array index is deliberately set out of bounds - 7 (beyond 3).

package beginnersGuide;

public class TryCatchExample1 {

	public static void main(String[] args) {
		
		try 
		{
		int[] nums = new int[4];
		System.out.println("Before exception is generated");
		nums[7] = 10; // tries to set out of bounds [0-3]. 
		
		//Not printed bse when exception is caught excution/control skips 
		//this and passes to the catch block.
		System.out.println("This won't be displayed");
		}
		
		catch(ArrayIndexOutOfBoundsException exc) 
		{
		System.out.println("Index out of bounds!");	
		System.out.println(exc);
		}
		
		System.out.println("After catch statement");

	}
}
