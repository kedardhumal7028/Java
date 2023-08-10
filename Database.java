import java.sql.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;


class Database
{
	public static void main(String a[]) throws Exception
	{
		String URL = "jdbc:mysql://localhost:3306/ppa41";;
		String Username = "root";
		String Password = "";
		String Query = "select * from student";
		
		Connection cobj = DriverManager.getConnection(URL,Username,Password);
		
		Statement sobj = cobj.createStatement();
		
		ResultSet robj = sobj.executeQuery(Query);
		
		while(robj.next())
		{
			System.out.println("RID : "+robj.getInt("RID"));
			System.out.println("Name : "+robj.getInt("Name"));
			System.out.println("City : "+robj.getInt("City"));
			System.out.println("Marks : "+robj.getInt("Marks"));
		}
	}
	
}