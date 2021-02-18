package oopsPackage;

public class OOPS_AbstractionMAIN {

	
	   public static void main(String [] args) {
		  OOPS_Abstraction s = new OOPS_Abstraction("Mohd Mohtashim", "Ambehta, UP", 3, 3600.00);
	      //OOPS_AbstractionONE e = new OOPS_AbstractionONE("John Adams", "Boston, MA", 2, 2400.00);
	      System.out.println("Call mailCheck using Salary reference --");
	      s.mailCheck();
	      System.out.println("\n Call mailCheck using Employee reference--");
	      //e.mailCheck();
	   }
	

}
