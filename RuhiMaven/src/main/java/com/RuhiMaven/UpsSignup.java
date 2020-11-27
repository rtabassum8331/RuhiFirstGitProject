package com.RuhiMaven;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class UpsSignup {
	public void ups() {
		WebDriver chromeDriver = new ChromeDriver();
		System.setProperty("WebDriver.chrome.driver","chromedriver.exe");
		chromeDriver.get("https://wwwapps.ups.com/doapp/signup");
		chromeDriver.manage().window().maximize();
		chromeDriver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		WebElement Cookies= chromeDriver.findElement(By.xpath("//*[@id=\'__tealiumImplicitmodal\']/div/div/div/div/p/a[2]"));
		Cookies.click();
		WebElement Confirm= chromeDriver.findElement(By.id("preferences_prompt_submit"));
		Confirm.click();
		WebElement Name= chromeDriver.findElement(By.id("ups-full_name_input"));
		Name.sendKeys("Ruhi");
		WebElement Email = chromeDriver.findElement(By.id("ups-email_input"));
		Email.sendKeys("Erfg@ymail.com");
		WebElement UserID = chromeDriver.findElement(By.id("ups-user_id_input"));
		UserID.sendKeys("Rtabassum123");
		WebElement Password = chromeDriver.findElement(By.id("ups-user_password_input"));
		Password.sendKeys("!23erf");
		WebElement Phone = chromeDriver.findElement(By.id("ups-phone_input"));
		Phone.sendKeys("3474595244");
		WebElement Check = chromeDriver.findElement(By.xpath("//*[@id=\"ups-checkbox_group\"]/div/label"));
		Check.click();
		WebElement SignUp = chromeDriver.findElement(By.xpath("//*[@id=\'main\']/div/fullpage-doa/main-component/div/login-register/div/div/div[2]/div[2]/form/div[4]/div[3]/div/button/span"));
		SignUp.click();
	}

}
