package week4.day2.assignments;

 import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingFrame1 {
	public static void main(String[] args) {
		

		//will open chrome browser
	    ChromeDriver driver=new ChromeDriver();
	    //maximize the window
	    driver.manage().window().maximize();
	    //load the url
	    driver.get("https://www.leafground.com/frame.xhtml");
	    //wait
	    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	    //frame 0
	    driver.switchTo().frame(0);
	    driver.findElement(By.id("Click")).click();
	  String text=  driver.findElement(By.xpath("//button[text()='Hurray! You Clicked Me.']")).getText();
System.out.println(text);
driver.switchTo().defaultContent();
//switch to frame2
List<WebElement>totalframes=driver.findElements(By.tagName("iframe"));
int size=totalframes.size();
System.out.println(size);
//driver.switchTo().defaultContent();
driver.switchTo().frame(2);
driver.switchTo().frame("frame2");
driver.findElement(By.id("Click")).click();
String text2=  driver.findElement(By.xpath("//button[text()='Hurray! You Clicked Me.']")).getText();

System.out.println(text2);


}}



