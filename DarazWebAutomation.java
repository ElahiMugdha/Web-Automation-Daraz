package com.it.bd;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class DarazWebAutomation extends BaseDriver {
	
	String url = "https://www.daraz.com.bd/" ;
	
	@Test
	public void testLocators() throws InterruptedException {
		driver.manage().window().maximize();
		//driver.get("https://member.daraz.com.bd/user/login");
		driver.get(url);
		Thread.sleep(5000);
		
		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());
		
		WebElement Login = driver.findElement(By.xpath("//a[contains(text(),'Login')]"));
		Login.click();
		Thread.sleep(5000);
		
		//For Go Back
		driver.navigate().back();
		Thread.sleep(5000);
		
		//For Go Forward
		driver.navigate().forward();
		Thread.sleep(5000);
		
		//For Refresh
		driver.navigate().refresh();
		Thread.sleep(5000);
		
	
		//WebElement Login = driver.findElement(By.id("anonLogin"));
		//Login.click();
		//Thread.sleep(5000);
		
		WebElement email = driver.findElement(By.xpath("//body/div[2]/div[1]/div[2]/div[1]/div[2]/form[1]/div[1]/div[1]/div[1]/input[1]"));
		email.sendKeys("01755351872");
		Thread.sleep(3000);
		
		WebElement password = driver.findElement(By.xpath("//body/div[2]/div[1]/div[2]/div[1]/div[2]/form[1]/div[1]/div[1]/div[2]/input[1]"));
		password.sendKeys("Mugdha01");
		Thread.sleep(3000);
		
		WebElement login = driver.findElement(By.className("next-btn"));
		login.click();
		Thread.sleep(5000);
		
		driver.navigate().refresh();
		Thread.sleep(5000);
		
		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());
	
}

}