package IndeedTests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task1 {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\ds\\Selenium\\TrainningFiles\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		String expectedComment = "Changes Saved!";
		String actualComment = "";
		String expectedLastName = "Sobenn";
		String actualLastName = "";
		// Navigate to "Phptravel" ADMIN site
		driver.get("http://www.phptravels.net/admin");
		Thread.sleep(2000);
		driver.manage().window().maximize();
		Thread.sleep(2000);
		// Enter valid value to the "UserName" field
		Thread.sleep(2000);
	  	driver.findElement(By.xpath("html/body/div[1]/form[1]/div[1]/input[1]")).sendKeys("admin@phptravels.com");
	    // Enter valid value to the "Password" field
	  	Thread.sleep(2000);
	  	driver.findElement(By.xpath("html/body/div[1]/form[1]/div[1]/input[2]")).sendKeys("demoadmin");
	    // Click on the "Login" button
	 	driver.findElement(By.xpath("html/body/div[1]/form[1]/button")).click();
		Thread.sleep(3000);
		// Click on the "Account" link
	    driver.findElement(By.xpath(".//*[@id='social-sidebar-menu']/li[4]/a/i[2]")).click();
	    Thread.sleep(2000);
	    // Select "Customers link
	    driver.findElement(By.xpath(".//*[@id='Accounts']/li[3]/a")).click();
	    Thread.sleep(2000);
	    // Click on the "ADD" button
	    driver.findElement(By.xpath(".//*[@id='content']/div/form/button")).click();
	    Thread.sleep(2000);
	    // Enter First Name  into the "First Name" field
	 	driver.findElement(By.xpath(".//*[@id='content']/form/div/div[2]/div/div[1]/div/input")).sendKeys("Denis");
		// Enter Last Name  into the "Last Name" field
	 	driver.findElement(By.xpath(".//*[@id='content']/form/div/div[2]/div/div[2]/div/input")).sendKeys("Sobenn");
	    // Enter email address into the "Email" field
	 	driver.findElement(By.xpath(".//*[@id='content']/form/div/div[2]/div/div[3]/div/input")).sendKeys("siboor69@hotmail.com");
	    // Enter new password into the "Password" field
	 	driver.findElement(By.xpath(".//*[@id='content']/form/div/div[2]/div/div[4]/div/input")).sendKeys("Melissa2015");
	    Thread.sleep(2000);
	    
		// Select "United States" from "Country" drop down menu
	    driver.findElement(By.xpath(".//*[@id='s2id_autogen1']/a/span[2]/b")).click();
	    Thread.sleep(2000);
	    driver.findElement(By.xpath(".//.//*[@id='select2-drop']/ul/li[212]/div")).click();
   		Thread.sleep(2000);
   	   // Select "Tours" check box under "Add" column
	    //driver.findElement(By.xpath(".//*[@id='content']/form/div/div[2]/div/div[17]/div[1]/div/div[2]/ul/li[1]/label/div/ins")).click();
	   	//Thread.sleep(2000);
	    // Click on the "SUBMIT" button
	    driver.findElement(By.xpath(".//*[@id='content']/form/div/div[3]/button")).click();
	 	Thread.sleep(5000);
	 	
	    // Verify if new account have been created successfully with "Changes Saved!" message validation
	 	 	actualComment = driver.findElement(By.xpath("html/body/div[3]/div/h4")).getText();
	 	 	if (actualComment.contentEquals(expectedComment)){
	 	 		System.out.println("Test PASSED! 'Changes Saved!' message is displayed" );
	 	 	}else{
	 	 		System.out.println("Test FAILED! 'Changes Saved!' message is not displayed");
	 	 	}
	 	 // Verify if new account have been created successfully with account holder last name validation
	 	 	actualLastName = driver.findElement(By.xpath(".//*[@id='content']/div/div[2]/div/div/div[1]/div[2]/table/tbody/tr[1]/td[4]")).getText();
	 	 	if (actualLastName.contentEquals(expectedLastName)){
	 	 		System.out.println("Test PASSED! New Account with 'Sobenn' last name is created");
	 	 	}else{
	 	 		System.out.println("Test FAILED! New Account with 'Sobenn' last name was not created");
	 	 	}
	 	 		   
	 	  	// Close the browser
	 		driver.close();
		 		 	
	}
}
