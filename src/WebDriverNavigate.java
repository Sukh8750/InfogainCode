

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class WebDriverNavigate{
public static void main(String... args) {
	String driverLocation="D:/seleniumLib/chromedriver_win32/chromedriver.exe";
	  // Optional, if not specified, WebDriver will search your path for chromedriver.
	  System.setProperty("webdriver.chrome.driver", driverLocation);

	  WebDriver driver = new ChromeDriver();

driver.navigate().to("http://www.google.com");
WebElement searchBox = driver.findElement(By.name("q"));
searchBox.sendKeys("Selenium WebDriver");
WebElement searchButton = driver.findElement(By.name("btnG"));
searchButton.click();
searchBox.clear();
searchBox.sendKeys("Infogain India");
searchButton.click();
driver.navigate().back();
driver.navigate().forward();
driver.navigate().refresh();
}
}