package ibu.edu.selenium_project;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

class testRecenzije {
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

		webDriver.findElement(By.linkText("Više")).click();
	    webDriver.findElement(By.linkText("Recenzije")).click();
	    
	    for (String handle1 : webDriver.getWindowHandles()) {
		    webDriver.switchTo().window(handle1);
		}
	    Thread.sleep(5000);
	    
//	    JavascriptExecutor js = (JavascriptExecutor) webDriver;
//	    js.executeScript("window.scrollBy(0,400)", "");
	    Thread.sleep(2000);
	    webDriver.findElement(By.linkText("LOT")).click();
	    Thread.sleep(2000);
	    
//	    js.executeScript("window.scrollBy(0,400)", "");
	    webDriver.findElement(By.linkText("Ocjena")).click();
	    webDriver.findElement(By.id("ReviewsRating_opt_excellent")).click();
	    Thread.sleep(2000);
	    
	    webDriver.findElement(By.linkText("Sortirajte od")).click();
	    webDriver.findElement(By.id("ReviewsSort_opt_mostHelpful")).click();
	    Thread.sleep(2000);
	    
	    webDriver.findElement(By.cssSelector("body > div.site-content.container > div.reviews-container > ul > li:nth-child(1) > div.info-review > div.review-head > p > span")).click();
	    Thread.sleep(2000);
	    
	    webDriver.findElement(By.cssSelector("body > div.site-content.container > div.reviews-container > ul > li:nth-child(1) > div.info-review > div.review-footer > div.helpful-counter.has-votes > button")).click();
	    Thread.sleep(2000);
	}

}
