package InterviewPractice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Practice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		//System.setProperty("webdriver.chrome.driver", "C://Users//hp//eclipse-workspace//workspace//src//Resources//chromedriver.exe");
		  // Instantiate a ChromeDriver class.       
		  WebDriver driver=new ChromeDriver();
		  driver.manage().window().maximize();
		  driver.get("");
		  
	}

}
