package week2.day2.assignment2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class EditLead {
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
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//span[text()='Advanced']/following::input)[2]")).sendKeys("Priyalin");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[text()='Find Leads']")).click();
		Thread.sleep(2000);
		
		String LeadId =driver.findElement(By.xpath("//div[@class='x-grid3-cell-inner x-grid3-col-partyId']//a[1]")).getText();
		System.out.println(LeadId);
	    WebElement Edit= driver.findElement(By.xpath("//div[@class='x-grid3-cell-inner x-grid3-col-partyId']//a[1]"));
	    Edit.click();
		Thread.sleep(2000);
		driver.findElement(By.linkText("Edit")).click();
		Thread.sleep(2000);
		String title = driver.getTitle();
	    System.out.println(title);
	    driver.findElement(By.id("updateLeadForm_companyName")).sendKeys("");
	    Thread.sleep(2000);
	    driver.findElement(By.className("smallSubmit")).click();
	    Thread.sleep(2000);
	    String edit1=driver.findElement(By.name("companyName")).getAttribute("value");
	    System.out.println(edit1);
	    Thread.sleep(2000);
	    if(LeadId.equals(edit1))
	        
        {
        	System.out.println("name appears");
        }
        else
        {
        	System.out.println("name not appears");	
        }
	    
	   
	
	    
}
}
