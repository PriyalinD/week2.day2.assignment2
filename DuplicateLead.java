package week2.day2.assignment2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DuplicateLead {
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
		driver.findElement(By.xpath("//span[text()='Email']")).click();
		Thread.sleep(2000);
		driver.findElement(By.name("emailAddress")).sendKeys("priyalindany@gmail.com");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[text()='Find Leads']")).click();
		Thread.sleep(2000);
		String name =driver.findElement(By.xpath("//div[@class='x-grid3-cell-inner x-grid3-col-partyId']//a[1]")).getText();
		System.out.println(name);
	    WebElement duplicate= driver.findElement(By.xpath("//div[@class='x-grid3-cell-inner x-grid3-col-partyId']//a[1]"));
	    duplicate.click();
		Thread.sleep(2000);
		driver.findElement(By.linkText("Duplicate Lead")).click();
		String title = driver.getTitle();
	    System.out.println(title);
	    driver.findElement(By.linkText("Create Lead")).click();
		Thread.sleep(2000);
	    String  text=driver.findElement(By.id("createLeadForm_firstName")).getAttribute("value");
        System.out.println("text");
        if(name.equals(text))
        
        {
        	System.out.println("name matched");
        }
        else
        {
        	System.out.println("name not matched");	
        }
}
}



