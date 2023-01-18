package week3.day1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Facebook {
	public static void main(String[]args) {
		
		ChromeDriver  driver=new ChromeDriver();
		driver.get("http://en-gb.facebook.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.findElement(By.linkText("Create New Account")).click();
		driver.findElement(By.xpath("//input[@name='firstname']")).sendKeys("bharathy");
		driver.findElement(By.xpath("//input[@name='lastname']")).sendKeys("babu");
		
		driver.findElement(By.xpath("//input[@name='reg_email__']")).sendKeys("9597410148");
		
		driver.findElement(By.id("password_step_input")).sendKeys("yashni");
WebElement	findElement	=driver.findElement(By.xpath("//select[@name='birthday_day']"));
Select tool=new Select(findElement);
tool.selectByIndex(7);
WebElement	findElement1	=driver.findElement(By.xpath("//select[@name='birthday_month']"));
Select tool1=new Select(findElement1);
tool1.selectByValue("12");
WebElement	findElement2	=driver.findElement(By.id("year"));
Select tool2=new Select(findElement2);
tool2.selectByValue("1992");

	driver.findElement(By.xpath("//label[text()='Female']")).click();
	System.out.println(driver.findElement(By.xpath("//label[text()='Female']")).isSelected());
	driver.close();
	
}}
