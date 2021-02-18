package oopsPackage;


abstract class animal
{
	//Abstract Variables can be final, public, private, protected 
	int i = 5;
	final int j = 6;
	static int k = 4;
	protected int l = 5;
	
	public abstract void animalsound();			//Abstract methods provide only declaration. Implementation in other class
	
	public void hibernate()
	{
		System.out.println("Hibernation");
	}
}

interface sea
{
	//Default Interface Variables are final
	final int a = 5;
	int b=6;
	public void whale();
	public abstract void dolphin();
}
interface air
{
	public void eagle();
	public abstract void phoenix();
}

class zoology extends animal implements sea,air {

	@Override
	public void animalsound() {
		System.out.println("Wee Wee");
		// TODO Auto-generated method stub
		
	}

	@Override
	public void eagle() {
		// TODO Auto-generated method stub
		System.out.println("I am Eagle");
		
	}

	@Override
	public void phoenix() {
		// TODO Auto-generated method stub
		System.out.println("I am Phoenix");
		
	}

	@Override
	public void whale() {
		// TODO Auto-generated method stub
		System.out.println("I am Whale");
		
	}

	@Override
	public void dolphin() {
		// TODO Auto-generated method stub
		System.out.println("I am Dolphin");
		
	}
	public void abstractadd()
	{
//		i = 10;
//		j = 10;
//		k=10;
//		l=10;
		
		int z = i+j+k+l;
		System.out.println("Abstract Variables Add "+z);
	}
	
	public void interfaceadd()
	{
		int c = a+b;
		//b = 23;
		//a=33;
		System.out.println("Interface variables add of C is "+c);
	}
	
	


}

class Abstraction
{
	public static void main(String args[])
	{
		zoology o = new zoology();
		o.animalsound();
		o.hibernate();
		
		
		o.dolphin();
		o.eagle();
		o.phoenix();
		o.whale();
		o.interfaceadd();
		o.abstractadd();
	}
}
