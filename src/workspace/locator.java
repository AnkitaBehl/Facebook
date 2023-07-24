package workspace;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class locator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C://Users//hp//eclipse-workspace//workspace//src//Resources//chromedriver.exe");
		  // Instantiate a ChromeDriver class.       
		  WebDriver driver=new ChromeDriver(); 
		  driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS );
		  driver.get("https://rahulshettyacademy.com/locatorspractice/");
		  driver.findElement(By.id("inputUsername")).sendKeys("Ankita");
		  driver.findElement(By.name("inputPassword")).sendKeys("love143");
		  driver.findElement(By.className("signInBtn")).click();
		System.out.println(driver.findElement(By.cssSelector("p.error")).getText());  //output is= incorrect username or password(used for)
		driver.findElement(By.linkText("Forgot your password?")).click();
		 driver.findElement(By.xpath("//input[@placeholder='Name']")).sendKeys("nitin");
		 
	}

}
