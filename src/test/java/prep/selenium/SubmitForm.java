package prep.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SubmitForm {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://tutorialsninja.com/demo/index.php?route=account/register");
		driver.findElement(By.id("input-firstname")).sendKeys("rachel");
		driver.findElement(By.id("input-lastname")).sendKeys("zane");
		driver.findElement(By.id("input-email")).sendKeys("rachelzane@gmail.com");
		driver.findElement(By.id("input-telephone")).sendKeys("1234566");
		driver.findElement(By.id("input-password")).sendKeys("rachel1");
		driver.findElement(By.id("input-confirm")).sendKeys("rachel1");
		driver.findElement(By.name("agree")).click();
		driver.findElement(By.xpath("//input[@value='Continue']")).submit();
		driver.close();
	}

}
