import java.io.*;

class WriteFile
{
	public static void main(String a[]) throws Exception
	{
		FileOutputStream fobj = new FileOutputStream("Kedar.text");
		
		String Data = "Marvellous info karad";
		
		byte bdata[] = Data.getBytes();
		
		fobj.write(bdata);
		fobj.close();
	}
	
}