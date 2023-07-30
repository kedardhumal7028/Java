import java.util.*;

class Base
{
	public int A,B;
	
	public Base()
	{
		System.out.println("Inside base constuctor");
		this.A = 10;
		this.B = 20;
	}
	
	public void fun()   	//Defination
	{
		System.out.println("Inside base fun");
	}
	
	public void gun()		//Defination
	{
		System.out.println("Inside base gun");
	}
	
	public void fun(int iNo)		//Overloaded Defination
	{
		System.out.println("inside base fun with one parameter");
	}
}
	
class Derived extends Base  // class Derived : public Base
{
	public int x,y;
		
	public Derived()
	{
		System.out.println("Inside Derived constuctor");
		this.x = 30;
		this.y = 40;
	}
		
	public void sun()		//Defination
	{
		System.out.println("Inside Derived Sun");
	}
		
	public void gun()		//Overloaded Defination
	{
		System.out.println("Inside Derived gun");
	}
	
}
	
class Single
{
	public static void main(String arg[])
	{
		Base bobj1 = new Base();				//no casting
		//Derived dobj1 = new Derived();		//no casting
		//Base bobj2 = new Derived();			//upcasting
		//Derived dobj2 = new Base();		//downcasting
	}
	
}