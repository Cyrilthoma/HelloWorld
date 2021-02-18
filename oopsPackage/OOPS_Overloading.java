package oopsPackage;

public class OOPS_Overloading {
	
	    // Overloaded sum(). 
	    // This sum takes two int parameters 
	    public int sum(int x, int y) 
	    { 
	        return (x + y); 
	    } 
	  
	    // Overloaded sum(). 
	    // This sum takes three int parameters 
	    public int sum(int x, int y, int z) 
	    { 
	        return (x + y + z); 
	    } 
	  
	    // Overloaded sum(). 
	    // This sum takes two double parameters 
	    public double sum(double x, double y) 
	    { 
	        return (x + y); 
	    } 
	    
	    
	    public class OOPS_Overriding extends OOPS_Overloading
	    {
	    	public int sum(int x, int y) 
		    { 
		        return (x * y); 
		    } 
	    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Overloading Example: ");
		OOPS_Overloading s = new OOPS_Overloading(); 
        System.out.println(s.sum(10, 20)); 
        System.out.println(s.sum(10, 20, 30)); 
        System.out.println(s.sum(10.5, 20.5)); 
        
        System.out.println("Overriding Example: ");
        //OOPS_Overriding.sum(5,5);
        
        

	}
	
	

}
