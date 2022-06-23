package reforco_2;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class teste1 {
	private WebDriver driver;
	
	@Before
	public void abrirNavegador() {
		System.setProperty("webdirver.chrome.driver", "C:\\Program Files\\chromedriver\\chromedrive.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
	}
	
	
	
	@Test
	public void testeNavegador() {
		driver.get("https://www.amazon.com.br/");
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("Xbox");
		driver.findElement(By.id("nav-search-submit-button")).click();
	}
	
}
