package javalearning;

public class Constructors {	
	
		   String name;
		   
		   int empId;  
		   String empName; 
		   
		   //Constructor
		Constructors()
		{
		   this.name = "BeginnersBook.com";
		}
		//Constructor Overloading
		Constructors(int id, String name)
		{  
		       this.empId = id;  
		       this.empName = name;  
		}  
		   void info(){
		        System.out.println("Id: "+empId+" Name: "+empName);
		   } 

		
	public static void main(String[] args) {
		System.out.println("No arg Constructor");
		// TODO Auto-generated method stub
		Constructors obj = new Constructors();
	      System.out.println(obj.name);
	      System.out.println();
	      System.out.println("Parameterized Constructor");  
	    Constructors obj1 = new Constructors(10245,"Cyril");  
	    Constructors obj2 = new Constructors(92232,"Thomas");  
	  	obj1.info();  
	  	obj2.info();  

	}

}
