package beginnersGuide;

public class Finally {
public static void generateException(int what) {
	int t;
	int[] nums = new int[2];
	System.out.println("Receiving " + what);
	
	try {
		switch(what)
		{
		case 0:
			t = 10/what;//Generate divide by zero exception
			break;
		case 1:
			nums[4] = 4;//Array Index out of bounds exception
			break;
		case 2:	
		return; //return from try block
		
		}
	}
	
	catch(ArithmeticException e1) {
		System.out.println("Can't divide by zero!");
	}
	
	catch(IndexOutOfBoundsException e2) {
		System.out.println("No matching element found!");
	}
	
	finally {
		System.out.println("Leaving try");//Executed on the way out of try/catch
		System.out.println();
	}
}
	
	
}
