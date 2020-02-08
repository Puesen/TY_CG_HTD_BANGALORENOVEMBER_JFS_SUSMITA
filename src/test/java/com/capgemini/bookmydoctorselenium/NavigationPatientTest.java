package com.capgemini.bookmydoctorselenium;

import java.util.concurrent.TimeUnit;

import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;

public class NavigationPatientTest extends BaseTest {

	@Test
	public void testNavigatingPatient() {
		driver.get("http://localhost:4200");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//*[@id=\"navbarNav \"]/ul/li[1]/a")).click();
		driver.findElement(By.xpath("//*[@id=\"userEmail\"]")).sendKeys("patient@gmail.com");
		driver.findElement(By.xpath("//*[@id=\"userPassword\"]")).sendKeys("Patient@123");
		driver.findElement(By.xpath("/html/body/app-root/app-login-user/div/div/div/form/div[3]/button")).click();
		
		//Navigation
		driver.findElement(By.xpath("/html/body/app-root/app-patient-nav/a/button")).click();
		driver.findElement(By.xpath("/html/body/app-root/app-doctors-info/a/button")).click();
		driver.findElement(By.xpath("/html/body/app-root/app-patient-inner-nav/div/a[1]")).click();
		driver.findElement(By.xpath("/html/body/app-root/app-patient-inner-nav/div/a[2]")).click();
		driver.findElement(By.xpath("/html/body/app-root/app-patient-inner-nav/div/a[3]")).click();
		driver.findElement(By.xpath("/html/body/app-root/app-patient-inner-nav/div/a[4]")).click();
		driver.findElement(By.xpath("/html/body/app-root/app-patient-inner-nav/div/a[5]")).click();
		driver.findElement(By.xpath("/html/body/app-root/app-patient-inner-nav/div/a[6]")).click();
		
		//Logout
		driver.findElement(By.xpath("//*[@id=\"navbarNav \"]/ul/li[2]/a")).click();
		driver.close();
		
	}

}
