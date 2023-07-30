
class Demo
{
	
	public Demo()
	{
		System.out.println("Inside Demo Constructor");
	}
	public void fun()
	{
		System.out.println("Inside Demo fun");
	}
	
	public void fun(int i)
	{
		System.out.println("Inside Demo fun with 1 integer");
	}
	
	public void fun(int i, int j)
	{
		System.out.println("Inside Demo fun with 2 integer");
	}
	
	public void fun(double i)
	{
		System.out.println("Inside Demo fun with 1 double parameter");
	}
	
}

class Overloading
{
	public static void main(String arr[])
	{
		Demo obj = new Demo();
		obj.fun();
		obj.fun(10);
		obj.fun(10,20);
		obj.fun(11.30);
	}
}
		