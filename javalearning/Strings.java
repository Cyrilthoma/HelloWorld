package javalearning;

import java.io.UnsupportedEncodingException;

public class Strings {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		//
		//Java - String charAt() Method
		System.out.println();
		System.out.println("Java - String charAt() Method");
		
		String s = "Strings are immutable";
	      char result2 = s.charAt(8);
	      System.out.println(result2);
	      
//***************************************************************************************************************	      
	      
	      //String CompareTo. Gives value as 0 if equal or 10 if not equal.
			System.out.println();
			System.out.println("String CompareTo. ");
	      String str1 = "Strings are immutable";
	      String str2 = new String("Strings are immutable");
	      String str3 = new String("Integers are not immutable by cyrilIntegers are not immutable by cyrilIntegers are not immutable by cyril");
	      String str4 = new String("Integers are not immutable by cyrilIntegers are not immutable by cyrilIntegers are not immutable by cyril");
	      
	      System.out.println(str1.length());
	      System.out.println(str2.length());
	      System.out.println(str3.length());
	      
	      int result1 = str1.compareTo( str2 );
	      System.out.println(result1);
	      
	      result1 = str2.compareTo( str3 );
	      System.out.println(result1);
	      
	      result1 = str3.compareTo( str4);
	      System.out.println(result1);
	      
//***************************************************************************************************************	      
	      
	      //String compareToIgnoreCase() Method
	      //This method compares two strings lexicographically, ignoring case differences.
	      //This method returns a negative integer, zero, or a positive integer as the specified String is greater than, equal to, 
	      //or less than this String, ignoring case considerations.
	      
			System.out.println();
			System.out.println("String compareToIgnoreCase() Method");
	       str1 = "Strings are immutable";
	       str2 = "Strings are immutable";
	       str3 = "Integers are not immutable";

	      int result = str1.compareToIgnoreCase( str2 );
	      System.out.println(result);

	      result = str2.compareToIgnoreCase( str3 );
	      System.out.println(result);

	      result = str3.compareToIgnoreCase( str1 );
	      System.out.println(result);
	      
//***************************************************************************************************************	      
	      
	      //String Concat
	      //This method appends one String to the end of another. The method returns a String with the value of the String passed into the method, appended to the end of the String, used to invoke this method
			System.out.println();
			System.out.println("String Concat");
	      s = "Strings are immutable";
	      s = s.concat(" all the time");
	      System.out.println(s);
	      
	      
//***************************************************************************************************************	      
	      
	      //Java - String contentEquals() Method
	      //This method returns true if and only if this String represents the same sequence of characters as specified in StringBuffer.
			System.out.println();
			System.out.println("Java - String contentEquals() Method");
	       str1 = "Not immutable";
	       str2 = "Strings are immutable";
	      StringBuffer str5 = new StringBuffer( "Not immutable");

	      boolean  result3 = str1.contentEquals( str5 );
	      System.out.println(result);
		  
	      result3 = str2.contentEquals( str5 );
	      System.out.println(result3);
	      
//***************************************************************************************************************	      
	      
	      //Java - String copyValueOf() Method
			System.out.println();
			System.out.println("Java - String copyValueOf() Method");
	      char[] Str6 = {'h', 'e', 'l', 'l', 'o', ' ', 'w', 'o', 'r', 'l', 'd'};
	      String Str7 = "";
	      Str7 = Str7.copyValueOf( Str6 );
	      System.out.println("Returned String: " + Str7);
	      
//***************************************************************************************************************	      
	      
	      //Java - String endsWith() Method
	  	System.out.println();
		System.out.println("Java - String endsWith() Method");
		
	      String Str = new String("This is really not immutable!!");
	      boolean retVal;

	      retVal = Str.endsWith( "immutable!!" );
	      System.out.println("Returned Value = " + retVal );

	      retVal = Str.endsWith( "immu" );
	      System.out.println("Returned Value = " + retVal );

//***************************************************************************************************************	      
	      
	      //Java - String equals() Method
		  	System.out.println();
			System.out.println("Java - String equals() Method");
	      String Str1 = new String("This is really not immutable!!");
	      String Str2 = Str1;
	      String Str3 = new String("This is really not immutable!!");
	      //boolean retVal;

	      retVal = Str1.equals( Str2 );
	      System.out.println("Returned Value = " + retVal );

	      retVal = Str1.equals( Str3 );
	      System.out.println("Returned Value = " + retVal );

//***************************************************************************************************************
	      
	      //Java - String equalsIgnoreCase() Method
		  	System.out.println();
			System.out.println("Java - String equalsIgnoreCase() Method");
			
	       Str1 = new String("This is really not immutable!!");
	       Str2 = Str1;
	       Str3 = new String("This is really not immutable!!");
	       String Str4 = new String("This IS REALLY NOT IMMUTABLE!!");
	       

	      retVal = Str1.equals( Str2 );
	      System.out.println("Returned Value = " + retVal );

	      retVal = Str1.equals( Str3 );
	      System.out.println("Returned Value = " + retVal );

	      retVal = Str1.equalsIgnoreCase( Str4 );
	      System.out.println("Returned Value = " + retVal );
	      
//***************************************************************************************************************	      
	      
	      //Java – String getBytes() Method
	      System.out.println();
			System.out.println("Java – String getBytes() Method");
			
			 Str1 = new String("Welcome to Tutorialspoint.com");
		      
		      try {
		          Str2 = new String( Str1.getBytes( "UTF-8" ));
		         System.out.println("Returned Value " + Str2 );
		         Str2 = new String (Str1.getBytes( "ISO-8859-1" ));
		         System.out.println("Returned Value " + Str2 );
		      } catch ( UnsupportedEncodingException e) {
		         System.out.println("Unsupported character set");
		      }
		      
//***************************************************************************************************************
		      //
		    System.out.println();
			System.out.println("");   
			
			 Str1 = new String("Welcome to Tutorialspoint.com");
		      try {
		          Str2 = new String(Str1.getBytes( "UTF-8" ));
		         System.out.println("Returned Value " + Str2 );
		         Str2 = new String (Str1.getBytes( "ISO-8859-1" ));
		         System.out.println("Returned Value " + Str2 );
		      } catch ( UnsupportedEncodingException e) {
		         System.out.println("Unsupported character set");
		      }
		      
//***************************************************************************************************************
		      //
		    System.out.println();
			System.out.println("");  		      
		      
//***************************************************************************************************************
		      //
		    System.out.println();
			System.out.println("");  
//***************************************************************************************************************
		      //
		    System.out.println();
			System.out.println("");  
			
//***************************************************************************************************************
		      //
		    System.out.println();
			System.out.println("");  
			
//***************************************************************************************************************
		      //
		    System.out.println();
			System.out.println("");  
			
//***************************************************************************************************************
		      //
		    System.out.println();
			System.out.println("");  
			
//***************************************************************************************************************
		      //
		    System.out.println();
			System.out.println("");  
			
//***************************************************************************************************************
		      //
		    System.out.println();
			System.out.println("");  
			
//***************************************************************************************************************
		      //
		    System.out.println();
			System.out.println("");  
			
//***************************************************************************************************************
		      //
		    System.out.println();
			System.out.println("");  
			
//***************************************************************************************************************
		      //
		    System.out.println();
			System.out.println("");  
			
//***************************************************************************************************************
		      //
		    System.out.println();
			System.out.println("");  
			
//***************************************************************************************************************
		      //
		    System.out.println();
			System.out.println("");  
			
//***************************************************************************************************************
		      //
		    System.out.println();
			System.out.println("");  
			
//***************************************************************************************************************
		      //
		    System.out.println();
			System.out.println("");  
			
//***************************************************************************************************************
		      //
		    System.out.println();
			System.out.println("");  
			
//***************************************************************************************************************
		      //
		    System.out.println();
			System.out.println("");  
			
//***************************************************************************************************************
		      //
		    System.out.println();
			System.out.println("");  
			
//***************************************************************************************************************
		      //
		    System.out.println();
			System.out.println("");  
			
//***************************************************************************************************************
		      //
		    System.out.println();
			System.out.println("");  
			
//***************************************************************************************************************
		      //
		    System.out.println();
			System.out.println("");  
			
//***************************************************************************************************************
		      //
		    System.out.println();
			System.out.println("");  
			
//***************************************************************************************************************
		      //
		    System.out.println();
			System.out.println("");  
			
//***************************************************************************************************************
		      //
		    System.out.println();
			System.out.println("");  
			
//***************************************************************************************************************
		      //
		    System.out.println();
			System.out.println("");  
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
	}

}
