package workspace;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Swiggyinspect {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		System.setProperty("webdriver.chrome.driver", "C://Users//hp//eclipse-workspace//workspace//src//Resources//chromedriver.exe");
		  // Instantiate a ChromeDriver class.       
		  WebDriver driver=new ChromeDriver();
		  driver.get("https://www.swiggy.com/");
		  driver.manage().window().maximize();
		  Thread.sleep(1000);
		  driver.findElement(By.xpath("//input[@id='location']")).sendKeys("chandigarh");
		  List<WebElement> ele=driver.findElements(By.xpath(".//*[@class='_3lmRa']"));
		  ele.get(0).click();
	}

}
