package Exam;


import java.io.File;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;



public class Test_3 extends Page {
	
	@Test
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver","user.home"+File.separator+"chromedriver.exe");
		
		WebDriver driver=new ChromeDriver ();
		
		driver.get("https://automate.io/app/login");
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.findElement(By.id("email")).sendKeys("Email");
		System.out.println("Enter Email");
		driver.findElement(By.id("password")).sendKeys("password");
		System.out.println("enter password");
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//*[@type='submit']")).click();
		System.out.println("Login sucessfully");
		driver.findElement(By.xpath("//*[text()='BOTS']")).click();
		System.out.println("Click on Bots");
		driver.findElement(By.xpath("//*[text()='Create a Bot']")).click();
		System.out.println("Create Bot sucessfully");
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		WebElement e1=driver.findElement(By.xpath("(//*[@class='btn-group'])[1]"));
		try{
		 Actions a=new Actions(driver);
		 a.click(e1);
			System.out.print("click susseffully");
		}
		catch(Exception e){
			e1.click();
			
			
		}
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.findElement(By.xpath("(//*[@class='app-item box link-like pull-left small'])[1]")).click();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//div[@title='New Email']")).click();
		System.out.println("New email select sucessfully");
		driver.findElement(By.xpath("(//*[@class='btn btn-block dropdown-toggle flex-row-align-center btn-default'])[2]")).click();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//*[@title='INBOX']")).click();
		System.out.println("INBOX select sucessfully");
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.findElement(By.xpath("(//*[@class='btn btn-white2 btn-block dropdown-toggle'])[2]")).click();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.findElement(By.xpath("(//*[@class='ellipsed help-block identifier'])[2]")).click();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		WebElement e2=driver.findElement(By.xpath("(//*[@class='btn btn-block dropdown-toggle flex-row-align-center btn-default'])[3]"));
		try{
			 Actions a=new Actions(driver);
			 a.click(e2);
				System.out.print("click susseffully");
			}
			catch(Exception e){
				e2.click();
				
				
			}
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		WebElement email=driver.findElement(By.xpath("//*[@title='Send an Email']"));
		try{
			 Actions a=new Actions(driver);
			 a.doubleClick(email).build().perform();
			 System.out.println("email select sucessfully");
			}
			catch(Exception e){
				email.click();
				
				
			}
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		try{
			if(email.isDisplayed()){
			email.click();
			}
		}
		catch(Exception e){
			//email.click();
			System.out.println("email clicked");
			
			
		}
		
		
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.findElement(By.xpath("(//*[@title='Add an output field'])[2]")).click();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.findElement(By.xpath("(//*[@title='From Name'])[1]")).click();
		System.out.println("Form Name select sucessfully");
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.findElement(By.xpath("(//*[@title='Add an output field'])[3]")).click();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.findElement(By.xpath("(//span[text()='From Email'])[3]")).click();
		System.out.println("Form Email select sucessfully");
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.findElement(By.xpath("(//*[@class='content-editable form-control buttoned'])[4]")).sendKeys("Mail");
		System.out.println("Enter Mail sucessfully");
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.findElement(By.xpath("(//*[@class='content-editable form-control buttoned'])[5]")).sendKeys("Mail");
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.findElement(By.xpath("(//button[@title='Add an output field'])[9]")).click();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.findElement(By.xpath("(//*[@title='Subject'])[9]")).click();
		System.out.println("Enter subject sucessfully");
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		WebElement body=driver.findElement(By.xpath("(//*[@title='Add an output field'])[10]"));
		Actions a= new Actions(driver);
		try{
			a.click(body).build().perform();
		}
		catch(Exception e){
			body.click();
		}
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		try{
			if(body.isDisplayed()){
				body.click();
			}
		}
		catch(Exception e){
			//email.click();
			System.out.println("email clicked");
			
			
		}
		
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.findElement(By.xpath("(//*[@title='Body'])[10]")).click();
		System.out.println("Enter Body sucessfully");
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//a[text()='Save']")).click();
		System.out.println("Click save sucessfully");
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//span[text()='OFF']")).click();
		System.out.println("Click Off sucessfully");
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//button[@class='btn btn-cta2 fixed-size-button']")).click();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//a[text()='Go to Bot list']")).click();
		System.out.println("Click Bot list sucessfully");
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.quit();
		System.out.println("Test completed");
		
			
		
	}

}
