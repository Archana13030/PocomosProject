import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Login {

public static void main(String[] args){
	
	WebDriverManager.chromedriver().setup();
	WebDriver driver = new ChromeDriver();
	driver.get("http://15.206.7.200/pocomos-admin/auth/login");
	WebElement textbox1 = driver.findElement(By.id("login-form_username"));
	textbox1.sendKeys("zignuts");
	
	WebElement textbox2 = driver.findElement(By.id("login-form_password"));
	textbox2.sendKeys("123456");
	
	driver.findElement(By.id("login-form_remember")).click();
	driver.findElement(By.xpath("//span[text()='Sign In']")).click();
	
	
	
}	
	
	
	}
	

