package InterviewPractice;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class PracticeFacebook {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriverManager.chromedriver().setup();

		  WebDriver driver=new ChromeDriver();
		  driver.get("https://www.facebook.com/");
		  WebDriverWait wait=new WebDriverWait(driver, 20);
		
	
		  driver.manage().window().maximize();
		
		  driver.findElement(By.id("email")).sendKeys("Hello123");
		  driver.findElement(By.cssSelector("input[type='password']")).sendKeys("Great@456");
		 // driver.findElement(By.xpath("//button[@name='login']")).click();
		  driver.findElement(By.cssSelector("a[data-testid='open-registration-form-button']")).click();
		  wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@name='firstname']")));
		  driver.findElement(By.xpath("//input[@name='firstname']")).sendKeys("Arushi");
		  driver.findElement(By.name("lastname")).sendKeys("Kapoor");
		  driver.findElement(By.xpath("//input[@name='reg_email__']")).sendKeys("9876543210");
		  driver.findElement(By.cssSelector("input[autocomplete ='new-password']")).sendKeys("After@123");
		  Select dob = new Select(driver.findElement(By.name("birthday_day")));
		  dob.selectByVisibleText("15");
		  Select dom = new Select(driver.findElement(By.name("birthday_month")));
		  dom.selectByVisibleText("Aug");
		  Select doy = new Select(driver.findElement(By.name("birthday_year")));
		  doy.selectByVisibleText("2017");
		  List<WebElement> ele = driver.findElements(By.xpath("//span[@data-type='radio']/span"));
		  ele.get(1).click();
		  driver.quit();

		  
		  
		  
		  
	}

}
