package selenium_assignment3;

import io.github.bonigarcia.wdm.WebDriverManager;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
//import dev.failsafe.internal.util.Assert;
//import org.junit.Test;
//import static org.junit.Assert.assertEquals;

public class main {
	public static  void main(String[] args) {
		WebDriverManager.firefoxdriver().setup();
		WebDriver driver = new FirefoxDriver();
		
		driver.get("https://www.saucedemo.com/");
		driver.manage().window().maximize();
		
		//login
		driver.findElement(By.xpath("//input[@id=\"user-name\"]")).sendKeys("standard_user");
		driver.findElement(By.xpath("//input[@id=\"password\"]")).sendKeys("secret_sauce");
		driver.findElement(By.xpath("//input[@id=\"login-button\"]")).click();
		
		//Test.allTheThings()T-Shirt(Red)[add_to_cart]
		driver.findElement(By.xpath("//button[@id='add-to-cart-test.allthethings()-t-shirt-(red)']")).click();
		
		//Your cart
		driver.findElement(By.xpath("//a[@class='shopping_cart_link']")).click();
		
		//checkout
		driver.findElement(By.xpath("//button[@id='checkout']")).click();
		
		//fill up check out
		driver.findElement(By.xpath("//input[@id='first-name']")).sendKeys("tusher");
		driver.findElement(By.xpath("//input[@id='last-name']")).sendKeys("Paul");
		driver.findElement(By.xpath("//input[@id='postal-code']")).sendKeys("1100");
		
		//continue
		driver.findElement(By.xpath("//input[@id='continue']")).click();
		
		//finish
		driver.findElement(By.xpath("//button[@id='finish']")).click();
		
		
		
	}

}
