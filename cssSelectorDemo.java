
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class cssSelectorDemo {

 	public static void main(String[] args) {
		System.setProperty( "webdriver.chrome.driver","D:\\SELENIUM\\CROMEdriver\\chromedriver.exe" );
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.facebook.com");
		//driver.get("https://cims.mastersofterp.in/");
		driver.manage().window().maximize();
		//driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
      
		// css selector locator Using id
		//tagname#value of id ...as syntax like (input is tagname # is use for id and value of id)
//		
//		driver.findElement(By.cssSelector("input#email")).sendKeys("nitin.walekar52@gmail.com");
//		driver.findElement(By.cssSelector("input#pass")).sendKeys("Nitin@1990");
//		                   driver.findElement(By.cssSelector("input#u_0_d_IC")).click();      //dynamic value(we can not write like this)
		
//		driver.findElement(By.cssSelector("input#txtuserid")).sendKeys("ADMINENGG@ABUS.COM");
//		driver.findElement(By.cssSelector("input#txtpassword")).sendKeys("PRINCIPAL");
//		driver.findElement(By.cssSelector("input#btnlogin")).click();
	
		// css selector locator Using class name using dot (.) oprator	
		
//        driver.findElement(By.cssSelector("input.inputtext._55r1._6luy")).sendKeys("nitin.walekar52@gmail.com");
//    	driver.findElement(By.cssSelector("input.inputtext._55r1._6luy._9npi")).sendKeys("Nitin@1990");
//		driver.findElement(By.cssSelector("button._42ft")).click();
		
		
//		driver.findElement(By.cssSelector("input.text")).sendKeys("ADMINENGG@ABUS.COM");
//		driver.findElement(By.cssSelector("input.password")).sendKeys("PRINCIPAL");
//		driver.findElement(By.cssSelector("input[name='btnlogin']")).click();
 
		
	// css selector with other tag attribute	
//		driver.findElement(By.cssSelector("input[data-testid='royal_email']")).sendKeys("nitin.walekar52@gmail.com");
//		driver.findElement(By.cssSelector("input[data-testid='royal_pass']")).sendKeys("Nitin@1990");	
//		driver.findElement(By.cssSelector("button[data-testid='royal_login_button']")).click();
		
 //css selector with tagname,class name attribute
		
		driver.findElement(By.cssSelector("input.inputtext._55r1._6luy[name='email']")).sendKeys("nitin.walekar52@gmail.com");
		driver.findElement(By.cssSelector("input.inputtext[name='pass']")).sendKeys("Nitin@1990");
		//driver.findElement(By.cssSelector("button._42ft[name='login'])").click();
		
// css selector supports traverse from PARENT tag to CHILD tag using > symbol		
		//driver.findElement(By.cssSelector("div>input[type='text']")).sendKeys("nitin.walekar52@gmail.com");
	    //driver.findElement(By.cssSelector("div>input[type='password']")).sendKeys("Nitin@1990");
	    //driver.findElement(By.cssSelector("div>button")).click();
	    
		
 	}
}