package Data_provider;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.testng.annotations.Test;

public class fetch_property 
{
	@Test
	public void getdata() throws IOException
	{
		FileInputStream fis = new FileInputStream("./property-files/data.properties");
		Properties p=new Properties();
		p.load(fis);
		String v = p.getProperty("un");
		System.out.println(v);
	}

}
