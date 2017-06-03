
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class ClickAndHoldAndReleaseOnWebElement {
	public static void main(String... args) {
		WebDriver driver = new FirefoxDriver();
		driver.get("file:///D:/seleniumLib/html/Selectable.html");
		
		WebElement three = driver.findElement(By.name("three"));
		WebElement two = driver.findElement(By.name("two"));

		WebElement one=driver.findElement(By.name("one"));
		WebElement four=driver.findElement(By.name("four"));
		
		Actions builder = new Actions(driver); 
		builder.keyDown(Keys.CONTROL) 
		.click(four)
				.click(three) 
		.click(two) 
		.click(one)
		.keyUp(Keys.CONTROL); 
		// Generate the composite action. 
		Action compositeAction = builder.build(); 
		// Perform the composite action. 
		compositeAction.perform();
	}} 

	
