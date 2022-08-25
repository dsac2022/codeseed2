package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

;

public class HomePage {

	//change from github
	WebDriver driver;
	WebElement firstName1;
	WebElement radioBtn1;
	WebElement dateOfBirth;
	WebElement chekckBox;
	WebElement uploadFile;

	
	//this is constructor
	public HomePage(WebDriver driver) {
		this.driver = driver;
	}

	
	public WebElement getFirstName1() {
		return firstName1;
	}

	public void setFirstName1() {
		this.firstName1 = driver.findElement(By.xpath("//input[@id='firstName']"));
	}

	public WebElement getRadioBtn() {
		return radioBtn1;
	}

	public void setRadioBtn() {
		this.radioBtn1 = driver.findElement(By.xpath("//input[@id='gender-radio-1']"));
	}

	public WebElement getDateOfBirth() {
		return dateOfBirth;
	}

	public void setDateOfBirth() {
		this.dateOfBirth = driver.findElement(By.xpath("//input[@id='dateOfBirthInput']"));
	}

	public WebElement getChekckBox() {
		return chekckBox;
	}

	public void setChekckBox() {
		this.chekckBox = driver.findElement(By.xpath("//input[@id='hobbies-checkbox-1']"));
	}


	public WebElement getUploadFile() {
		return uploadFile;
	}


	public void setUploadFile() {
		this.uploadFile = driver.findElement(By.xpath("//input[@id='uploadPicture']"));
	}



}
