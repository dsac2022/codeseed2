package testcases;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class MultipleWindow {

	@Test
	public void multiWindow() {
		System.setProperty("webdriver.chrome.driver", "D:\\Automation\\Chrome\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://demoqa.com/browser-windows");
		driver.manage().window().maximize();
		String parentWindow = driver.getWindowHandle();
		WebElement button = driver.findElement(By.xpath("//button[contains(@id,'windowB')]"));
		button.click();
		Set<String> windowHandles = driver.getWindowHandles();
//		WebElement childWindowHeading = driver.findElement(By.xpath("//h1[starts-with(@id,'sampleHeading')]"));
//		System.out.println(childWindowHeading.getAttribute("innerHTML"));
		for (String str : windowHandles) {
			if (!(str.equals(parentWindow))) {
				driver.switchTo().window(str);
				WebElement childWindowHeading = driver.findElement(By.xpath("//h1[starts-with(@id,'sampleHeading')]"));
				System.out.println(childWindowHeading.getAttribute("innerHTML"));
				driver.close();
			}

		}
		driver.switchTo().window(parentWindow);
	   button.click();
	   driver.quit();

	}
}
