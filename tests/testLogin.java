package ibu.edu.selenium_project;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

class testLogin {
	
	private static WebDriver webDriver;
	private static String baseUrl;

	@BeforeAll
	static void setUpBeforeClass() throws Exception {
		System.setProperty("webdriver.chrome.driver" , "C:\\Amna\\Treća godina IT\\SVVT\\chromedriver.exe");
		webDriver = new ChromeDriver();
		baseUrl = "https://www.esky.ba/";
	}

	@AfterAll
	static void tearDownAfterClass() throws Exception {
		webDriver.quit();
	}

	@Test
	void test() throws InterruptedException {
		webDriver.get(baseUrl);
		webDriver.manage().window().maximize();
		Thread.sleep(2000);
		
		WebElement login = webDriver.findElement(By.xpath("/html/body/header/div/div[2]/div[1]/div/p/span/span"));
		login.click();
		Thread.sleep(2000);
		
//		WebElement google = webDriver.findElement(By.xpath("/html/body/div[25]/div[2]/div[2]/ul/li[1]/span"));
//		google.click();
//		Thread.sleep(2000);
//		for (String handle : webDriver.getWindowHandles()) {
//		    webDriver.switchTo().window(handle);
//		}
//		WebElement email = webDriver.findElement(By.id("identifierId"));
//		email.click();
//		email.sendKeys("janedoe.selenium@gmail.com");
//		Thread.sleep(2000);
//		WebElement naprijed = webDriver.findElement(By.xpath("/html/body/div[1]/div[1]/div[2]/div/div[2]/div/div/div[2]/div/div[2]/div/div[1]/div/div/button/span"));
//		naprijed.click();
//		Thread.sleep(4000);
//		webDriver.findElement(By.name("password"));
		
		WebElement tmail = webDriver.findElement(By.cssSelector(".user-zone-email > .menu-item-text"));
		tmail.click();
		Thread.sleep(5000);
		
		WebElement mail = webDriver.findElement(By.cssSelector("body > app-root > login-component > content-simple > div > login-box > div > esky-login-box > esky-form > form > esky-input-wrapper:nth-child(1) > div > div > div > esky-input-text > input"));
		mail.click();
		mail.sendKeys("janedoe.selenium@gmail.com");
		Thread.sleep(1000);
		
		WebElement password = webDriver.findElement(By.xpath("/html/body/app-root/login-component/content-simple/div/login-box/div/esky-login-box/esky-form/form/esky-input-wrapper[2]/div/div/div/esky-input-password/input"));
		password.click();
		password.sendKeys("janedoe");
		Thread.sleep(1000);
		
		WebElement prijavi = webDriver.findElement(By.xpath("/html/body/app-root/login-component/content-simple/div/login-box/div/esky-login-box/esky-form/form/div/esky-submit-button/button"));
		prijavi.click();
		Thread.sleep(5000);
		
		String account = webDriver.findElement(By.xpath("/html/body/header/div/div[2]/div[1]/div/p/span/span")).getText();
		assertEquals("janedoe.selenium", account);
		
	}


}
