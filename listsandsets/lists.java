package listsandsets;

import java.util.ArrayList;
import java.util.Enumeration;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.List;
import java.util.Properties;
import java.util.Set;

import accessModifiers.ClassTwo;


enum van{
	MbVans, SuzukiVans;
}


public class lists extends ClassTwo{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		//ArrayList
		ArrayList<String> cars = new ArrayList<String>();
		cars.add("Maruthi Suzuki");
		cars.add("BMW");
		cars.add("VOLVO");
		cars.add("Maruthi Suzuki");
		
		Iterator is = cars.iterator();
		while(is.hasNext())
		{
			System.out.println("ArrayList Values = "+is.next());
		}
		
		
		//HashTable
		Hashtable balance = new Hashtable();
		balance.put("Joe", new Double(22.50));
		balance.put("Angel", new Double(122.50));
		balance.put("Cyril", new Double(322.50));
		balance.put("Joe", new Double(22.50));
		
		
		Enumeration name = balance.keys();
		
		String str;
		while(name.hasMoreElements())
		{
			str = (String) name.nextElement();
			System.out.println("HashTable value - "+str+" - "+balance.get(str));
		}
		
		
		
		
		
		//Properties -  Key is a String and Value is also a String.
		Properties bike = new Properties();
		bike.put("SUZUKI", "Access125");
		bike.put("YAMAHA", "GLADIATOR");
		bike.put("YAMAHA", "FZ");
		
		Set bikename = bike.keySet();
		Iterator iv = bikename.iterator();
		
		String bikevalue;
		while(iv.hasNext())
		{
			bikevalue = (String) iv.next();
			System.out.println("Properties Value - "+bike.getProperty(bikevalue));
		}
		
		
		
		//Enum Print
		van v = van.MbVans;
		System.out.println("Enum Value "+v);
		
		
		
		//Access Modifers Testing
		//System.out.println("Value of A is "+org);
		System.out.println("Value of name is "+name1);
		System.out.println("Value of city is "+city);
		//System.out.println("Value of country is "+country);
		System.out.println("Value of State is "+getState());
		

	}

}
