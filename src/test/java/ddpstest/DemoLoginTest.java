package ddpstest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;


public class DemoLoginTest {
	
	@Test
	public void demoLogin() throws Exception {
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.stealmylogin.com/demo.html");
		driver.manage().window().maximize();
		
		driver.findElement(By.cssSelector("input[name='username']")).sendKeys("test");
		driver.findElement(By.name("password")).sendKeys("test");
		driver.findElement(By.cssSelector("input[value='login']")).click();
		Assert.assertEquals(driver.getCurrentUrl(), "https://example.com/");
		driver.quit();
	}

}
