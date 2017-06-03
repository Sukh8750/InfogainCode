import java.io.File;
import java.io.IOException;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class TakesScreenShotExample{
public static void main(String... args) {
	String driverLocation="D:/seleniumLib/chromedriver_win32/chromedriver.exe";
	  // Optional, if not specified, WebDriver will search your path for chromedriver.
	  System.setProperty("webdriver.chrome.driver", driverLocation);
	  WebDriver driver = new ChromeDriver();
	  driver.get("http://www.infogain.com");
	  
	  
File scrFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
System.out.println(scrFile.getAbsolutePath());
try {
	FileUtils.copyFile(scrFile, new File("c:/temp/test.png"));
} catch (IOException e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
}

driver.quit();
}
}