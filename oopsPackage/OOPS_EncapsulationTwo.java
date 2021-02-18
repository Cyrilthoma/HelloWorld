package oopsPackage;

public class OOPS_EncapsulationTwo {
	
	public static void main(String [] args){
		
		OOPS_Encapsulation obj = new OOPS_Encapsulation();
                // Setting values of the variables
		obj.setAge(25);
		obj.setName("Cyril");
		
		System.out.println("My name is "+ obj.getName());
		System.out.println("My age is "+ obj.getAge());
		
	}

}
