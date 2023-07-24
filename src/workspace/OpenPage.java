package workspace;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class OpenPage {

	public static void main(Virat[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\hp\\eclipse-workspace\\workspace\\src\\Resources\\chromdriver.exe");
		  // Instantiate a ChromeDriver class.       
		  WebDriver driver=new ChromeDriver(); 
       driver.get("https://rahulshettyacademy.com/#/index");
    System.out.println(driver.getTitle());
  System.out.println(driver.getCurrentUrl());
	}

}
