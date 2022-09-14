package prep.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DoubleClick {

	public static void main(String[] args) throws InterruptedException {
		// testdoubleclick
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://www.omayo.blogspot.com/");
		WebElement seleniumLink = driver.findElement(By.id("testdoubleclick"));
		JavascriptExecutor jse = (JavascriptExecutor) driver;
	//	jse.executeScript("window.scrollTo(0,document.body.scrollHeight);");
		jse.executeScript("arguments[0].scrollIntoView(true)", seleniumLink);
		Thread.sleep(4000);
		Actions actions = new Actions(driver);
		actions.doubleClick(seleniumLink).perform();
		Thread.sleep(4000);
		driver.close();

	}

}
