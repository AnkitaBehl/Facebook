package workspace;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class FacebookLogin extends WebDribverWait {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C://Users//hp//eclipse-workspace//workspace//src//Resources//chromedriver.exe");
		  // Instantiate a ChromeDriver class.       
		  WebDriver driver=new ChromeDriver();
		  driver.get("https://www.facebook.com/");
		  
		  WebDriverWait wait=new WebDriverWait(driver, 20);
		  driver.manage().window().maximize();
		  wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@name='email']")));
		  
		  
		  driver.findElement(By.xpath("//input[@name='email']")).sendKeys("Ankita Behl");
		  driver.findElement(By.cssSelector("input[type='password']")).sendKeys("job123");
		  //driver.findElement(By.name("login")).click();
		  driver.findElement(By.xpath("//a[@data-testid='open-registration-form-button']")).click();
		  driver.findElement(By.xpath("//input[@name='firstname']")).sendKeys("Anku");
		  driver.findElement(By.cssSelector("input[name='lastname']")).sendKeys("Anand");
		  driver.findElement(By.xpath("//input[@name='reg_email__']")).sendKeys("9876543210");
		  driver.findElement(By.name("reg_passwd__")).sendKeys("positive123");
		  Select dob=new Select(driver.findElement(By.name("birthday_day")));
		  dob.selectByVisibleText("1");	
		  Select dop=new Select(driver.findElement(By.name("birthday_month")));
		  dop.selectByVisibleText("Oct");
		  Select dop1=new Select(driver.findElement(By.name("birthday_year")));
		  dop1.selectByVisibleText("1994");
		//  Select gender=new Select(driver.findElement(By))
		  List<WebElement> ele= driver.findElements(By.xpath("//input[@type='radio']"));
		  ele.get(1).click(); 
		  driver.quit();
	}

}
