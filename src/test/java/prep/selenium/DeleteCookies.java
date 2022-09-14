package prep.selenium;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.Cookie;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DeleteCookies {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.ebay.com/");
		Set<Cookie> cookies = driver.manage().getCookies();
		Iterator<Cookie> itr = cookies.iterator();
		System.out.println("Cookies before deleting eBay Cookie");
		while (itr.hasNext()) {
			Cookie cookie = itr.next();
			System.out.println(cookie.getName());
			if (cookie.getName().equals("ebay")) {
				driver.manage().deleteCookie(cookie);
			}
		}
		System.out.println("=======================================");
		System.out.println("Cookies after deleting eBay Cookie");
		Set<Cookie> remainingCookies = driver.manage().getCookies();
		Iterator<Cookie> itr2 = remainingCookies.iterator();
		while (itr2.hasNext()) {
			Cookie cookie = itr2.next();
			System.out.println(cookie.getName());
		}
		driver.close();
	}

}
