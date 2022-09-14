package prep.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TypeATextInANewLine {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://www.omayo.blogspot.com/");
		driver.findElement(By.id("ta1")).sendKeys("Hello World \nHello World!\nHello World!!\nHello World!!!!");
		Thread.sleep(5000);
		driver.close();

	}

}
