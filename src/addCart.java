import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class addCart {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "D:\\my_driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.saucedemo.com/");
		String user_name= "standard_user";
		String password="secret_sauce";
		driver.manage().window().maximize();
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//*[@id=\"user-name\"]")).sendKeys(user_name);
		Thread.sleep(1000);

		driver.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys(password);
		Thread.sleep(1000);

		driver.findElement(By.xpath("//*[@id=\"login-button\"]")).click();
		
		
     	int Expectedadd =6;
     List <WebElement> myButtin= driver.findElements(By.className("btn"));
     for(int i=0 ; i<myButtin.size();i++) 
     {myButtin.get(i).click();}
     String actualadd = driver.findElement(By.xpath("//*[@id=\"shopping_cart_container\"]/a/span")).getText();
     int numacctual= Integer.parseInt(actualadd);   
     Assert.assertEquals(numacctual, Expectedadd);
		
		
		
		
		
		
		
		
		
		
		
	}

}
