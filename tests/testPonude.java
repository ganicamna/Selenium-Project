package ibu.edu.selenium_project;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

class testPonude {
	
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

		WebElement Ponude = webDriver.findElement(By.xpath("//*[@id=\"header-top\"]/div/nav/ul/li[7]/a"));
		Ponude.click();
		Thread.sleep(2000);
		
		String PonudeUrl = webDriver.getCurrentUrl();
		assertEquals("https://www.esky.ba/prilike",PonudeUrl);
		WebElement od = webDriver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div[3]/div/div[1]/div[1]/input"));
        od.click();
        Thread.sleep(1000);
        
        webDriver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div[3]/div/div[1]/div[2]/div[2]/div/div[1]/div/div[3]/div[2]/ul/li[3]/label")).click();
        Thread.sleep(2000);
        
        webDriver.findElement(By.xpath( "/html/body/div[1]/div/div[2]/div[3]/div/div[2]/div[1]/input")).click(); 
        Thread.sleep(1000);
        
        webDriver.findElement(By.xpath( "/html/body/div[1]/div/div[2]/div[3]/div/div[2]/div[2]/div[2]/div/div[1]/div/div[3]/div[4]/div[2]/div[7]/label")).click(); 
        Thread.sleep(1000);
        
        webDriver.findElement(By.xpath( "/html/body/div[1]/div/div[2]/div[3]/div/div[2]/div[2]/div[2]/div/div[1]/div/div[3]/div[4]/div[2]/div[8]/div[1]/label")).click(); 
        Thread.sleep(2000);
        
        webDriver.findElement(By.xpath( "/html/body/div[1]/div/div[2]/div[3]/button")).click();
        Thread.sleep(3000);
        
        webDriver.findElement(By.id( "radio-group-0-4")).click();
        Thread.sleep(5000);
        
        WebElement EuroAirportMiluz = webDriver.findElement(By.xpath( "/html/body/div[1]/div[1]/h1/strong[2]"));
        String TextDestination = EuroAirportMiluz.getText();
        assertEquals("EuroAirport Miluz", TextDestination );
        webDriver.findElement(By.xpath( " /html/body/div[2]/div[3]/div/div[3]/div[1]/div[2]/div/form/fieldset[1]/div[1]/div/input")).sendKeys("23427843242");
        Thread.sleep(2000);
        
        WebElement password = webDriver.findElement(By.xpath( "  /html/body/div[2]/div[3]/div/div[3]/div[1]/div[2]/div/form/fieldset[1]/div[2]/div/input"));
        password.click();
        password.sendKeys("abcd");
        Thread.sleep(1000);
        
        WebElement error = webDriver.findElement(By.className( "error-msg"));
        String invalid = error.getText();
        assertEquals("Unesite pravilnu e-mail adresu", invalid);
        Thread.sleep(1000);
        
        webDriver.findElement(By.xpath( "/html/body/div[2]/div[3]/div/div[3]/div[1]/div[2]/div/form/fieldset[1]/div[3]/div/button")).click();
        Thread.sleep(2000);
        
        WebElement passwordinvalid = webDriver.findElement(By.xpath( "/html/body/div[2]/div[3]/div/div[3]/div[1]/div[2]/div/form/fieldset[1]/div[2]/div/em"));
        String TextInvalidPassword =  passwordinvalid.getText();
        assertEquals("Unesite pravilan iznos", TextInvalidPassword );
	}

}
