package prep.selenium;

import java.awt.AWTException;
import java.awt.Rectangle;
import java.awt.Robot;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TakingScreenshotUsingRobotClass {

	public static void main(String[] args) throws AWTException, InterruptedException, IOException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://www.omayo.blogspot.com/");
		
		Robot robot = new Robot();
		Rectangle rect = new Rectangle(10,10,1000,800);
		BufferedImage img = robot.createScreenCapture(rect);
		File file = new File(System.getProperty("user.dir")+"/screenshots/image.png");
		Thread.sleep(5000);
		ImageIO.write(img, "png", file);
		driver.close();
	}

}
