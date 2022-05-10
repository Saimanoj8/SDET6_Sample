package MavenExample;

import org.testng.annotations.Test;

public class ReadingDataFromCommandLineTest {

	@Test(groups="smoke")
	public void readingdatafromcommandlineTest()
	{
	        System.out.println("Execute poll SCM in jenkins");
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
		  System.out.println("Execute poll SCM in jenkins");
		System.out.println("it is regression test");
	}
}
