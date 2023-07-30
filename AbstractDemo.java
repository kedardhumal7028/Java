///abstract class is a class which contains 0 or more abstract method in it

abstract class Arithematic
{
	public int Addition(int No1, int No2)
	{
		return No1 + No2;
	}
	
	public abstract int Substraction(int No1, int No2);
}

class Marvellous extends Arithematic
{
	public int Substraction(int No1, int No2)
	{
		return No1 - No2;
	}
}

class AbstractDemo
{
	public static void main(String arg[])
	{
		Marvellous aobj = new Marvellous();
		int iRet = 0;
		iRet = aobj.Addition(11,10);
		System.out.println("Addition is :"+iRet);
		iRet = aobj.Substraction(11,10);
		System.out.println("Substraction is :"+iRet);
		
		
	}
	
}