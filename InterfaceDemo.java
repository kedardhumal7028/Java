
interface Circle
{
	float PI = 3.14f;
	
	float Area(float Radius);
	float Circumfarance(float Radius);
}

class Marvellous implements Circle
{
	public float Area(float Radius)
	{
		return PI * Radius * Radius;
	}
	public float Circumfarance(float Radius)
	{
		return 2 * PI * Radius;
	}
}

class InterfaceDemo
{
	public static void main(String arg[])
	{
		System.out.println("Value of PI is : "+Circle.PI);	 //to demonstrate public and static
		///Circle.PI = 7.12f;   //to demonstrate final
		Circle cobj = new Marvellous();
		float Ret = 0.0f;
		Ret = cobj.Area(10.5f);
		System.out.println("Area is : "+Ret);
		Ret = cobj.Circumfarance(10.5f);
		System.out.println("Circumfarance is : "+Ret);

	}
}