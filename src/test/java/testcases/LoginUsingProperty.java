package testcases;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class LoginUsingProperty {

	@Test
	public void validLogin() throws IOException, InterruptedException {
		File file = new File("D:\\eclipse\\com.codeseed.new\\src\\test\\resources\\test.properties");
		FileInputStream fis = new FileInputStream(file);

		Properties p = new Properties();
		p.load(fis); 
		System.out.println(p.get("userName"));

		System.setProperty("webdriver.chrome.driver", "./src/test/resources/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get(p.getProperty("url"));
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//input[@name='userName'] ")).sendKeys((String) p.get("userName"));
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys((String) p.get("password"));
		driver.findElement(By.xpath("//input[@name='submit']")).click();
		// p.setProperty("user3","pass3");
		FileOutputStream fos = new FileOutputStream(file, false);
		p.put("userName2", "pass2");
		p.store(fos, "this is write operation");
		fos.close();

		fis.close();

	}
}
