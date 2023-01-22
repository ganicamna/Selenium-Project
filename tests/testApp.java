package ibu.edu.selenium_project;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

class testApp {

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
		
		WebElement više = webDriver.findElement(By.xpath("/html/body/header/div/nav/ul/li[20]/a"));
		više.click();
		Thread.sleep(1000);
		
		WebElement mobilna  = webDriver.findElement(By.cssSelector("#main-menu-more-box > li:nth-child(2) > a"));
		mobilna.click();
		Thread.sleep(10000);
		
		for (String handle : webDriver.getWindowHandles()) {
		    webDriver.switchTo().window(handle);
		}
		
		WebElement googleplay  = webDriver.findElement(By.xpath("/html/body/div[4]/div/div[2]/div/div/div/div/div/div/div[2]/div/div[1]/div/div/div/div/div[4]/div/a[2]/img"));
		googleplay.click();
		Thread.sleep(5000);
		
		for (String handle1 : webDriver.getWindowHandles()) {
		    webDriver.switchTo().window(handle1);
		}
		
		String naslov = webDriver.findElement(By.cssSelector("#yDmH0d > c-wiz.SSPGKf.Czez9d > div > div > div.tU8Y5c > div.P9KVBf > div > div > c-wiz > div.hnnXjf.XcNflb.J1Igtd > div.qxNhq > div > h1 > span")).getText();
		assertTrue(naslov.contains("eSky"));		
		
		
	}

}
