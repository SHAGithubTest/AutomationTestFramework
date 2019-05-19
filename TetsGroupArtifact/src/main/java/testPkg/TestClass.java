package testPkg;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class TestClass {

	
	@org.testng.annotations.Test
	public void launchChrome()
	{
		System.setProperty("webdriver.chrome.driver", "E:\\W1\\TetsGroupArtifact\\src\\main\\resources\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://google.com");
		System.out.println("Ttile :: "+driver.getTitle());
		driver.quit();
		
	}
}
