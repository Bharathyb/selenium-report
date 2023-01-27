package week4.day2.assignments;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingAlert {public static void main(String[] args) {
	

	//will open chrome browser
    ChromeDriver driver=new ChromeDriver();
    //maximize the window
    driver.manage().window().maximize();
    //load the url
    driver.get("https://www.leafground.com/alert.xhtml");
    //wait
    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
    driver.findElement(By.xpath("(//span[@class='ui-button-text ui-c'])[1]")).click();
    //click to simple alert
    Alert alert=driver.switchTo().alert();
  String text=alert.getText();
    System.out.println(text);
    alert.accept();
    //click to confirm alert
  
    driver.findElement(By.xpath("(//span[@class='ui-button-text ui-c'])[2]")).click();
    String text2=alert.getText();
    System.out.println(text2);
    alert.accept();
    //click to sweet alert
    driver.findElement(By.xpath("(//span[@class='ui-button-text ui-c'])[3]")).click();
    
    driver.findElement(By.xpath("(//span[text()='Dismiss'])")).click();
    //click to sweetmodal
driver.findElement(By.xpath("(//span[@class='ui-button-text ui-c'])[4]")).click();
    
    driver.findElement(By.xpath("(//div[@class='card'])[1]")).click();
    //clickto prompt alert
    driver.findElement(By.xpath("(//span[@class='ui-button-text ui-c'])[6]")).click();
    String text3=alert.getText();
    System.out.println(text3);
    alert.accept();
    //click to confirmation sweet alert
 driver.findElement(By.xpath("(//span[@class='ui-button-text ui-c'])[7]")).click();
    
 driver.findElement(By.xpath("(//span[text()='yes'])")).click();
 driver.findElement(By.xpath("(//span[@class='ui-button-text ui-c'])[8]")).click();
    
    driver.findElement(By.xpath("(//a[@class='ui-dialog-titlebar-icon ui-dialog-titlebar-minimize ui-corner-all'])")).click();
    driver.findElement(By.xpath("(//span[@class=ui-icon ui-icon-closethick'])")).click();  
    driver.close();
    
}}
