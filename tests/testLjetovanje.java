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

class testLjetovanje {
	
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
	    WebElement Ljetovanje = webDriver.findElement(By.xpath("//*[@id=\"header-top\"]/div/nav/ul/li[3]/a"));
	    Ljetovanje.click();
	    Thread.sleep(2000);
	    String Url = webDriver.getCurrentUrl();
	    assertEquals("https://www.esky.ba/let+hotel/portfolio/lp?contextId=ba-holidays", Url);
	    webDriver.navigate().back();
	    Thread.sleep(2000);
	    String UrlPocetna = webDriver.getCurrentUrl();
	    assertEquals("https://www.esky.ba/",UrlPocetna);
	    webDriver.navigate().forward();
	    Thread.sleep(2000);
	    webDriver.findElement(By.xpath(" /html/body/jan-app/jan-landing-page/jan-landing-page-content/div/div[2]/jan-destinations-offers-grid/esky-offers-grid/div/esky-offers-tile[6]/div[2]")).click();
	    Thread.sleep(1000);
	    webDriver.findElement(By.xpath("  /html/body/jan-app/jan-landing-page/jan-landing-page-content/div/div[2]/jan-destinations-offers-grid/esky-offer-details/ifs-custom-dialog/div[2]/div/div[2]/div[3]")).click();
        Thread.sleep(20000);
        
        webDriver.findElement(By.xpath(" /html/body/jan-app/jan-search-results/esky-search-results-layout/div/div[1]/esky-search-results-layout-side/esky-filters-sidebar/div/esky-filter-group-list/div[1]/esky-text-filter-group/esky-filter-group-wrapper/div[2]/div/div/input")).sendKeys("Hotel");
        Thread.sleep(6000);
        webDriver.findElement(By.xpath(" /html/body/jan-app/jan-search-results/esky-search-results-layout/div/div[1]/esky-search-results-layout-side/esky-filters-sidebar/div/esky-filter-group-list/div[1]/esky-text-filter-group/esky-filter-group-wrapper/div[2]/div/div/input")).clear();
        Thread.sleep(2000);
        webDriver.findElement(By.xpath("//*[@id=\"min\"]")).sendKeys("151");
        Thread.sleep(1000);
        webDriver.findElement(By.xpath("//*[@id=\"max\"]")).sendKeys("3030");
        Thread.sleep(2000);
        WebElement direktanlet = webDriver.findElement(By.xpath("/html/body/jan-app/jan-search-results/esky-search-results-layout/div/div[1]/esky-search-results-layout-side/esky-filters-sidebar/div/esky-filter-group-list/div[4]/esky-multiselect-filter-group/esky-filter-group-wrapper/div[2]/div/ul/li/esky-checkbox/label/span[2]/div/div[1]/esky-filter-display/span"));
        direktanlet.click();
        Thread.sleep(2000);
        WebElement dorucak = webDriver.findElement(By.xpath("/html/body/jan-app/jan-search-results/esky-search-results-layout/div/div[1]/esky-search-results-layout-side/esky-filters-sidebar/div/esky-filter-group-list/div[5]/esky-multiselect-filter-group/esky-filter-group-wrapper/div[2]/div/ul/li[2]/esky-checkbox/label/span[2]/div/div[1]/esky-filter-display/span"));
        dorucak.click();
        JavascriptExecutor js = (JavascriptExecutor) webDriver;
        js.executeScript("window.scrollBy(0,300)");
        Thread.sleep(3000);
        WebElement brojzvjezdica = webDriver.findElement(By.xpath("/html/body/jan-app/jan-search-results/esky-search-results-layout/div/div[1]/esky-search-results-layout-side/esky-filters-sidebar/div/esky-filter-group-list/div[6]/esky-multiselect-filter-group/esky-filter-group-wrapper/div[2]/div/ul/li[1]/esky-checkbox/label/span[1]"));
        brojzvjezdica.click();
        js.executeScript("window.scrollBy(0,600)");
        Thread.sleep(2000);
		WebElement ocjenagostijuup = webDriver.findElement(By.xpath("/html/body/jan-app/jan-search-results/esky-search-results-layout/div/div[1]/esky-search-results-layout-side/esky-filters-sidebar/div/esky-filter-group-list/div[7]/esky-multiselect-filter-group/esky-filter-group-wrapper/div[1]/esky-icon/img"));
		ocjenagostijuup.click();
		js.executeScript("window.scrollBy(0,150)");
		Thread.sleep(3000);
		
		WebElement porodica = webDriver.findElement(By.xpath("/html/body/jan-app/jan-search-results/esky-search-results-layout/div/div[1]/esky-search-results-layout-side/esky-filters-sidebar/div/esky-filter-group-list/div[9]/esky-multiselect-filter-group/esky-filter-group-wrapper/div[2]/div/ul/li[4]/esky-checkbox/label/span[1]"));
		porodica.click();
		js.executeScript("window.scrollBy(0,300)");
		Thread.sleep(3000);
		WebElement pristupinternetu = webDriver.findElement(By.xpath("/html/body/jan-app/jan-search-results/esky-search-results-layout/div/div[1]/esky-search-results-layout-side/esky-filters-sidebar/div/esky-filter-group-list/div[10]/esky-multiselect-filter-group/esky-filter-group-wrapper/div[2]/div/ul/li[1]/esky-checkbox/label/span[1]"));
		pristupinternetu.click();
		js.executeScript("window.scrollBy(0,400)");
		Thread.sleep(2000);
		WebElement kucniljubimci = webDriver.findElement(By.xpath("/html/body/jan-app/jan-search-results/esky-search-results-layout/div/div[1]/esky-search-results-layout-side/esky-filters-sidebar/div/esky-filter-group-list/div[10]/esky-multiselect-filter-group/esky-filter-group-wrapper/div[2]/div/ul/li[7]/esky-checkbox/label/span[1]"));
		kucniljubimci.click();
		js.executeScript("window.scrollBy(0,500)");
		Thread.sleep(2000);
		WebElement kada = webDriver.findElement(By.xpath("/html/body/jan-app/jan-search-results/esky-search-results-layout/div/div[1]/esky-search-results-layout-side/esky-filters-sidebar/div/esky-filter-group-list/div[11]/esky-multiselect-filter-group/esky-filter-group-wrapper/div[2]/div/ul/li[2]/esky-checkbox/label/span[1]"));
		kada.click();
		Thread.sleep(2000);
		WebElement dostupneaktivnosti = webDriver.findElement(By.xpath("/html/body/jan-app/jan-search-results/esky-search-results-layout/div/div[1]/esky-search-results-layout-side/esky-filters-sidebar/div/esky-filter-group-list/div[12]/esky-multiselect-filter-group/esky-filter-group-wrapper/div[1]/esky-icon/img"));
		dostupneaktivnosti.click();
		Thread.sleep(3000);
		
		WebElement HotelKing = webDriver.findElement(By.cssSelector("#\\31 06805 > esky-offer-block > div > div.right > div > esky-price-info > div:nth-child(2) > button > span > span.content > span"));
		HotelKing.click();
		Thread.sleep(8000);
		//WebElement soba = webDriver.findElement(By.xpath("/html/body/jan-app/esky-dynamic-package-variants/jan-basket/jan-select-room/div[2]/div/esky-hotel-price-summary/div/div/div[2]/div[1]/esky-price/span[1]"));
		//String ukupnacijena = soba.getText();
		//assertEquals("1.441", ukupnacijena); 
	}

}
