package jdbc_connect;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import org.testng.annotations.Test;

public class fetchdataFrom_Db 
{
@Test
public void runner() throws SQLException
{
	String url="jdbc:mysql://localhost:3306/test";
	String un="root";
	String pwd="root";
	Connection con = DriverManager.getConnection(url, un , pwd);
	Statement stat = con.createStatement();
	ResultSet result = stat.executeQuery("select* from testdata");
	while(result.next())
	{
		String user=result.getString(1);
		String pass=result.getString(2);
		System.out.println(user+"   "+pass);
	}
}
}
