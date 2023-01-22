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

class testPitanja {
	
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
		Thread.sleep(2000);
		WebElement More = webDriver.findElement(By.xpath("/html/body/header/div/nav/ul/li[20]/a"));
		More.click();
		Thread.sleep(4000);
		WebElement Recenzije = webDriver.findElement(By.xpath("/html/body/div[27]/div/ul/li[5]/a"));
		Recenzije.click();
		Thread.sleep(3000);
		JavascriptExecutor js = (JavascriptExecutor) webDriver;
        js.executeScript("window.scrollBy(0,800)");
        Thread.sleep(2000);
		WebElement WizzAirlines = webDriver.findElement(By.xpath("/html/body/div[2]/div[3]/table/tbody/tr[2]/td[2]/a"));
		WizzAirlines.click();
        Thread.sleep(4000);
        WebElement Wizzocjena = webDriver.findElement(By.xpath("/html/body/div[2]/div[1]/div[2]/div[2]/span"));
        String ocjena = Wizzocjena.getText();
        assertEquals("4",ocjena);
	}

}
