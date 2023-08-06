package pratice;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


@SuppressWarnings("unused")
public class Test_1 {
	
	WebDriver driver;
	String baseUrl;

	@Before
	public void setUp() throws Exception {
		
		driver = new ChromeDriver();
		baseUrl = "https://www.amazon.in/";
		
		driver.manage().window().maximize();
	}

	

	@Test
	public void test() throws InterruptedException {
		driver.get(baseUrl);
		String title = driver.getTitle();
		System.out.println("Title of the page is= " + title);
		
		String currentUrl = driver.getCurrentUrl();
		System.out.println("Current URL is: " + currentUrl);
		Thread.sleep(2000);
		
		String urlToNavigate = "https://www.amazon.in/Bluetooth-UBON-Portable-Wireless-Technology/dp/B09TB2NY26/?_encoding=UTF8&pd_rd_w=vjHd8&content-id=amzn1.sym.0f264ee2-aac7-4fdc-9e2f-805839060ce8&pf_rd_p=0f264ee2-aac7-4fdc-9e2f-805839060ce8&pf_rd_r=FDMW39552D5KQRYBSWFW&pd_rd_wg=T2wuV&pd_rd_r=2d3c12ed-fed9-408b-b55d-c26e53e93de9&ref_=pd_gw_deals_4s_t1";
		driver.navigate().to(urlToNavigate);
		System.out.println("Navigating To Product");
		currentUrl = driver.getCurrentUrl();
		System.out.println("Current URL is: " + currentUrl);
		
		Thread.sleep(2000);
		
		driver.navigate().back();
		System.out.println("Navigate Back");
		currentUrl = driver.getCurrentUrl();
		System.out.println("Current URL is: " + currentUrl);
		
		Thread.sleep(2000);
		
		driver.navigate().forward();
		System.out.println("Navigate Forward");
		currentUrl = driver.getCurrentUrl();
		System.out.println("Current URL is: " + currentUrl);
		
		Thread.sleep(2000);
		
		driver.navigate().back();
		System.out.println("Navigate Back");
		currentUrl = driver.getCurrentUrl();
		System.out.println("Current URL is: " + currentUrl);
		
		Thread.sleep(2000);
		
		driver.navigate().refresh();
		System.out.println("Navigate Refresh");
		driver.get(currentUrl);
		System.out.println("Navigate Refresh");
		Thread.sleep(2000);
		
		String pageSource = driver.getPageSource();
		System.out.println(pageSource);
	}
	
	@After
	public void tearDown() throws Exception {
	}

}
