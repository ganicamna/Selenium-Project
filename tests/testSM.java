package ibu.edu.selenium_project;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

class testSM {
	
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
		JavascriptExecutor js = (JavascriptExecutor) webDriver;
        js.executeScript("window.scrollBy(0,4000)");
		WebElement Eskyfacebook = webDriver.findElement(By.xpath("/html/body/footer/div[5]/div[1]/div[1]/a[1]"));
		Eskyfacebook.click();
		Thread.sleep(5000);
	    WebElement EskyYoutube = webDriver.findElement(By.xpath("/html/body/footer/div[5]/div[1]/div[1]/a[2]"));
	    EskyYoutube.click();
	    Thread.sleep(5000);
	    WebElement EskyInst = webDriver.findElement(By.xpath("/html/body/footer/div[5]/div[1]/div[1]/a[3]"));
	    EskyInst.click();
	    Thread.sleep(5000);
	}

}
