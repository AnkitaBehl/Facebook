package InterviewPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Facebook {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		//System.setProperty("webdriver.chrome.driver", "C://Users//hp//eclipse-workspace//workspace//src//Resources//chromedriver.exe");
		  // Instantiate a ChromeDriver class.       
		  WebDriver driver=new ChromeDriver();
		  driver.get("https://www.facebook.com/");
		  
		 driver.manage().window().maximize();
		 driver.findElement(By.xpath("//input[@id='email']")).sendKeys("helloankita");
		 driver.findElement(By.xpath("//input[@type='password']")).sendKeys("goodbye");
		 driver.findElement(By.xpath("//input[@name='login']")).click();
	}

}
