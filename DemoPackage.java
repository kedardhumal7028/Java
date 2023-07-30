import java.util.*;  // inbuild package

import Marvellous.Arithmetic;
import Marvellous.PPA.Loop;

class DemoPackage
{
	public static void main(String arr[])
	{
		Scanner sobj = new Scanner(System.in);
		
		System.out.println("Enter first number");
		int iNo1 = sobj.nextInt();
		
		System.out.println("Enter Second number");
		int iNo2 = sobj.nextInt();
		
		Arithmetic aboj = new Arithmetic(iNo1, iNo2);
		
		int iresult = aboj.Addition();
		System.out.println("Addition is : "+ iresult);
		
	    iresult = aboj.Substraction();
		System.out.println("Substraction is : "+ iresult);
		
		Loop lobj = new Loop();
		lobj.Display();
	}
}