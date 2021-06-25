import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;


public class FacebookLogin {
	
	@Test
	public void fblogin() throws InterruptedException{
		 System.setProperty("webdriver.gecko.driver","C:\\.....\\\geckodriver.exe" ); //replace this location with your geckodriver location in your system
		
		 FirefoxDriver driver= new FirefoxDriver();
		 
			//To maximize the Browser
			driver.manage().window().maximize();
			
			String URL="https://en-gb.facebook.com/";
			Thread.sleep(3000);
			//open the redif.com
			driver.get(URL);
			//verify Page Title
			String pageTitle = driver.getTitle();
			System.out.println("We get the Title Like :" +pageTitle);
			
			//insert username & password
			WebElement mail=driver.findElement(By.id("email"));
			WebElement pssd=driver.findElement(By.id("pass"));
			
			mail.sendKeys("fake@gmail.com");
			pssd.sendKeys("yourpassword@123");
			WebElement Login = driver.findElement(By.name("login"));
		    Login.click();
            Thread.sleep(3000);
        	System.out.println("We get the 2nd Title Like :" +pageTitle);
        	Thread.sleep(3000);
        	driver.close();
			
			
			
			
			
	}
	
	
}
