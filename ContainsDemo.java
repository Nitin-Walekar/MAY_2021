
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ContainsDemo {

 	public static void main(String[] args)  {
		System.setProperty( "webdriver.chrome.driver","D:\\SELENIUM\\CROMEdriver\\chromedriver.exe" );
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.facebook.com");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		
/*Contains() is a method used in XPath expression.
  It is used when the value of any attribute changes dynamically	
  The contain feature has an ability to find the element with partial text
  complete value of 'Type' is 'submit' but using only partial value 'sub'....Xpath=//*[contains(@type,'sub')]
           syntax=//*[contains(@attribute,'value')]
*/
		
//		WebElement username= driver.findElement(By.xpath("//input[contains(@data-testid,'royal')]"));
//		username.sendKeys("nitin.walekar52@gmail.com");
//		WebElement password=driver.findElement(By.xpath("//input[contains(@data-testid,'_pass')]"));
//		password.sendKeys("Golden@1990");
//		WebElement LoginBtn=driver.findElement(By.xpath("//button[contains(@id,'u_0_d')]"));
//		LoginBtn.click();
		//driver.close();
		
		
		WebElement username= driver.findElement(By.xpath("//input[contains(@data-testid,'royal') or @id='email' ]"));
		username.sendKeys("nitin.walekar52@gmail.com");
		WebElement password=driver.findElement(By.xpath("//input[contains(@data-testid,'pass') or @id='pass' ]"));
		password.sendKeys("Golden@1990");
		WebElement LoginBtn=driver.findElement(By.xpath("//button[contains(@id,'u_0_d')  or @type='dshjdj']"));     //1st true , 2nd false
		LoginBtn.click();
		//driver.close();
		
		
		
		
		
	}

}
