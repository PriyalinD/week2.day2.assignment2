package week2.day2.assignment2;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class DeleteLead {
	
		
		public static void main(String[] args) throws InterruptedException {
			System.setProperty("webdriver.chrome.driver","./src/main/resources/driver/chromedriver.exe");
			ChromeDriver driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.get("http://leaftaps.com/opentaps/");
			driver.findElement(By.id("username")).sendKeys("Demosalesmanager");
			driver.findElement(By.id("password")).sendKeys("crmsfa");
			driver.findElement(By.className("decorativeSubmit")).click();
			driver.findElement(By.partialLinkText("CRM/SFA")).click();
			driver.findElement(By.linkText("Leads")).click();
			driver.findElement(By.linkText("Find Leads")).click();
			driver.findElement(By.xpath("//span[text()='Phone']")).click();
			driver.findElement(By.name("phoneAreaCode")).sendKeys("044");
			driver.findElement(By.name("phoneNumber")).sendKeys("6385484926");
			driver.findElement(By.xpath("//button[text()='Find Leads']")).click();
			Thread.sleep(2000);
			String leadId=driver.findElement(By.xpath("//div[@class='x-grid3-cell-inner x-grid3-col-partyId']//a[1]")).getText();
			System.out.println(leadId);
		    driver.findElement(By.xpath("//div[@class='x-grid3-cell-inner x-grid3-col-partyId']//a[1]")).click();
		    
		    driver.findElement(By.linkText("Delete")).click();
			Thread.sleep(2000);
			driver.findElement(By.xpath("//button[text()='Find Leads']")).click();
			Thread.sleep(2000);
			driver.findElement(By.name("id")).sendKeys("leadId");
			Thread.sleep(2000);
			driver.findElement(By.xpath("//button[text()='Find Leads']")).click();
			Thread.sleep(2000);
		String text=	driver.findElement(By.xpath("//div[class='x-paging-info']")).getText();
			if(text.equals("No records to display"))
			{
				System.out.println("msg  show as no records to dispaly");
			}
			else
			{
				System.out.println(" msg  not shown as no records to dispaly");	
			}
			driver.close();
	}
	}


