package ibu.edu.selenium_project;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

class testLetPlusHotel {
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
		Thread.sleep(3000);
		
		webDriver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div[1]/div[3]/div/div[5]")).click();
		
		for (String handle : webDriver.getWindowHandles()) {
		    webDriver.switchTo().window(handle);
		}
		Thread.sleep(3000);
		
		webDriver.findElement(By.xpath("/html/body/jan-app/jan-main-page/esky-hero/esky-search-form/esky-oneway-roundtrip-form/form/section/fieldset[1]/div[1]/esky-new-autocomplete/span/esky-new-autocomplete-input/div")).click();
		
		WebElement polazak = webDriver.findElement(By.xpath("/html/body/jan-app/jan-main-page/esky-hero/esky-search-form/esky-oneway-roundtrip-form/form/section/fieldset[1]/div[1]/esky-new-autocomplete/span/esky-new-autocomplete-picker/div[2]/esky-new-autocomplete-topbar/div/esky-new-autocomplete-input/div/div/input"));
		polazak.sendKeys("Sarajevo");
		Thread.sleep(2000);
		WebElement sa = webDriver.findElement(By.xpath("/html/body/jan-app/jan-main-page/esky-hero/esky-search-form/esky-oneway-roundtrip-form/form/section/fieldset[1]/div[1]/esky-new-autocomplete/span/esky-new-autocomplete-picker/div[2]/div/esky-new-autocomplete-section/esky-new-autocomplete-hints-list/esky-new-autocomplete-hint/div/span"));
		sa.click();
		Thread.sleep(1000);
		
		webDriver.findElement(By.xpath("/html/body/jan-app/jan-main-page/esky-hero/esky-search-form/esky-oneway-roundtrip-form/form/section/fieldset[1]/div[2]/esky-popular-places/span/esky-new-autocomplete-input/div")).click();
		
		WebElement dolazak = webDriver.findElement(By.xpath("/html/body/jan-app/jan-main-page/esky-hero/esky-search-form/esky-oneway-roundtrip-form/form/section/fieldset[1]/div[2]/esky-popular-places/span/esky-new-autocomplete-picker/div[2]/esky-new-autocomplete-topbar/div/esky-new-autocomplete-input/div/div/input"));
		dolazak.sendKeys("Mallorca");
		Thread.sleep(2000);
		WebElement ma = webDriver.findElement(By.xpath("/html/body/jan-app/jan-main-page/esky-hero/esky-search-form/esky-oneway-roundtrip-form/form/section/fieldset[1]/div[2]/esky-popular-places/span/esky-new-autocomplete-picker/div[2]/div/esky-new-autocomplete-section/esky-new-autocomplete-hints-list/esky-new-autocomplete-hint[1]/div/span"));
	    ma.click();
	    Thread.sleep(1000);
	    
	    webDriver.findElement(By.xpath("/html/body/jan-app/jan-main-page/esky-hero/esky-search-form/esky-oneway-roundtrip-form/form/section/fieldset[2]/div/div[1]/div")).click();
	    Thread.sleep(1000);
	    webDriver.findElement(By.xpath("/html/body/jan-app/jan-main-page/esky-hero/esky-search-form/esky-oneway-roundtrip-form/form/section/fieldset[2]/div/esky-multi-datepicker-combined-view/esky-multi-datepicker/div[1]/div[2]/esky-calendar/esky-calendar-month[2]/esky-calendar-week[2]/esky-calendar-day[5]/div")).click();
	    Thread.sleep(1000);
	    webDriver.findElement(By.xpath("/html/body/jan-app/jan-main-page/esky-hero/esky-search-form/esky-oneway-roundtrip-form/form/section/fieldset[2]/div/esky-multi-datepicker-combined-view/esky-multi-datepicker/div[1]/div[2]/esky-calendar/esky-calendar-month[2]/esky-calendar-week[2]/esky-calendar-day[7]/div/span/span")).click();
	    Thread.sleep(1000);
	    
	    WebElement button = webDriver.findElement(By.tagName("button"));
	    Actions action = new Actions(webDriver);
	    action.moveToElement(button).click().perform();
	    Thread.sleep(1000);
//	    webDriver.findElement(By.cssSelector(".overlay")).click();
	    
	    webDriver.findElement(By.xpath("/html/body/jan-app/jan-main-page/esky-hero/esky-search-form/esky-oneway-roundtrip-form/form/section/div/button")).click();
	    Thread.sleep(3000);
	    
	    
	}

}
