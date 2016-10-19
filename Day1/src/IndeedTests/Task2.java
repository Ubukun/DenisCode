package IndeedTests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task2 {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\ds\\Selenium\\TrainningFiles\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		String expectedComment = "Changes Saved!";
		String actualComment = "";
		String expectedTourName = "Denis Adventure";
		String actualTourName = "";
			
		// Navigate to "Phptravels" ADMIN website
		driver.get("http://www.phptravels.net/admin");
		Thread.sleep(2000);
		driver.manage().window().maximize();
		Thread.sleep(2000);
		// Enter valid value to the "UserName" field
		Thread.sleep(2000);
		driver.findElement(By.xpath("html/body/div[1]/form[1]/div[1]/input[1]")).sendKeys("admin@phptravels.com");
		Thread.sleep(2000);
		// Enter valid value to the "Password" field
		driver.findElement(By.xpath("html/body/div[1]/form[1]/div[1]/input[2]")).sendKeys("demoadmin");
		// Click on the "Login" button
		driver.findElement(By.xpath("html/body/div[1]/form[1]/button")).click();
		Thread.sleep(3000);
		// Click on the "Tours" link
		driver.findElement(By.xpath(".//*[@id='social-sidebar-menu']/li[6]/a/i[2]")).click();
		Thread.sleep(2000);
		// Select "Add New" link
	    driver.findElement(By.xpath(".//*[@id='Tours']/li[2]/a")).click();
		Thread.sleep(2000);
		// Enter new tour name into the "Tour Name" field
		driver.findElement(By.xpath(".//*[@id='GENERAL']/div[3]/div/input")).sendKeys("Denis Adventure");
		// Enter quantity into the "Quantity" field
		driver.findElement(By.xpath(".//*[@id='GENERAL']/div[5]/div/table/tbody/tr[2]/td[2]/input")).sendKeys("2");
		// Enter price into the "Price" field
		driver.findElement(By.xpath(".//*[@id='GENERAL']/div[5]/div/table/tbody/tr[3]/td[2]/input")).sendKeys("800");
			  	
		// Select "Private" from "Tour Type" drop down menu
		driver.findElement(By.xpath(".//*[@id='s2id_autogen1']/a/span[2]/b")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath(".//*[@id='select2-drop']/ul/li[2]/div")).click();
		Thread.sleep(2000);
		// Select "Location" from "Location1" drop down menu under Locations section
		driver.findElement(By.xpath(".//*[@id='s2id_autogen3']/a/span[2]/b")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath(".//*[@id='select2-drop']/ul/li[31]/div")).click();
		Thread.sleep(2000);
		   			   		
		// Click on the "SUBMIT" button
	    driver.findElement(By.xpath(".//*[@id='add']")).click();
		Thread.sleep(2000);
			 	
		// Verify if new tour have been created successfully with "Changes Saved!" message validation
		 actualComment = driver.findElement(By.xpath("html/body/div[3]/div/h4")).getText();
		 if (actualComment.contentEquals(expectedComment)){
		 	 		System.out.println("Test PASSED! The 'Changes Saved!' message is displayed" );
		 	 }else{
		 	 		System.out.println("Test FAILED! The 'Changes Saved!' message is not displayed");
		 	}
		 // Verify if new account have been created successfully with account holder last name validation
		 actualTourName = driver.findElement(By.xpath(".//*[@id='content']/div/div[2]/div/div/div[1]/div[2]/table/tbody/tr[1]/td[5]/a")).getText();
		 if (actualTourName.contentEquals(expectedTourName)){
		 	 	   System.out.println("Test PASSED! New 'Denis Adventure' tour is created");
		 	}else{
		 	 	   System.out.println("Test FAILED! New 'Denis Adventure' tour was not created");
		 	 	}
		 	 	
		 // Close the browser
		 driver.close();
		  			 				
	}

}
