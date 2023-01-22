package ibu.edu.selenium_project;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

class testLet {
	
	private static WebDriver webDriver;
	private static String esky;

	@BeforeAll
	static void setUpBeforeClass() throws Exception {
		System.setProperty("webdriver.chrome.driver", "E:\\Fakultet\\System Validation and Testing\\chromedriver.exe");
		webDriver = new ChromeDriver();
		esky = "https://www.esky.ba/";
	}

	@AfterAll
	static void tearDownAfterClass() throws Exception {
		webDriver.quit();
	}

	@Test
	void test() throws InterruptedException {
		webDriver.get(esky);
		assertEquals("https://www.esky.ba/", esky);
		WebElement uobapravca = webDriver.findElement(By.xpath("//*[@id=\"TripTypeRoundtrip\"]"));
		uobapravca.click();
		
		WebElement mjestopolijetanja = webDriver.findElement(By.xpath("//*[@id=\"departureRoundtrip0\"]"));
		mjestopolijetanja.sendKeys("Sarajevo, Sarajevo Intl Airport, Federation of Bosnia and Herzegovina, Bosna i Hercegovina (SJJ)");
		WebElement mjestoslijetanja = webDriver.findElement(By.xpath("//*[@id=\"arrivalRoundtrip0\"]"));
		mjestoslijetanja.sendKeys("Beč, Schwechat, Vienna, Austrija (VIE)");
		Thread.sleep(1000);
		
		WebElement datumpolijetanja = webDriver.findElement(By.xpath("//*[@id=\"departureDateRoundtrip0\"]"));
		datumpolijetanja.click();
		Thread.sleep(1000);
		
		WebElement Januar = webDriver.findElement(By.xpath("//*[@id=\"ui-datepicker-div\"]/div/div/span[1]"));
		String Text = Januar.getText();
		assertEquals("Januar", Text);
		
		Thread.sleep(1000);
		WebElement Jan26 = webDriver.findElement(By.xpath("//*[@id=\"ui-datepicker-div\"]/table/tbody/tr[5]/td[4]/a"));
		Jan26.click();
		Thread.sleep(1000);
		
		WebElement datumpovratka = webDriver.findElement(By.xpath("//*[@id=\"departureDateRoundtrip1\"]"));
		datumpovratka.click();
		Thread.sleep(1000);
		
		WebElement mjesecunaprijed = webDriver.findElement(By.xpath("//*[@id=\"ui-datepicker-div\"]/div/a[2]/span"));
		mjesecunaprijed.click();
		Thread.sleep(1000);
		
		WebElement Februar = webDriver.findElement(By.xpath("//*[@id=\"ui-datepicker-div\"]/div/div/span[1]"));
		String Februarnaslov = Februar.getText();
		assertEquals("Februar", Februarnaslov);
		WebElement Feb8 = webDriver.findElement(By.xpath("//*[@id=\"ui-datepicker-div\"]/table/tbody/tr[2]/td[3]/a"));
		Feb8.click();
		Thread.sleep(1000);
		
		Thread.sleep(2000);
		webDriver.findElement(By.cssSelector(".pax-widget")).click();
		Thread.sleep(2000);
	    webDriver.findElement(By.cssSelector(".adult .plus")).click();
	    Thread.sleep(2000);
		
		
		WebElement search = webDriver.findElement(By.xpath("//*[@id=\"multiQsfFlights\"]/form/section[2]/div[2]/fieldset[2]/button"));
		search.click();
	    Thread.sleep(10000);
	}

}
