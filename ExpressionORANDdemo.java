
import java.awt.event.ActionEvent;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ExpressionORANDdemo {

 	public static void main(String[] args)  {
		System.setProperty( "webdriver.chrome.driver","D:\\SELENIUM\\CROMEdriver\\chromedriver.exe" );
		WebDriver driver= new ChromeDriver();
	//	driver.get("https://www.facebook.com");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		  /*
            OR expression:- there are two conditions,either 1st or 2nd condition is true(any one conditions should be true to find element) or 
            both conditions may be true	 
		 */
		
//		WebElement username= driver.findElement(By.xpath("//input[contains(@data-testid,'royal') or @id='email' ]"));
//		username.sendKeys("nitin.walekar52@gmail.com");
//		WebElement password=driver.findElement(By.xpath("//input[contains(@data-testid,'pass') or @id='pass' ]"));
//		password.sendKeys("Golden@1990");
//		WebElement LoginBtn=driver.findElement(By.xpath("//button[contains(@id,'u_0_d')  or @type='asdhsdh']"));   
//		LoginBtn.click();
		//driver.close();
		
	
//		WebElement username= driver.findElement(By.xpath("//input[@data-testid='royal' or @id='email' ]"));
//		username.sendKeys("nitin.walekar52@gmail.com");
//		WebElement password=driver.findElement(By.xpath("//input[contains(@data-testid,'pass') or @id='pass' ]"));
//		password.sendKeys("Golden@1990");
//		WebElement LoginBtn=driver.findElement(By.xpath("//button[@id='u_0_d_C9'  or @type='submit']"));   
//		LoginBtn.click();
		//driver.close();

		
		
         /*
           AND expression :-both conditions should be true to find the element
                    It fails to find element if any one condition is false 		
         */
//		
//		WebElement username= driver.findElement(By.xpath("//input[@type='text' and @id='email']"));
//		username.sendKeys("nitin.walekar52@gmail.com");
//		WebElement password=driver.findElement(By.xpath("//input[@name='pass' and @id='pass']"));
//		password.sendKeys("Golden@1990");
//		WebElement LoginBtn=driver.findElement(By.xpath("//button[@name='login' and @type='submit']"));   
//		LoginBtn.click();
		//driver.close();

		/*
		     XPath starts-with() :- is a function used for finding the web element whose attribute 
		      value gets changed on refresh or by other dynamic operations on the webpage
        */
		
		
//		WebElement english= driver.findElement(By.xpath("//a[text()='English (UK)']"));
//		english.click();
//		WebElement username= driver.findElement(By.xpath("//input[starts-with(@id,'em')]"));
//		username.sendKeys("nitin.walekar52@gmail.com");
//		WebElement password=driver.findElement(By.xpath("//input[starts-with(@name,'pass')]"));
//		password.sendKeys("Golden@1990");
//		//WebElement LoginBtn=driver.findElement(By.xpath("//button[starts-with(@id,'u_0_d')]")); 
//		WebElement LoginBtn=driver.findElement(By.xpath("//button[(text()='Log In')]"));          //  //*[contains(text(),"")] to find any text element
//		
//		LoginBtn.click();
	
		
	/*	
		 XPath Text() Function:-it is a built-in function of selenium webdriver which is used to locate elements based on text of a web element
		It helps to find the exact text elements and it locates the elements within the set of text nodes
		The elements to be located should be in string form.
		example-Xpath=//node[attribute()='value']
		
	*/	
		
		
		
		
		//driver.close();
		
		
//		WebElement username= driver.findElement(By.xpath("//form[@class='_9vtf']//following::input[2]"));
//		username.sendKeys("nitin.walekar52@gmail.com");
//		WebElement password=driver.findElement(By.xpath("//form[@class='_9vtf']//following::input[3]"));
//		password.sendKeys("Golden@1990");
//		//WebElement LoginBtn=driver.findElement(By.xpath("//button[starts-with(@id,'u_0_d')]")); 
//		WebElement LoginBtn=driver.findElement(By.xpath("//form[@class='_9vtf']//following::button"));
//		LoginBtn.click();
		//driver.close();

		
		
//		driver.get("https://kite.zerodha.com/");
//		WebElement username= driver.findElement(By.xpath("//div[@id='container']//following::input[@id='userid']"));
//		username.sendKeys("hd4382");
//		WebElement password=driver.findElement(By.xpath("//div[@id='container']//following::input[@type='password']"));
//		password.sendKeys("Golden@1990");
//		WebElement LoginBtn=driver.findElement(By.xpath("//div[@id='container']//following::button"));
//		LoginBtn.click();
		//driver.close();
		
		
		
		
		
		
		driver.get("https://www.demoqa.com/text-box");
		WebElement username= driver.findElement(By.xpath("//form[@id='userForm']//child::div[1]//input"));
		username.sendKeys("Nitin Walekar");
		WebElement password=driver.findElement(By.xpath("//div[@id='userEmail-wrapper']//child::input"));
		password.sendKeys("nitin.walekar52@gmail.com");
		
		WebElement caddress=driver.findElement(By.xpath("//div[@id='currentAddress-wrapper']//child::div[2]//child::textarea"));
		caddress.sendKeys("beed");
		
		WebElement pcaddress=driver.findElement(By.xpath("//div[@id='permanentAddress-wrapper']//child::div[2]//child::textarea"));
		pcaddress.sendKeys("At.post.khadki ghat");
		
		
		
//		WebElement paddress=driver.findElement(By.xpath("//div[@id='currentAddress-wrapper']//descendant::textarea"));
//		paddress.sendKeys("At.post.khadki ghat");
		
//		
//		WebElement Links=driver.findElement(By.xpath("By.xpath("//span[@text='Dnyamic Properties']"));
//		Actions.action= new Action(driver);
//		action.moveToElement(Links).build().perform();
		
		////textarea[@id='currentAddress']//parent::div
		
		//driver.close();
		
		
		
		
		
		
	}

}
