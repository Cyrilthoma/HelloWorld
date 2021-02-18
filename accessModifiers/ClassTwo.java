package accessModifiers;

 
public class ClassTwo {
	
	private String a="Thomas";
	private static String org = "HCL";
	
	public static String name1 = "Thomas";
	protected static String city = "Chennai";

	static String country = "India";
	private static String state = "TamilNadu";
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//a = "Cyril";
		org ="Cyril";
		
		System.out.println("Value of A is "+org);
		System.out.println("Value of name is "+name1);
		System.out.println("Value of city is "+city);
		System.out.println("Value of country is "+country);
		System.out.println("Value of State is "+getState());

	}
	public static String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
}
	class ClassThree
	{
		static void printall()
		{
		//System.out.println("Value of A is "+ClassTwo.org);
		System.out.println("Value of name is "+ClassTwo.name1);
		System.out.println("Value of city is "+ClassTwo.city);
		System.out.println("Value of country is "+ClassTwo.country);

	}

}
