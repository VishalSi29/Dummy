package pratice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Popup {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/facebook/");
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		
		driver.findElement(By.xpath("//span[contains(text(),'Create new account')]")).click();
		driver.findElement(By.name("firstname")).sendKeys("Shivendra Vikram");
		driver.findElement(By.name("lastname")).sendKeys("vikram");
		driver.findElement(By.name("reg_email__")).sendKeys("Shivendra@uncodemy.com");
		driver.findElement(By.name("reg_email_confirmation__")).sendKeys("Shivendra@uncodemy.com");
		driver.findElement(By.name("reg_passwd__")).sendKeys("Amazon@1234");
		
		WebElement dateElement = driver.findElement(By.id("day"));
		WebElement monthElement = driver.findElement(By.id("month"));
		WebElement yearElement = driver.findElement(By.id("year"));
		
		Select datedropdown = new Select(dateElement);
		Select monthdropdown = new Select(monthElement);
		Select yeardropdown = new Select(yearElement);
		
		datedropdown.selectByVisibleText("30");
		monthdropdown.selectByVisibleText("Aug");
		yeardropdown.selectByVisibleText("1993");
		
		driver.findElement(By.xpath("//input[@type= 'radio' and @value = '2']")).click();
		driver.findElement(By.name("websubmit")).click();

	}

}
