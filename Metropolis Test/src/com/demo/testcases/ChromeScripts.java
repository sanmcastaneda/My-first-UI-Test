package com.demo.testcases;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ChromeScripts {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

	String os = System.getProperty("os.name").toLowerCase();
	
	WebDriver driver = new ChromeDriver();
	
	if (os.contains("mac")){
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"/chromedriver");
	}else{
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"/chromedriver.exe");
	}
	driver.get("https://www.zatro.es");
	
	driver.manage().window().maximize();
	
	driver.findElement(By.xpath("//span[.='Buscar']")).click();
	
	driver.findElement(By.name("q")).sendKeys("adidas" + "\n");
	
	driver.findElement(By.linkText("Nmd_r2 pk")).click();
	
	driver.findElement(By.xpath("//button[@class='product-data__talla__select js-open-tallas']")).click();
	
	driver.findElement(By.xpath("//span[@class='talla-nombre ui-text-7 ']")).click();
	
	Thread.sleep(2000);
	
	driver.findElement(By.linkText("Añadir a la cesta")).click();
	
	// I was not able to finish the script due to an issue I could not fix when attempting to add the item in the basket. I'm sorry :(
	
	//WebDriverWait wait1 = new WebDriverWait(driver, 10);
	
	//WebElement element1 = wait1.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[@class='add-cart ui-button-1']")));
	
	//element1.click();
	
	//driver.findElement(By.xpath("//button[@class='add-cart ui-button-1']")).click();
	}
	
	
	}
		
		
	
			
	


