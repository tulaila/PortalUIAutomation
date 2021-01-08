package com.gcdp.test;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;

public class PreScreening extends Base {

	PreScreening() {
		login();
	}

	public void chooseProgram(String program, String organization) {
		sleep();
		selectFromDropdown("//*[@id=\"guideContainer-rootPanel-home-programId___widget\"]", program);
		selectFromDropdown("//*[@id=\"guideContainer-rootPanel-home-organizationId___widget\"]", organization);
		click("//*[@id=\"guideContainer-rootPanel-home-button_continue___widget\"]/span[2]");

		sleep();
		driver.findElement(By.xpath("//strong[2]")).click();
		
		fillPreScreen();
			
	}

	public void fillPreScreen() {

	    driver.findElement(By.id("guideContainer-rootPanel-prescreen-name___widget")).sendKeys("RT Auto_JAN 08-PreScreen_0801");
	    driver.findElement(By.id("guideContainer-rootPanel-prescreen-projectDescription___widget")).sendKeys("Project Description field");
	    driver.findElement(By.id("guideContainer-rootPanel-prescreen-psAddress1Line1___widget")).sendKeys("123 Main Street");
	    driver.findElement(By.id("guideContainer-rootPanel-prescreen-psAddress1City___widget")).sendKeys("Toronto");
	    new Select(driver.findElement(By.id("guideContainer-rootPanel-prescreen-address1ProvinceId___widget"))).selectByVisibleText("Ontario");
	    new Select(driver.findElement(By.id("guideContainer-rootPanel-prescreen-address1CountryId___widget"))).selectByVisibleText("Canada");
	    driver.findElement(By.id("guideContainer-rootPanel-prescreen-address1PostalCode___widget")).sendKeys("M1M1M1");
	    driver.findElement(By.id("guideContainer-rootPanel-prescreen-estimatedStartDate___widget")).sendKeys("2020-12-01");
	    driver.findElement(By.id("guideContainer-rootPanel-prescreen-estimatedEndDate___widget")).sendKeys("2020-12-31");
	    driver.findElement(By.id("guideContainer-rootPanel-prescreen-psRequestedAAFCFunding___widget")).sendKeys("1200");
	    driver.findElement(By.id("guideContainer-rootPanel-prescreen-totalValueOfTheProject___widget")).sendKeys("120000");
	    driver.findElement(By.id("guideContainer-rootPanel-prescreen-projectObjective___widget")).sendKeys("project Activities for funding");
	    driver.findElement(By.id("guideContainer-rootPanel-prescreen-permitsBl__-1_widget")).click();
	    driver.findElement(By.id("guideContainer-rootPanel-prescreen-specifyPermits___widget")).sendKeys("List Permits field");
	    driver.findElement(By.id("guideContainer-rootPanel-prescreen-FundingSource-aafc_amount___widget")).sendKeys("1200");
	    driver.findElement(By.id("guideContainer-rootPanel-prescreen-FundingSource-applicant_amount___widget")).sendKeys("1200");
	    driver.findElement(By.id("guideContainer-rootPanel-prescreen-FundingSource-industry_amount___widget")).sendKeys("1200");
	    driver.findElement(By.id("guideContainer-rootPanel-prescreen-FundingSource-other_amount___widget")).sendKeys("1200");
	    new Select(driver.findElement(By.id("guideContainer-rootPanel-prescreen-naicsCodeParentId___widget"))).selectByVisibleText("Agricultural Production");
	    new Select(driver.findElement(By.id("guideContainer-rootPanel-prescreen-naicsCodeId___widget"))).selectByVisibleText("111211: Potato Farming");
	    
	    driver.findElement(By.xpath("//button[@id='guideContainer-rootPanel-prescreen-submit_new___widget']/span[2]")).click();
	   
	    sleep();
	    driver.findElement(By.linkText("Continue")).click();
        
	    System.out.println("================================");
	    System.out.println("NEW PreScreening Project Created");
	    System.out.println("================================");
	}
}
