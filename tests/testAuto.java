package ibu.edu.selenium_project;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

class testAuto {
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
//		webDriver.get(baseUrl);
		webDriver.get("https://cars.esky.com/?preflang=hr&cor=hr&adplat=hpQFS&adcamp=whitelabelHR");
		webDriver.manage().window().maximize();
		Thread.sleep(3000);
		
//		webDriver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div[1]/div[3]/div/div[6]/a/span")).click();
//		Thread.sleep(2000);
		
//		for (String handle : webDriver.getWindowHandles()) {
//		    webDriver.switchTo().window(handle);
//		}
//		webDriver.get("https://cars.esky.com/?preflang=rs&cor=ba&adplat=hpQFS&adcamp=whitelabelBA");
//		Thread.sleep(3000);
		
		WebElement cookies = webDriver.findElement(By.xpath("/html/body/div[5]/div[3]/div/div[2]/button"));
		cookies.click();
		cookies.click();
		Thread.sleep(1000);
		
		WebElement dest = webDriver.findElement(By.id("ftsAutocomplete"));
		dest.click();
		dest.sendKeys("Zagreb");
		Thread.sleep(3000);
		webDriver.findElement(By.xpath("/html/body/ul/li[1]/a/div/span")).click();
		Thread.sleep(1000);
		
		webDriver.findElement(By.id("returntolocation")).click();
		Thread.sleep(1000);
		
		WebElement returnLoc = webDriver.findElement(By.id("dropFtsAutocomplete"));
		returnLoc.click();
		returnLoc.clear();
		returnLoc.sendKeys("Sarajevo");
		Thread.sleep(5000);
		webDriver.findElement(By.xpath("/html/body/ul[2]/li[1]/a/div/span")).click();
		Thread.sleep(1000);
		
		webDriver.findElement(By.xpath("/html/body/div[1]/div[2]/div/div[1]/form/div/div[1]/fieldset[1]/div[1]/span/div/span[5]")).click();
		Thread.sleep(1000);
		
		webDriver.findElement(By.xpath("/html/body/div[1]/div[2]/div/div[1]/form/div/div[1]/div/div[1]/span/ul/li[4]")).click();
		Thread.sleep(1000);
		
		webDriver.findElement(By.xpath("/html/body/div[1]/div[2]/div/div[1]/form/div/div[1]/div/div[2]/div/table/tbody/tr[1]/td[5]/a")).click();
		Thread.sleep(1000);
		
		webDriver.findElement(By.xpath("/html/body/div[1]/div[2]/div/div[1]/form/div/div[1]/div/div[2]/div/table/tbody/tr[1]/td[7]/a")).click();
		Thread.sleep(1000);
		
		webDriver.findElement(By.id("puHour"));
		Select sat = new Select(webDriver.findElement(By.id("puHour")));
		sat.selectByValue("12");
		Thread.sleep(1000);
		
		webDriver.findElement(By.id("doHour"));
		Select sat2 = new Select(webDriver.findElement(By.id("doHour")));
		sat2.selectByValue("12");
		Thread.sleep(1000);
		
		webDriver.findElement(By.id("formsubmit")).click();
		Thread.sleep(10000);
		
		webDriver.navigate().to("https://cars.esky.com/SearchResults.do?country=Hrvatska&doYear=2023&doFiltering=true&fromLocChoose=true&filterTo=20&dropLocationName=Zagreb&ftsType=C&affiliateCode=esky_rc&longitude=15.9773&ftsLocationSearch=3576&dropFtsSearch=L&doDay=5&searchType=manytoonesearch&filterFrom=0&puMonth=3&dropFtsInput=sara&dropCountry=Bosna+i+Hercegovina&dropLongitude=15.9773&puDay=3&dropFtsLocationSearch=3041&puHour=12&dropFtsEntry=1471771&enabler=&distance=10&ftsEntry=499623&city=Zagreb&latitude=45.8132&driverage=on&serverName=www.rentalcars.com&dropCity=Sarajevo&dropFtsType=A&ftsAutocomplete=Zagreb%2c+Hrvatska&driversAge=30&dropFtsAutocomplete=Zra%c4%8dna+Luka+Sarajevo+(SJJ)%2c+Sarajevo%2c+Bosna+i+Hercegovina&dropFtsLocationName=Zra%c4%8dna+Luka+Sarajevo&dropCountryCode=hr&doMinute=0&countryCode=&puYear=2023&puSameAsDo=on&locationName=&puMinute=0&ftsInput=zagreb&coordinates=45.8132%2c15.9773&dropLocation=3041&doHour=12&dropLatitude=45.8132&dropCoordinates=43.8244%2c18.3314&ftsLocationName=Zagreb&ftsSearch=L&location=3576&doMonth=3&filterName=CarCategorisationSupplierFilter");

		webDriver.findElement(By.xpath("/html/body/div[3]/div/div[1]/div/div[2]/div[2]/div[5]/ul/li[2]/label/div/ins")).click();
		Thread.sleep(1000);
		
		webDriver.findElement(By.xpath("/html/body/div[3]/div/div[1]/div/div[2]/div[2]/div[7]/ul/li[1]/label/div/ins")).click();
		Thread.sleep(8000);
		
		webDriver.findElement(By.xpath("/html/body/div[3]/div/div[2]/div[6]/table/tbody/tr[3]/td[4]/a/span[2]")).click();
		Thread.sleep(8000);
		
		webDriver.navigate().to("https://cars.esky.com/DriverExtras.do");
		
		String mjenjač = webDriver.findElement(By.xpath("/html/body/div[1]/div/div[3]/div[2]/div[2]/table/tbody/tr[1]/td[2]/ul[2]/li[2]")).getText();
		assertEquals("Automatski mjenjač brzina", mjenjač);
	}

}
