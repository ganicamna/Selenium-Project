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

class testCityBreak {
	
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

		WebElement CityBreak = webDriver.findElement(By.xpath("//*[@id=\"multiQsf\"]/div[1]/div[3]/div/div[2]/a"));
		CityBreak.click();
		Thread.sleep(2000);
		
		WebElement TextCityBreak = webDriver.findElement(By.xpath("/html/body/jan-app/jan-landing-page/jan-portfolio-hero/esky-landing-page-header/esky-hero/h1"));
	    String Slogan = TextCityBreak.getText();
	    assertEquals("Kratko putovanje kakvo ti treba!", Slogan);
	    WebElement PolazakIz = webDriver.findElement(By.xpath("//*[@id=\"departures\"]"));
	    PolazakIz.click();
	    Thread.sleep(1000);
	    
	    webDriver.findElement(By.cssSelector(".spacing:nth-child(2) > .place")).click();
        Thread.sleep(1000);
        
        WebElement OdaberiButton = webDriver.findElement(By.xpath("/html/body/jan-app/jan-landing-page/jan-portfolio-hero/esky-landing-page-header/esky-hero/div[2]/jan-search-form/form/div[1]/div[1]/jan-places-card/esky-card/div/button[2]/span/span[1]"));
	    OdaberiButton.click();
	   // Thread.sleep(1000);
	    
	    WebElement Destinacije = webDriver.findElement(By.xpath("//*[@id=\"destinations\"]"));
	    Destinacije.click();
	    WebElement Italijabutton = webDriver.findElement(By.xpath("/html/body/jan-app/jan-landing-page/jan-portfolio-hero/esky-landing-page-header/esky-hero/div[2]/jan-search-form/jan-places-card/esky-card/jan-places-with-search/jan-places-grid/div[2]/div[2]/div[1]/div/esky-checkbox/label/span[1]"));
	    Italijabutton.click();
	    //Thread.sleep(1000);
	    
	    WebElement buttonsearch = webDriver.findElement(By.xpath("/html/body/jan-app/jan-landing-page/jan-portfolio-hero/esky-landing-page-header/esky-hero/div[2]/jan-search-form/jan-places-card/esky-card/div/button[2]/span/span[1]"));
	    buttonsearch.click();
	    
	    WebElement Datumpolaska = webDriver.findElement(By.xpath("//*[@id=\"range-start\"]"));
	    Datumpolaska.click();
	    
	    WebElement Datum26 = webDriver.findElement(By.xpath("/html/body/jan-app/jan-landing-page/jan-portfolio-hero/esky-landing-page-header/esky-hero/div[2]/jan-search-form/jan-portfolio-datepicker/div/esky-multi-datepicker-combined-view/esky-multi-datepicker-range/div[1]/div[2]/esky-calendar/esky-calendar-month[2]/esky-calendar-week[4]/esky-calendar-day[7]/div/span/span"));
	    Datum26.click();
	    Thread.sleep(2000);
	    
	    WebElement Izaberitebutton = webDriver.findElement(By.xpath("/html/body/jan-app/jan-landing-page/jan-portfolio-hero/esky-landing-page-header/esky-hero/div[2]/jan-search-form/jan-portfolio-datepicker/div/esky-multi-datepicker-combined-view/esky-multi-datepicker-range/div[1]/div[3]/button[1]"));
	    Izaberitebutton.click();
	    Thread.sleep(2000);
	    
	    WebElement Pretraga = webDriver.findElement(By.xpath("/html/body/jan-app/jan-landing-page/jan-portfolio-hero/esky-landing-page-header/esky-hero/div[2]/jan-search-form/form/div[2]/div[2]/button/span/span[1]/esky-icon/img"));
	    Pretraga.click();
	    Thread.sleep(3000);
	    
	    String Url = webDriver.getCurrentUrl();
	    assertTrue(Url.contains("citybreak"));
	    
	    WebElement sortiranje = webDriver.findElement(By.xpath("/html/body/jan-app/jan-portfolio/esky-search-results-layout/div/div[2]/esky-search-results-layout-over-results/jan-search-results-bar/div/esky-sorting/div/esky-select/div/div"));
	    sortiranje.click();
	    
	    WebElement odnajmanje = webDriver.findElement(By.xpath("/html/body/jan-app/jan-portfolio/esky-search-results-layout/div/div[2]/esky-search-results-layout-over-results/jan-search-results-bar/div/esky-sorting/div/esky-select/esky-select-list/div"));
	    odnajmanje.click();
	    Thread.sleep(2000);
	    
	    JavascriptExecutor js = (JavascriptExecutor) webDriver;
        js.executeScript("window.scrollBy(0,3800)");
        Thread.sleep(2000);
        
	    WebElement WebCz = webDriver.findElement(By.xpath("/html/body/jan-app/jan-portfolio/esky-footer/div[2]/div/ul/li[7]/a"));
	    WebCz.click();
	   Thread.sleep(5000);
	//  WebElement Prijava = webDriver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div[2]/div/form/section[2]/div[1]/div[1]/fieldset[1]/div[1]/label"));
	//  String Odkud = Prijava.getText();
	//  assertEquals("Odkud", Odkud);
	//  Thread.sleep(3000); 

	}

}
