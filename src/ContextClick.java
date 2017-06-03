

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class ContextClick {
	public static void main(String... args) {
		WebDriver driver = new FirefoxDriver();
		driver.get("file:///D:/seleniumLib/html/ContextClick.html");
		WebElement contextMenu = driver.findElement(By.id("div-context"));

		Actions builder = new Actions(driver);
		builder.contextClick(contextMenu)
				.click(driver.findElement(By.name("Item 6"))).perform();
	}
}
