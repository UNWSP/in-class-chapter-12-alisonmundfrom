package src;

public class TwoExceptions {

	public static void main(String[] args) {
		
		try 
		{
			System.out.println("");
			int myArray[] = new int[5];
			System.out.println("Array element 10 " + myArray[10]);
			myArray[5]=10/0;
		}
		
		
		catch (ArrayIndexOutOfBoundsException e)
		{
			System.out.println("Value not within the bounds of the array. ");
		}
		
		
		catch (ArithmeticException e)
		{
			System.out.println("Cannot divide by 0. ");
		}
		
		
		catch (Exception e)
		{
			System.out.println("Exception " + e.getMessage());
		}
		
		System.out.println("");

	}

}
