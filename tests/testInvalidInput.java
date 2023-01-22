package ibu.edu.selenium_project;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

class testInvalidInput {
	
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

		webDriver.findElement(By.xpath("//*[@id=\"email\"]")).sendKeys("03874342");
	    Thread.sleep(2000);
	    
	    webDriver.findElement(By.xpath(" //*[@id=\"submit\"]")).click();
	    Thread.sleep(2000);
	    
	    WebElement invalidtext = webDriver.findElement(By.xpath("/html/body/footer/div[2]/form/div[1]/div[3]/em"));
	    String Text = invalidtext.getText();
	    assertTrue(Text.contains("Unesite pravilnu e-mail adresu"));
	    Thread.sleep(2000);
	}

}
