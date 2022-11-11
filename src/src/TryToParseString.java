package src;

public class TryToParseString {

	public static void main(String[] args) {
		
		int integer = 0; 
		String string = "hello";
		
		try 
		{
			integer = Integer.parseInt(string);
		}
		
		catch (NumberFormatException Exception)
		{
			System.out.println("Error: not a string ");
			System.exit(0);
		}
		
		System.out.println("Input: " + integer);
	}

}
