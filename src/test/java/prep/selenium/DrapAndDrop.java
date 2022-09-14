package prep.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DrapAndDrop {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://omayo.blogspot.com/p/page3.html");
		Actions action = new Actions(driver);
		WebElement startSlider = driver.findElement(By.cssSelector("a[class^='ui-slider-handle']"));
		action.dragAndDropBy(startSlider, 200, 0).perform();
		action.dragAndDropBy(startSlider, -100,0).perform();
		driver.close();

	}

}
