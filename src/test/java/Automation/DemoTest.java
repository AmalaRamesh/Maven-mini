package Automation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DemoTest {
	public static void main(String[] args) throws InterruptedException {
		System.out.println("hello");
		System.setProperty("webdriver.driver.chrome",
				"D:\\driver\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
			WebDriver dr= new ChromeDriver();
			dr.get("https://demo.nopcommerce.com/");
			dr.manage().window().maximize();
			WebElement findElement = dr.findElement(By.xpath("//a[text()=\"Log in\"]"));
			findElement.click();
//			register
			dr.findElement(By.xpath("//button[text()=\"Register\"]")).click();
			dr.findElement(By.id("gender-female")).click();
			dr.findElement(By.name("FirstName")).sendKeys("amala");
			dr.findElement(By.name("LastName")).sendKeys("R");
			dr.findElement(By.name("Email")).sendKeys("amalaramesh08@gmail.com");
			dr.findElement(By.name("Company")).sendKeys("tech");
			dr.findElement(By.name("Password")).sendKeys("Ramesh@123");
			dr.findElement(By.name("ConfirmPassword")).sendKeys("Ramesh@123");
			dr.findElement(By.xpath("//button[text()=\"Register\"]")).click();//button
//			Login::
			Thread.sleep(4000);
		    dr.findElement(By.name("q")).sendKeys("Desktops");//search box
		    dr.findElement(By.xpath("//button[text()=\"Search\"]")).click();//search button
		    dr.findElement(By.xpath("//a[text()=\"Build your own computer\"]")).click();
			Select drop =new Select(dr.findElement(By.xpath("//select[@data-attr='2']")));
			drop.selectByVisibleText("2 GB");
			drop.selectByIndex(1);
		    dr.findElement(By.id("product_attribute_3_6")).click();
		    Thread.sleep(1000);
		    dr.findElement(By.xpath("//button[text()=\"Add to cart\"]")).click();
		    dr.findElement(By.xpath("//span[text()=\"Shopping cart\"]")).click();
		    dr.findElement(By.xpath("//button[text()=\"Update shopping cart\"]")).click();
		    dr.findElement(By.xpath("//input[@name=\"termsofservice\"]")).click();
		    dr.findElement(By.xpath("//button[@name=\"checkout\"]")).click();
		    Thread.sleep(1000);
		    dr.findElement(By.xpath("//input[@id=\"Email\"]")).sendKeys("amalaramesh08@gmail.com");
		    dr.findElement(By.name("Password")).sendKeys("Ramesh@123");
		    dr.findElement(By.xpath("//button[text()=\"Log in\"]")).click();
		    dr.findElement(By.xpath("//button[text()=\"Update shopping cart\"]")).click();
		    dr.findElement(By.xpath("//input[@id=\"termsofservice\"]")).click();
		    dr.findElement(By.xpath("//button[@id=\"checkout\"]")).click();
		    Thread.sleep(2000);
////		    Address:
	    Select drop1 =new Select(dr.findElement(By.xpath("//select[@name=\"BillingNewAddress.CountryId\"]")));
			drop1.selectByVisibleText("India");
			drop1.selectByIndex(133);
		    dr.findElement(By.xpath("//input[@id=\"BillingNewAddress_City\"]")).sendKeys("Chennai");
		    dr.findElement(By.xpath("//input[@id=\"BillingNewAddress_Address1\"]")).sendKeys("Anna nagar");
		    dr.findElement(By.xpath("//input[@id=\"BillingNewAddress_Address2\"]")).sendKeys("Tower park");
		    dr.findElement(By.xpath("//input[@id=\"BillingNewAddress_ZipPostalCode\"]")).sendKeys("6574231");
		    dr.findElement(By.xpath("//input[@id=\"BillingNewAddress_PhoneNumber\"]")).sendKeys("9876543219");
		    dr.findElement(By.xpath("//input[@id=\"BillingNewAddress_FaxNumber\"]")).sendKeys("8756");
		    dr.findElement(By.xpath("//button[text()='Continue']")).click();
//		    dr.switchTo().alert().dismiss();
		    Thread.sleep(1000);
//	        dr.findElement(By.xpath("//button[@class=\"button-1 new-address-next-step-button\"]")).click();
		    Thread.sleep(1000);
	        dr.findElement(By.xpath("//button[@class=\"button-1 shipping-method-next-step-button\"]")).click();
	        Thread.sleep(1000);
		    dr.findElement(By.xpath("//button[@class=\"button-1 payment-method-next-step-button\"]")).click();
		    Thread.sleep(2000);
		    dr.findElement(By.xpath("//button[@class=\"button-1 payment-info-next-step-button\"]")).click();
		    Thread.sleep(1000);
		    dr.findElement(By.xpath("//button[@class=\"button-1 confirm-order-next-step-button\"]")).click();
	        System.out.println("Your order has been successfully processed!");
	        dr.close();
			    

		}
}
