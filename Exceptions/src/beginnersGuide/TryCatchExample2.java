//Page 413 - Java a Beginner's guide.
//Example demonstrates exception handling.
//Here, the array index is set within bounds - 3.
package beginnersGuide;

public class TryCatchExample2 {

	public static void main(String[] args) {
		
		try 
		{
		int[] nums = new int[4];
		System.out.println("Before catch statement");
		nums[3] = 10; //within bounds [0-3]. 
		
		//This will now be printed since there is no exception, control
		//will not pass to catch and is its skipped/not executed.  
		System.out.println("This is now displayed");
		}
		
		//Now catch block not executed and program resumes immediately
		//after the catch block.
		catch(ArrayIndexOutOfBoundsException exc) 
		{
		System.out.println("Index out of bounds!");	
		System.out.println(exc);
		}
		
		System.out.println("After skipping catch statement");

	}
}
