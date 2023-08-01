package genericPackage;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeMethod;

public class BaseTest implements IautoConstant {
	static WebDriver driver;
	
	
	@BeforeMethod
	public void setUp()
	{
		Flib flib = new Flib();
	}

}
