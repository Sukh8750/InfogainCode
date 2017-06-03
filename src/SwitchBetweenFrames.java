

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class SwitchBetweenFrames {
	public static void main(String... args) {
		String driverLocation="D:/seleniumLib/chromedriver_win32/chromedriver.exe";
		  // Optional, if not specified, WebDriver will search your path for chromedriver.
		  System.setProperty("webdriver.chrome.driver", driverLocation);

		  WebDriver driver = new ChromeDriver();
		  
		//driver.get("http://127.0.0.1:8282/selenium/three/Window.html");
		  driver.get("file:///D:/seleniumLib/three/Frames.html");

		Actions action = new Actions(driver);

		driver.switchTo().frame(0);
		WebElement txt = driver.findElement(By.name("1"));
		txt.sendKeys("I'm Frame One");

		driver.switchTo().defaultContent();

		driver.switchTo().frame(1);
		txt = driver.findElement(By.name("2"));
		txt.sendKeys("I'm Frame Two");
		//driver.quit();
	}
}
