
import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;


public class DragandDrop {


	public static void main(String[] args) throws InterruptedException {
		System.setProperty( "webdriver.chrome.driver","D:\\SELENIUM\\CROMEdriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://demo.guru99.com/test/drag_drop.html");
		driver.manage().window().maximize();
		
		
		
		Actions actions= new Actions(driver);
		
		//http://demo.guru99.com/test/drag_drop.html
		WebElement source= driver.findElement(By.xpath("//a[@class='button button-orange' and text()=' 5000 ' ]"));
		WebElement destination= driver.findElement(By.xpath("//ol[@id='amt7']//li[@class='placeholder']"));
		
		actions.dragAndDrop(source, destination).perform();
		
		actions.moveToElement(source).perform();
		Thread.sleep(5000);
		
		//demoqa.com/droppable
		driver.navigate().to("https://demoqa.com/droppable"); 
		
		WebElement Dragme=driver.findElement(By.xpath("//div[@id='draggable']"));
		WebElement Drophere=driver.findElement(By.xpath("//div[@id='draggable']//following-sibling::div"));
		
		actions.dragAndDrop(Dragme, Drophere).perform();
	}
	

}
