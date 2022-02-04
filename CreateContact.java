package week2.day2.assignment2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class CreateContact {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./src/main/resources/driver/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://leaftaps.com/opentaps/");
		driver.findElement(By.id("username")).sendKeys("Demosalesmanager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		driver.findElement(By.partialLinkText("CRM/SFA")).click();
		driver.findElement(By.linkText("Contacts")).click();
		driver.findElement(By.linkText("Create Contact")).click();
		driver.findElement(By.id("firstNameField")).sendKeys("Priyalin");
		driver.findElement(By.id("lastNameField")).sendKeys("D");
		driver.findElement(By.name("firstNameLocal")).sendKeys("Priya");
		driver.findElement(By.name("lastNameLocal")).sendKeys("dany");
		driver.findElement(By.name("departmentName")).sendKeys("CSE");
		driver.findElement(By.name("description")).sendKeys("New to this IT Field");
		driver.findElement(By.xpath("//span[text()='E-Mail Address']/following::input")).sendKeys("priyalindany@gmail.com");
		Thread.sleep(2000);
		WebElement s=driver.findElement(By.id("createContactForm_generalStateProvinceGeoId"));  
		Select s1=new Select(s);	
		s1.selectByVisibleText("New York");
		Thread.sleep(2000);
		driver.findElement(By.className("smallSubmit")).click();
		Thread.sleep(2000);
		driver.findElement(By.partialLinkText("Edit")).click();
		Thread.sleep(2000);
		driver.findElement(By.name("description")).clear();
		Thread.sleep(2000);
		driver.findElement(By.name("importantNote")).sendKeys("Fresher");
	    Thread.sleep(2000);
	    driver.findElement(By.className("smallSubmit")).click();
		Thread.sleep(2000);
		String title=driver.getTitle();
		System.out.println(title);
	    
	    
	}
	
}
