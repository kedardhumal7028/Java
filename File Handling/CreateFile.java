import java.io.*;

class CreateFile
{
	public static void main(String a[]) throws Exception
	{
		File fobj = new File("Kedar.txt");
		
		if(fobj.createNewFile())
		{
			System.out.println("File created succesfully");
		}
		else
		{
			System.out.println("Unable to create the file");
		}
	}
	
}