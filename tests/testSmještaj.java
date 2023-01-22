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

class testSmještaj {
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
		Thread.sleep(5000);
//		JavascriptExecutor js = (JavascriptExecutor) webDriver;

		webDriver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div[1]/div[3]/div/div[4]/a/span")).click();
		
		 for (String handle1 : webDriver.getWindowHandles()) {
			    webDriver.switchTo().window(handle1);
			}
		Thread.sleep(5000);
		
		webDriver.findElement(By.cssSelector(".scrollable-container > .ng-untouched")).click();
		Thread.sleep(1000);
		
		WebElement dest = webDriver.findElement(By.xpath("/html/body/hot-app/hot-main-page/hot-header/esky-hero/esky-search-form/esky-oneway-roundtrip-form/form/section/fieldset[1]/div/esky-popular-places/span/esky-new-autocomplete-picker/div[2]/esky-new-autocomplete-topbar/div/esky-new-autocomplete-input/div/div/input"));
		dest.sendKeys("Mallorca, Španija");
		
		 webDriver.findElement(By.cssSelector(".overlay:nth-child(1)")).click();
		    Thread.sleep(1000);
		
		webDriver.findElement(By.xpath("/html/body/hot-app/hot-main-page/hot-header/esky-hero/esky-search-form/esky-oneway-roundtrip-form/form/section/fieldset[1]/div/esky-popular-places/span/esky-new-autocomplete-input/div")).click();
		
		webDriver.findElement(By.xpath("/html/body/hot-app/hot-main-page/hot-header/esky-hero/esky-search-form/esky-oneway-roundtrip-form/form/section/fieldset[1]/div/esky-popular-places/span/esky-new-autocomplete-picker/div[2]/div/esky-new-autocomplete-section/esky-new-autocomplete-hints-list/esky-new-autocomplete-hint/div/span")).click();
		Thread.sleep(1000);
		
	    
	    webDriver.findElement(By.xpath("/html/body/hot-app/hot-main-page/hot-header/esky-hero/esky-search-form/esky-oneway-roundtrip-form/form/section/fieldset[2]/div/div[1]/div/input")).click();
	    Thread.sleep(1000);
	    
	    webDriver.findElement(By.xpath("/html/body/hot-app/hot-main-page/hot-header/esky-hero/esky-search-form/esky-oneway-roundtrip-form/form/section/fieldset[2]/div/esky-multi-datepicker-combined-view/esky-multi-datepicker/div[1]/div[2]/esky-calendar/esky-calendar-month[2]/esky-calendar-week[2]/esky-calendar-day[5]/div/span/span")).click();
	    Thread.sleep(1000);
	    
	    webDriver.findElement(By.xpath("/html/body/hot-app/hot-main-page/hot-header/esky-hero/esky-search-form/esky-oneway-roundtrip-form/form/section/fieldset[2]/div/esky-multi-datepicker-combined-view/esky-multi-datepicker/div[1]/div[2]/esky-calendar/esky-calendar-month[2]/esky-calendar-week[2]/esky-calendar-day[7]/div/span/span")).click();
	    Thread.sleep(1000);
	    
//	    js.executeScript("window.scrollTo(0,90)");
	    
	    WebElement button = webDriver.findElement(By.tagName("button"));
	    Actions action = new Actions(webDriver);
	    action.moveToElement(button).click().perform();
	    Thread.sleep(1000);
	    
	    webDriver.findElement(By.xpath("/html/body/hot-app/hot-main-page/hot-header/esky-hero/esky-search-form/esky-oneway-roundtrip-form/form/section/div/button")).click();
	    Thread.sleep(8000);
	    
		for (String handle1 : webDriver.getWindowHandles()) {
		    webDriver.switchTo().window(handle1);
		}
		
		webDriver.findElement(By.xpath("/html/body/hot-app/ng-component/div/esky-search-results-layout/div/div[3]/esky-search-results-layout-results/hot-hotel-results/div[2]/ul/li[1]/esky-hotel-tile/esky-offer-block/div/div[1]/div/esky-hotel-gallery/div/div[3]")).click();
		 for (String handle1 : webDriver.getWindowHandles()) {
	    webDriver.switchTo().window(handle1);
	}
		 Thread.sleep(4000);
		 
		 webDriver.findElement(By.xpath("/html/body/hot-app/hot-hotel-variants/div/div[1]/div/div/ul/li[2]")).click();
		 Thread.sleep(2000);
		 
		 webDriver.findElement(By.xpath("/html/body/hot-app/hot-hotel-variants/div/div[3]/div/esky-hotel-variant-list/esky-hotel-variant[1]/esky-card/esky-hotel-room-options/div[1]/div[1]/div[2]/div/button/span/span[1]")).click();
	     Thread.sleep(3000);
	     
	     String totalPrice = webDriver.findElement(By.id("total-price amount")).getText();
	     assertEquals("101,12",totalPrice);
	}

}
