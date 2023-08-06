package pratice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class Tutorial {
	

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
// check box
		//driver.get("https://www.flipkart.com/clothing-and-accessories/topwear/tshirt/men-tshirt/pr?sid=clo%2Cash%2Cank%2Cedy&otracker=categorytree&otracker=nmenu_sub_Men_0_T-Shirts&otracker=nmenu_sub_Men_0_T-Shirts&p%5B%5D=facets.size%255B%255D%3D2XS");
// radio button
		
		driver.get("https://www.nobroker.in/?utm_source=redirects&utm_medium=nobroker.com&utm_campaign=com_redirect");
		driver.manage().window().maximize();
		
		// User name
	// radio button
		driver.findElement(By.xpath("//input[@id=\"PG\"]")).click();
		
		
// check box		
		//driver.findElement(By.xpath("//div[@id=\"container\"]/div/div[3]/div/div[1]/div/div/div/section[3]/label/div[1]")).click();
	/*	driver.findElement(By.id("email")).sendKeys("vishalsingh7074@gmail.com");
		// Password
		driver.findElement(By.xpath("//input[@id=\"pass\"]")).click();
		driver.findElement(By.id("pass")).sendKeys("@pushpa.900");
		//login button
		driver.findElement(By.xpath("//button[@data-testid=\"royal_login_button\"]")).click();
*/		
		Thread.sleep(5000);
		
     	driver.quit();

	}

}
