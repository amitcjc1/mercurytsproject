package com.cjc;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo 
{
	public static void main(String[] args) throws InterruptedException 
	{
		System.out.println("Hello This Is Amit");
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\amit\\Desktop\\chromedriver_win32 (4)\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.facebook.com/");
	driver.manage().window().maximize();
	System.out.println("Done");
	
}

}
