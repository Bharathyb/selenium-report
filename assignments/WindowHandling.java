package week4.day2.assignments;

import java.util.List;
import java.time.Duration;
import java.util.ArrayList;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowHandling {public static void main(String[] args) {
	

	//will open chrome browser
    ChromeDriver driver=new ChromeDriver();
    //maximize the window
    driver.manage().window().maximize();
    //load the url
    driver.get("https://www.leafground.com/window.xhtml");
    //wait
    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
//click the new window open
driver.findElement(By.xpath("//span[text()='Open']")).click();
System.out.println(driver.getTitle());
Set<String>windowHandles1=driver.getWindowHandles();
System.out.println(windowHandles1.size());
List<String> lstwindow = new ArrayList<String>(windowHandles1);
driver.switchTo().window(lstwindow.get(1));
System.out.println(driver.getTitle());
driver.close();
driver.switchTo().window(lstwindow.get(0));
//click to multiple open
driver.findElement(By.xpath("//span[text()='Open Multiple']")).click();
System.out.println(driver.getTitle());
Set<String>windowHandles2=driver.getWindowHandles();
System.out.println(windowHandles2.size());
List<String>lstwindow1=new ArrayList<String>(windowHandles2);
driver.switchTo().window(lstwindow1.get(1));
System.out.println(driver.getTitle());
driver.close();
driver.switchTo().window(lstwindow1.get(0));
//click to close window
driver.findElement(By.xpath("//span[text()='Close Windows']")).click();
System.out.println(driver.getTitle());
Set<String>windowHandles3=driver.getWindowHandles();
System.out.println(windowHandles3.size());
List<String>lstwindow2=new ArrayList<String>(windowHandles2);
driver.switchTo().window(lstwindow2.get(2));
System.out.println(driver.getTitle());
driver.close();
driver.switchTo().window(lstwindow1.get(0));

//click to open with delay
driver.findElement(By.xpath("//span[text()='Open with delay']")).click();
System.out.println(driver.getTitle());
Set<String>windowHandles4=driver.getWindowHandles();
System.out.println(windowHandles4.size());
List<String>lstwindow3=new ArrayList<String>(windowHandles4);
driver.switchTo().window(lstwindow3.get(3));
System.out.println(driver.getTitle());
driver.close();
driver.switchTo().window(lstwindow3.get(0));





}}
