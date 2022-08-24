package testcases;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class DynamicDropdown {

	@Test
	public void dynamicDrop() {
		System.setProperty("webdriver.chrome.driver", "D:\\Automation\\Chrome\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get(
				"https://www.airvistara.com/in/en/vistara-exclusives/vistara-direct?gclid=EAIaIQobChMI8abg8uSq-QIVGamWCh3E5QF8EAAYASAAEgKcx_D_BwE&utm_source=google&utm_medium=search&utm_campaign=brand-exact&utm_content=vd&utm_term=vistara%20airlines&ef_id=EAIaIQobChMI8abg8uSq-QIVGamWCh3E5QF8EAAYASAAEgKcx_D_BwE:G:s&s_kwcid=AL!596!3!511212724228!e!!g!!vistara%20airlines");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.findElement(By.xpath("//img[@src='/etc.clientlibs/airvistara/clientlibs/clientlib-site/resources/images/dropdown-arrow-purple.png']"));
		driver.findElement(By.xpath("//img[contains(@src,'dropdown-arrow')]")).click();
		driver.findElement(By.xpath("//ul[@id='country-scroll']//li/span[text()='Nepal']")).click();
		
		
	}

}
