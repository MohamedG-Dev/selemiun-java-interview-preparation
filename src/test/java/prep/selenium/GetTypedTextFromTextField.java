package prep.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class GetTypedTextFromTextField {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://www.omayo.blogspot.com/");
		driver.findElement(By.name("q")).sendKeys("Google.com");
		String value = driver.findElement(By.name("q")).getAttribute("value");
		System.out.println(value);
		driver.close();

	}

}
