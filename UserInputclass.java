package myfirstpackage2022;

import java.util.Scanner;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class UserInputclass {
	
public static void main(String[] args) throws Throwable {
System.setProperty("webdriver.chrome.driver", "C:\\Users\\sdeivasigamani\\Desktop\\TestLeaf\\project\\MyFirstProject\\DriverS\\chromedriver.exe");
WebDriver driv = new ChromeDriver();
driv.get("https://www.amazon.com/");
String my_tit = driv.getTitle();
System.out.println(my_tit);
driv.findElement(By.xpath("//span[text()=\"Account & Lists\"]")).click();
Thread.sleep(1500);
driv.findElement(By.id("ap_email")).sendKeys("dsaktheeswaran@gmail.com");
Thread.sleep(1500);
driv.findElement(By.id("continue")).click();


}
}
