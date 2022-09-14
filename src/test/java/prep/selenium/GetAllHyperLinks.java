package prep.selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class GetAllHyperLinks {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://www.omayo.blogspot.com/");
		List<WebElement> hyperlinks = driver.findElements(By.xpath("//a"));
		for (WebElement hyperLink : hyperlinks) {
			System.out.println(hyperLink.getText());
		}
		driver.close();
	}

}
