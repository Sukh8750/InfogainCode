import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.Keys;


public class SeleniumDemo1 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String driverLocation="D:/seleniumLib/chromedriver_win32/chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", driverLocation);
		
		//WebDriver driver=new FirefoxDriver();
		WebDriver driver=new ChromeDriver();
		  
		driver.get("http://www.google.com");
		
		WebElement textBox=driver.findElement(By.className("gsfi"));
		//textBox.sendKeys("Infogain India");
		textBox.sendKeys(Keys.chord(Keys.SHIFT,"Selenium"));
		

	}

}
