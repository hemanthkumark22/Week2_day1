package week2.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ClassroomCreateLead {

	public static void main(String[] args) throws InterruptedException {
		// 1. Setup WebDriverManager for chromedriver
		WebDriverManager.chromedriver().setup();

		// 2. Open Chrome browser
		ChromeDriver Driver = new ChromeDriver();
		// 3. Load application url http://leaftaps.com/opentaps/
		Driver.get("http://leaftaps.com/opentaps/ ");
		// 4. find the username webelement and enter the value.
		Driver.findElement(By.id("username")).sendKeys("Demosalesmanager");

		// 5. find the password webelement and save as variable and enter the value in
		// the webelement.
		WebElement password = Driver.findElement(By.name("PASSWORD"));
		password.sendKeys("crmsfa");

		// 6. find the webelement button using class and enter click.
		Driver.findElement(By.className("decorativeSubmit")).click();
		// Click on CRM/SFA link and Click on Leads link
		Driver.findElement(By.linkText("CRM/SFA")).click();

		// Click on Create Lead link
		Driver.findElement(By.linkText("Create Lead")).click();
		// Enter First Name, Last Name, Company Name
		Driver.findElement(By.id("createLeadForm_companyName")).sendKeys("TestLeaf");
		Driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Hemanth Kumar");
		Driver.findElement(By.id("createLeadForm_lastName")).sendKeys("K");
		Driver.findElement(By.id("createLeadForm_dataSourceId")).sendKeys("Partner");
		Driver.findElement(By.id("createLeadForm_dataSourceId")).sendKeys("Partner");
		Driver.findElement(By.id("createLeadForm_marketingCampaignId")).sendKeys("Automobile");
		Driver.findElement(By.id("createLeadForm_firstNameLocal")).sendKeys("Seenu");
		Driver.findElement(By.id("createLeadForm_lastNameLocal")).sendKeys("Kum");
		Driver.findElement(By.id("createLeadForm_birthDate")).sendKeys("10/4/87");
		Driver.findElement(By.name("generalProfTitle")).sendKeys("Title");
		Driver.findElement(By.id("createLeadForm_departmentName")).sendKeys("Testing");
		Driver.findElement(By.name("annualRevenue")).sendKeys("10%");
		Driver.findElement(By.id("createLeadForm_currencyUomId")).sendKeys("ADP - Andoran peseta");
		Driver.findElement(By.id("createLeadForm_industryEnumId")).sendKeys("Aerospace");
		Driver.findElement(By.id("createLeadForm_numberEmployees")).sendKeys("10");
		Driver.findElement(By.name("ownershipEnumId")).sendKeys("Corporation");
		Driver.findElement(By.name("description")).sendKeys("TestDescription");
		
		//Contact Information
		Driver.findElement(By.name("primaryPhoneCountryCode")).sendKeys("91");
		Driver.findElement(By.id("createLeadForm_primaryPhoneAreaCode")).sendKeys("01");
		Driver.findElement(By.id("createLeadForm_primaryWebUrl")).sendKeys("http://leaftaps.com/opentaps/control/login");
		Driver.findElement(By.id("createLeadForm_primaryEmail")).sendKeys("hemanthkumark22@gmail.com");

		//Personal Information
		Driver.findElement(By.id("createLeadForm_generalToName")).sendKeys("HemPersonalInfo");
		Driver.findElement(By.id("createLeadForm_generalAddress1")).sendKeys("TestAddress");
		Driver.findElement(By.id("createLeadForm_generalCity")).sendKeys("chennai");
		Driver.findElement(By.id("createLeadForm_generalStateProvinceGeoId")).sendKeys("TAMILNADU");
		Driver.findElement(By.id("createLeadForm_generalCountryGeoId")).sendKeys("INDIA");
		Driver.findElement(By.id("createLeadForm_generalPostalCode")).sendKeys("600001");

		// Click on Create Lead button
		Driver.findElement(By.name("submitButton")).click();

	}

}
