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

class testOsiguranje {

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
		Thread.sleep(2000);
		
		webDriver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div[1]/div[3]/div/div[7]/a/span")).click();
		Thread.sleep(3000);
		
		webDriver.findElement(By.id("insuranceTypeCancellation")).click();
		Thread.sleep(1000);
		
		webDriver.findElement(By.id("departureCountry"));
		Select select = new Select (webDriver.findElement(By.id("departureCountry")));
		select.selectByValue("br");
		Thread.sleep(1000);
		
		webDriver.findElement(By.id("arrivalCountry"));
		Select select2 = new Select (webDriver.findElement(By.id("arrivalCountry")));
		select2.selectByValue("ba");
		Thread.sleep(1000);
		
		webDriver.findElement(By.id("ticketDate")).click();
		Thread.sleep(1000);
		
		webDriver.findElement(By.xpath("/html/body/div[11]/table/tbody/tr[4]/td[6]/a")).click();
		Thread.sleep(1000);
		
		webDriver.findElement(By.id("departureDate")).click();
		Thread.sleep(1000);
		
		webDriver.findElement(By.xpath("/html/body/div[11]/div/a[2]/span")).click();
		Thread.sleep(1000);
		
		webDriver.findElement(By.xpath("/html/body/div[11]/table/tbody/tr[3]/td[5]/a")).click();
		Thread.sleep(1000);
		
		WebElement price = webDriver.findElement(By.id("priceAmount"));
		price.click();
		price.sendKeys("150");
		Thread.sleep(3000);
		
		webDriver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div[2]/div/form/section[2]/fieldset[2]/div/div")).click();
		
		webDriver.findElement(By.xpath("/html/body/div[27]/div/div[2]/div[1]/div/a[2]")).click();
		Thread.sleep(4000);
		
		String cijena = webDriver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div[2]/div/form/section[2]/fieldset[3]/section/div[2]/span[1]")).getText();
		
		assertEquals("7,50",cijena);
		Thread.sleep(2000);
		
		webDriver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div[2]/div/form/section[2]/fieldset[3]/button/span")).click();
		Thread.sleep(2000);
		
		webDriver.navigate().to("https://secure.esky.ba/insurances/options?product=cancellation&departureCountry=br&arrivalCountry=ba&ticketDate=2023-01-21&departureDate=2023-02-17&ticketPrice=150&currencyCode=EUR&paxesAmount=2");
		Thread.sleep(5000);
		
		WebElement name = webDriver.findElement(By.id("insuranceBookPricedOffer_insuranceOrder_paxes_0_pxn"));
		name.click();
		name.sendKeys("Hajrudin");
		Thread.sleep(1000);
		
		WebElement surname = webDriver.findElement(By.id("insuranceBookPricedOffer_insuranceOrder_paxes_0_pxsn"));
		surname.click();
		surname.sendKeys("Vejzović");
		Thread.sleep(1000);
		
		webDriver.findElement(By.xpath("/html/body/div[3]/div[5]/form/section[2]/div/div[1]/div[3]/div/div/div/select"));
		Select select3 = new Select (webDriver.findElement(By.xpath("/html/body/div[3]/div[5]/form/section[2]/div/div[1]/div[3]/div/div/div/select")));
		select3.selectByValue("mr");
		Thread.sleep(1000);
		
		webDriver.findElement(By.xpath("/html/body/div[3]/div[5]/form/section[2]/div/div[1]/div[4]/div/div[3]/div/select"));
		Select select6 = new Select (webDriver.findElement(By.xpath("/html/body/div[3]/div[5]/form/section[2]/div/div[1]/div[4]/div/div[3]/div/select")));
		select6.selectByValue("2000");
		Thread.sleep(1000);
		
		webDriver.findElement(By.xpath("/html/body/div[3]/div[5]/form/section[2]/div/div[1]/div[4]/div/div[2]/div/select"));
		Select select5 = new Select (webDriver.findElement(By.xpath("/html/body/div[3]/div[5]/form/section[2]/div/div[1]/div[4]/div/div[2]/div/select")));
		select5.selectByValue("12");
		Thread.sleep(1000);
		
		webDriver.findElement(By.xpath("/html/body/div[3]/div[5]/form/section[2]/div/div[1]/div[4]/div/div[1]/div/select"));
		Select select4 = new Select (webDriver.findElement(By.xpath("/html/body/div[3]/div[5]/form/section[2]/div/div[1]/div[4]/div/div[1]/div/select")));
		select4.selectByValue("1");
		Thread.sleep(1000);		
		
		
		WebElement broj = webDriver.findElement(By.id("insuranceBookPricedOffer_contactDetails_phoneNumber_phoneNumber"));
//		broj.click();
		broj.sendKeys("amna");
		WebElement mail = webDriver.findElement(By.id("insuranceBookPricedOffer_contactDetails_email"));
		mail.click();
		Thread.sleep(2000);
		String error = webDriver.findElement(By.xpath("/html/body/div[3]/div[5]/form/section[3]/div/fieldset/div[1]/div/div/em")).getText();
		assertEquals("Unesite pravilan telefonski broj", error);
		Thread.sleep(1000);
		broj.click();
		broj.clear();
		Thread.sleep(1000);
		broj.sendKeys("62654987");
		Thread.sleep(1000);
		
		
//		WebElement mail = webDriver.findElement(By.id("insuranceBookPricedOffer_contactDetails_email"));
		mail.click();
		mail.sendKeys("hajrudin.vejzovic@stu.biu.edu.ba");
		Thread.sleep(1000);
		
		webDriver.findElement(By.xpath("/html/body/div[3]/div[5]/form/section[5]/div[1]/div/div/div/div[1]/fieldset/div/label[2]/span[1]")).click();
		Thread.sleep(1000);
		
		WebElement brojKartice = webDriver.findElement(By.id("insuranceBookPricedOffer_paymentDetails_cardNumber"));
		brojKartice.sendKeys("0000000000000000");
		Thread.sleep(1000);
        webDriver.findElement(By.id("insuranceBookPricedOffer_paymentDetails_cardCvv")).click();
        Thread.sleep(2000);
		
		String invalid = webDriver.findElement(By.xpath("/html/body/div[3]/div[5]/form/section[5]/div[2]/div[2]/fieldset[1]/div[1]/div/em")).getText();
		assertEquals("Nepravilan broj kartice", invalid);
		
		
		
	}

}
