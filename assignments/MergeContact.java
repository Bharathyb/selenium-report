package week4.day2.assignments;

import java.util.List;
import java.time.Duration;
import java.util.ArrayList;
import java.util.Set;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class MergeContact {public static void main(String[] args) {
	

	//will open chrome browser
    ChromeDriver driver=new ChromeDriver();
    //maximize the window
    driver.manage().window().maximize();
    //load the url
    driver.get("http://leaftaps.com/opentaps/control/login");
    //wait
    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

    driver.findElement(By.id("username")).sendKeys("demosalesmanager");
	driver.findElement(By.id("password")).sendKeys("crmsfa");
	driver.findElement(By.className("decorativeSubmit")).click();
	driver.findElement(By.linkText("CRM/SFA")).click();
	driver.findElement(By.linkText("Contacts")).click();
	driver.findElement(By.linkText("Merge Contacts")).click();
	driver.findElement(By.xpath("(//img[@alt='Lookup'])[1]")).click();
	Set<String>windowHandles=driver.getWindowHandles();
	System.out.println(windowHandles.size());
	List<String>lstwindow=new ArrayList<String>(windowHandles);
	driver.switchTo().window(lstwindow.get(1));
	System.out.println(driver.getTitle());
	driver.findElement(By.xpath("(//a[@class='linktext'])[1]")).click();
	driver.switchTo().window(lstwindow.get(0));
	
	
	driver.findElement(By.xpath("(//img[@alt='Lookup'])[2]")).click();
	Set<String>windowHandles1=driver.getWindowHandles();
	System.out.println(windowHandles1.size());
	List<String>lstwindow1=new ArrayList<String>(windowHandles1);
	driver.switchTo().window(lstwindow1.get(1));
	System.out.println(driver.getTitle());
	driver.findElement(By.xpath("(//a[@class='linktext'])[5]")).click();
	driver.switchTo().window(lstwindow1.get(0));
	
	driver.findElement(By.linkText("Merge")).click();
	
	//driver.findElement(By.id("ext-gen603")).click();
	Alert alert=driver.switchTo().alert();
	alert.accept();
	String title=driver.getTitle();
	System.out.println(title);
	
	
	
}
}