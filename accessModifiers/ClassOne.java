package accessModifiers;

public class ClassOne extends ClassTwo
{

	
	public void finalize()
	{
		
	}
	
	@SuppressWarnings("static-access")
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		try
		{
			
		
			city = "Chennai";
			
		//System.out.println("Value of A is "+ClassTwo.org);
		System.out.println("ClassOne - Value of name is "+ClassTwo.name1);
		System.out.println("ClassOne - Value of city is "+ClassTwo.city);
		System.out.println("ClassOne - Value of country is "+ClassTwo.country);
		System.out.println(1/0);
		}
		catch(ArithmeticException e)
		{
			System.out.println("Catch Block");
			e.printStackTrace();
		}
		finally
		{
			System.out.println("Finally Block, will execute even if try or catch happens.");
		}

	}

}
