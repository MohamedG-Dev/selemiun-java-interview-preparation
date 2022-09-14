package prep.selenium;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ClickOnDropDownMenu {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://tutorialsninja.com/demo/index.php?route=account/register");
		Thread.sleep(4000);
		driver.findElement(By.xpath("//span[text()='My Account']")).click();
		// WebElement loginLink = driver.findElement(By.linkText("Login"));
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
		WebElement loginLink = wait.until(ExpectedConditions.visibilityOfElementLocated(By.linkText("Login")));
		loginLink.click();
		driver.close();
	}

}
