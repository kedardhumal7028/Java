import java.util.Scanner;

class Loops
{
	public static void main(String arg[])
	{
		
		int Arr[] = {10,20,30,40};
		int iCnt = 0;
		
		System.out.println("Traversal of array using for loop");
		for(iCnt = 0; iCnt < Arr.length; iCnt++)
		{
			System.out.println(Arr[iCnt]);
		}
		
		System.out.println("Traversal of array using While loop");
		iCnt = 0;
		while(iCnt < Arr.length)
		{
			System.out.println(Arr[iCnt]);
			iCnt++;
		}
		
		System.out.println("Traversal of array using do While loop");
		iCnt = 0;
		do
		{
			System.out.println(Arr[iCnt]);
			iCnt++;
		}while(iCnt < Arr.length);
		
		
		System.out.println("Traversal of array using for each loop");
		iCnt = 0;
		for(int iNo : Arr)
		{
			System.out.println(Arr[iCnt]);
			iCnt++;
		}
		
	}
}