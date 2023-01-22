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

class testProfileInfo {
	
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
		
		WebElement login = webDriver.findElement(By.xpath("/html/body/header/div/div[2]/div[1]/div/p/span/span"));
		login.click();
		Thread.sleep(2000);
		
		WebElement tmail = webDriver.findElement(By.cssSelector(".user-zone-email > .menu-item-text"));
		tmail.click();
		Thread.sleep(5000);
		
		WebElement mail = webDriver.findElement(By.cssSelector("body > app-root > login-component > content-simple > div > login-box > div > esky-login-box > esky-form > form > esky-input-wrapper:nth-child(1) > div > div > div > esky-input-text > input"));
		mail.click();
		mail.sendKeys("janedoe.selenium@gmail.com");
		Thread.sleep(1000);
		
		WebElement password = webDriver.findElement(By.xpath("/html/body/app-root/login-component/content-simple/div/login-box/div/esky-login-box/esky-form/form/esky-input-wrapper[2]/div/div/div/esky-input-password/input"));
		password.click();
		password.sendKeys("janedoe");
		Thread.sleep(1000);
		
		WebElement prijavi = webDriver.findElement(By.xpath("/html/body/app-root/login-component/content-simple/div/login-box/div/esky-login-box/esky-form/form/div/esky-submit-button/button"));
		prijavi.click();
		Thread.sleep(5000);
		
		WebElement account = webDriver.findElement(By.xpath("/html/body/header/div/div[2]/div[1]/div/p/span/span"));
		account.click();
		
		webDriver.findElement(By.linkText("Podaci o kupcu")).click();
		Thread.sleep(5000);
		
		webDriver.findElement(By.xpath("/html/body/app-root/ng-component/ps-stripped-hybrid-layout/content-without-sidebar-v2/div/div/div/div/main/div[2]/ps-container/div/main/ps-user-data-billing-summary/ps-summary-section/ps-card/div/ps-card-content/div/div/ps-list/div/ps-list-item/div/div/div/div[2]/div[3]/ps-button/button/div[2]")).click();
		Thread.sleep(2000);
		
		WebElement ime = webDriver.findElement(By.xpath("/html/body/app-root/ng-component/ps-stripped-hybrid-layout/content-without-sidebar-v2/div/div/div/div/main/div[2]/ps-container/div/main/collapsed-sidebar[2]/div/div/div[2]/ps-user-data-billing-form/div/form/ps-input-container[2]/div/div/esky-input-text/input"));
		ime.click();
		ime.sendKeys("Jane");
		Thread.sleep(1000);
		
		WebElement prezime = webDriver.findElement(By.xpath("/html/body/app-root/ng-component/ps-stripped-hybrid-layout/content-without-sidebar-v2/div/div/div/div/main/div[2]/ps-container/div/main/collapsed-sidebar[2]/div/div/div[2]/ps-user-data-billing-form/div/form/ps-input-container[3]/div/div/esky-input-text/input"));
		prezime.click();
		prezime.sendKeys("Doe");
		Thread.sleep(1000);
		
		webDriver.findElement(By.xpath("/html/body/app-root/ng-component/ps-stripped-hybrid-layout/content-without-sidebar-v2/div/div/div/div/main/div[2]/ps-container/div/main/collapsed-sidebar[2]/div/div/div[2]/ps-user-data-billing-form/div/form/ps-input-container[4]/div/div/esky-input-select/select")).click();
		Select država = new Select(webDriver.findElement(By.xpath("/html/body/app-root/ng-component/ps-stripped-hybrid-layout/content-without-sidebar-v2/div/div/div/div/main/div[2]/ps-container/div/main/collapsed-sidebar[2]/div/div/div[2]/ps-user-data-billing-form/div/form/ps-input-container[4]/div/div/esky-input-select/select")));
		država.selectByValue("BR");
		Thread.sleep(1000);
		
		WebElement pbroj = webDriver.findElement(By.xpath("/html/body/app-root/ng-component/ps-stripped-hybrid-layout/content-without-sidebar-v2/div/div/div/div/main/div[2]/ps-container/div/main/collapsed-sidebar[2]/div/div/div[2]/ps-user-data-billing-form/div/form/ps-input-container[5]/div/div/esky-input-text/input"));
		pbroj.click();
		pbroj.sendKeys("01001");
		Thread.sleep(1000);
		
		WebElement grad = webDriver.findElement(By.xpath("/html/body/app-root/ng-component/ps-stripped-hybrid-layout/content-without-sidebar-v2/div/div/div/div/main/div[2]/ps-container/div/main/collapsed-sidebar[2]/div/div/div[2]/ps-user-data-billing-form/div/form/ps-input-container[6]/div/div/esky-input-text/input"));
		grad.click();
		grad.sendKeys("Sao Paolo");
		Thread.sleep(1000);
		
		WebElement spasi = webDriver.findElement(By.xpath("/html/body/app-root/ng-component/ps-stripped-hybrid-layout/content-without-sidebar-v2/div/div/div/div/main/div[2]/ps-container/div/main/collapsed-sidebar[2]/div/div/div[2]/ps-user-data-billing-form/div/form/div/ps-button/button"));
		spasi.click();
		Thread.sleep(5000);
		
		
		
	}

}
