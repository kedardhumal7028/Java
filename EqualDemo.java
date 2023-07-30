class Demo
{
	public int iNo1;
	public int iNo2;
	
	public Demo(int A, int B)
	{
		iNo1 = A;
		iNo2 = B;
		
	}
}

class EqualDemo
{
	public static void main(String a[])
	{
		
		String s1 = "Hello";
		String s2 = "Hello";
		
		//Demo obj1 = new Demo(11,21);
		//Demo obj2 = new Demo(11,21);
		
		System.out.println("HasCode of s1 is : "+s1.hashCode());
		System.out.println("HasCode of s2 is : "+s2.hashCode());
		
		if(s1.equals(s2))
		{
			System.out.println("Objects are Same");
		}
		else
		{
			System.out.println("Objects are Different");
		}
		
		if(s1 == s2)
		{
			System.out.println("Objects are Same");
		}
		else
		{
			System.out.println("Objects are Different");
		}
	}
}