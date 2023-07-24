package workspace;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.apache.logging.log4j.core.util.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class xyz {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C://Users//hp//eclipse-workspace//workspace//src//Resources//chromedriver.exe");
		  // Instantiate a ChromeDriver class.       
		  WebDriver driver=new ChromeDriver(); 
		  driver.get("https://www.amazon.in/");
		  driver.manage().window().maximize();
		// TODO Auto-generated method stub
ArrayList<String> obtainedList = new ArrayList<>();
List<WebElement> elementList=driver.findElements(By.xpath("//div[@id='nav-xshop-container']"));
for(WebElement we:elementList) {
	obtainedList.add(we.getText());
}
ArrayList<String> sortedList = new ArrayList<>();
for(String s:obtainedList) {
	sortedList.add(s);
}
Collections.sort(sortedList);
//.(sortedList.equals(obtainedList));
	
	
}

	}


