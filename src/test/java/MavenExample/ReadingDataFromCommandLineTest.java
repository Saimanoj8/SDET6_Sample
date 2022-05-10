package MavenExample;

import org.testng.annotations.Test;

public class ReadingDataFromCommandLineTest {

	@Test(groups="smoke")
	public void readingdatafromcommandlineTest()
	{
	
		String URL = System.getProperty("url");
		String UN = System.getProperty("username");
		String PW = System.getProperty("password");
		System.out.println(URL);
		System.out.println(UN);
		System.out.println(PW);
	}
	
	@Test(groups="regression")
	public void regressionTest()
	{
		System.out.println("it is regression test");
	}
}
