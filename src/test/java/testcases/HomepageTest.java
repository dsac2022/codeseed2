package testcases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pages.HomePage;
import utility.Utility;

public class HomepageTest {

	HomePage homepage;
	WebDriver driver;

	@BeforeTest
	public void lauchUrl() {
		driver = Utility.getDriver();
		driver.get("https://demoqa.com/automation-practice-form");
		driver.manage().window().maximize();
		homepage = new HomePage(driver);
	}

	@Test
	public void verifyFormElement() throws InterruptedException {

		homepage.setFirstName1();
		homepage.getFirstName1().sendKeys("UserName");
		homepage.setRadioBtn();
		//homepage.getRadioBtn().click();
		Utility.clickUsingJavaScript(homepage.getRadioBtn(), driver);
		homepage.setDateOfBirth();
		Utility.scrollIntoView(homepage.getDateOfBirth(), driver);
		homepage.getDateOfBirth().click();
		WebElement select = driver.findElement(By.xpath("//select[@class='react-datepicker__year-select']"));
		Utility.selectValueFromDrop(select, "2010");
		Utility.selectDate(driver, "15");
		homepage.setChekckBox();
		Utility.clickUsingJavaScript(homepage.getChekckBox(), driver);
	
		homepage.setUploadFile();
		homepage.getUploadFile().sendKeys("C:\\Users\\Lenovo\\Desktop");

	
	}
}
