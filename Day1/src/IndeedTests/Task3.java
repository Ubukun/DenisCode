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
		String expectedName = "Invoice";
		String actualName = "";
		//String expectedTourName = "Denis Adventure";
		//String actualTourName = "";
		
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
		// Click on the "Confirm this booking" button
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("scrollBy(0,500)");
		Thread.sleep(2000);
		driver.findElement(By.xpath(".//*[@id='top']/div[7]/div/div/div[1]/div/div[2]/div[5]/button")).click();
		Thread.sleep(2000);
		
		System.out.println (driver.findElement(By.xpath(".col-md-6>div")).getText());
		// Verify if invoice have been created successfully validation
		actualName = driver.findElement(By.xpath(".col-md-6>div")).getText();
		if (actualName.contentEquals(expectedName)){
				 System.out.println("Test PASSED! The 'INVOICE' is displayed after booking" );
			}else{
			    System.out.println("Test FAILED! The 'INVOICE' is not displayed");
			}
		// Verify if new account have been created successfully with account holder last name validation
		//actualTourName = driver.findElement(By.xpath(".//*[@id='top']/div[7]/div/div[9]/table/tbody/tr[1]/td[2]/strong[1]")).getText();
		//if (actualTourName.contentEquals(expectedTourName)){
		     //System.out.println("Test PASSED! New 'Denis Adventure' tour name is displayed in the Invoice");
		   //}else{
			 // System.out.println("Test FAILED! New 'Denis Adventure' tour name was not displayed in the Invoice");
			//}
				 	 	
		// Close the browser  .//*[@id='top']/div[7]/div/div[9]/table/tbody/tr[1]/td[2]
		driver.close();
		
	
		// Invoice validation
		//.//*[@id='top']/div[7]/div/div[7]/div[1]/div[2]
		// Denis Adventure in invoice
		//.//*[@id='top']/div[7]/div/div[9]/table/tbody/tr[1]/td[2]/strong[1]
	
	}


}
