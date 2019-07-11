//This example demonstrates that when you catch an exception, the program 
//does terminate when an exception is thrown. Instead it handles it 
//gracefully and continues to the next point of control without termination 

package beginnersGuide;

public class NoProgTermination {

	public static void main(String[] args) {
		int[] numerator = {4, 8, 16, 32, 64, 128};
		int[] denomin = {2,0,4,4,0,8};
		
		for(int i = 0; i < numerator.length; i++ )
			
		try 
		{
		System.out.println(numerator[i] + "/" + denomin[i] + " = " 
						   + numerator[i]/denomin[i]);
		}
			
		catch(ArithmeticException e) {
			System.out.println("Can't divide by zero");
		}

	}

}
