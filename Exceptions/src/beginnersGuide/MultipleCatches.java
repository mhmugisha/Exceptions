package beginnersGuide;

public class MultipleCatches {

	public static void main(String[] args) {
		
		int[] numerator = {4,8,16,32,64,128,256,512};
		int[] denomin = {2,0,4,4,0,8};
		
		for(int i = 0; i < numerator.length; i++)
			
			try {
			System.out.println(numerator[i] + "/" + denomin[i] + " = " + numerator[i]/denomin[i]);
			}
		
		catch(ArithmeticException eA) 
		{
			System.out.println("Can't divide by zero");
			//System.out.println(eA);
		}
		catch(ArrayIndexOutOfBoundsException eAI) 
		{
		System.out.println("No matching number");
		}
	}

}
