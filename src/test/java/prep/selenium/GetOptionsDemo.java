package prep.selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class GetOptionsDemo {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://www.omayo.blogspot.com/");
		WebElement dropdown = driver.findElement(By.id("drop1"));
		Select select = new Select(dropdown);
		List<WebElement> dropdownOptions = select.getOptions();
		for(WebElement ele : dropdownOptions) {
			System.out.println(ele.getText());
		}
		System.out.println("============================================================");
		WebElement multiselect = driver.findElement(By.id("multiselect1"));
		select = new Select(multiselect);
		List<WebElement> mutliSelectOptiond = select.getOptions();
		for(WebElement ele : mutliSelectOptiond) {
			System.out.println(ele.getText());
		}
		driver.close();

	}

}
