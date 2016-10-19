package IndeedTests;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task3 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Users\\ds\\Selenium\\TrainningFiles\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		String expectedName = "INVOICE";
		String actualName = "";
		String expectedCustName = "Denis Sobenn";
		String actualCustName = "";
		
		// Navigate to "Phptravels" customer website
		driver.get("http://www.phptravels.net");
		Thread.sleep(2000);
		driver.manage().window().maximize();
		Thread.sleep(2000);

		driver.findElement(By.xpath(".//*[@id='top']/div[3]/div/div/div[2]/ul/li[8]/a")).click();
		Thread.sleep(2000);
		
		driver.findElement(By.xpath(".//*[@id='top']/div[3]/div/div/div[2]/ul/li[8]/ul/li[1]/a")).click();
		Thread.sleep(2000);
		
		// Enter valid value to the "UserName" field
		Thread.sleep(2000);
		driver.findElement(By.xpath(".//*[@id='loginfrm']/div/div[3]/div/div[1]/input")).sendKeys("siboor69@hotmail.com");
		Thread.sleep(2000);
		// Enter valid value to the "Password" field
		driver.findElement(By.xpath(".//*[@id='loginfrm']/div/div[3]/div/div[2]/input")).sendKeys("Melissa2015");
		// Click on the "Login" button
		driver.findElement(By.xpath(".//*[@id='loginfrm']/div/div[3]/button")).click();
		Thread.sleep(3000);
		// Click on the "Tours" link
		driver.findElement(By.xpath(".//*[@id='top']/div[3]/div/div/div[2]/ul/li[3]/a")).click();
		Thread.sleep(2000);
		// Click on the "Denis Adventure" link
		driver.findElement(By.xpath(".//*[@id='top']/div[10]/div[3]/div/div[1]/div[2]/div/div[2]/h4/a/b")).click();
		Thread.sleep(2000);
		// Click on the "Book Now" button
		driver.findElement(By.xpath(".//*[@id='OVERVIEW']/div[2]/div/form[2]/div/div[2]/button")).click();
		Thread.sleep(2000);
		// Scroll to the bottom of the page to confirm the booking
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("scrollBy(0,500)");
		Thread.sleep(2000);
		// Click on the "Confirm this booking" button
		driver.findElement(By.xpath(".//*[@id='top']/div[7]/div/div/div[1]/div/div[2]/div[5]/button")).click();
		Thread.sleep(2000);
		JavascriptExecutor js1 = (JavascriptExecutor)driver;
		js1.executeScript("scrollBy(0,500)");
		Thread.sleep(2000);
		
		// Verify if invoice have been created successfully
		actualName = driver.findElement(By.xpath(".//*[@id='top']/div[7]/div/div[7]/div[1]/div[2]")).getText();
		if (actualName.contentEquals(expectedName)){
				 System.out.println("Test PASSED! The 'INVOICE' label is displayed on invoice after booking" );
			}else{
			   System.out.println("Test FAILED! The invoice with 'INVOICE' label was not generated");
			}
		
		// Verify the customer full name on the invoice after booking the newly created Tour
		actualCustName = driver.findElement(By.xpath(".//*[@id='top']/div[7]/div/div[7]/div[2]/p")).getText();
		if (actualCustName.contentEquals(expectedCustName)){
		     System.out.println("Test PASSED! The 'Denis Sobenn' customer full name is displayed on the Invoice");
		   }else{
			 System.out.println("Test FAILED! The 'Denis Sobenn' customer full name was not displayed on the Invoice");
			}
				 	 	
		// Close the browser  .//*[@id='top']/div[7]/div/div[9]/table/tbody/tr[1]/td[2]
		driver.close();
			
	}
}
