package com.SeleniumMasterMaven;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class CalendarAutomationTest {
	
	
	@Test
	public void CalendarAuto(){
//		System.setProperty("webdriver.chrome.driver", "E:\\Chromedriver//chromedriver.exe");
//		WebDriver driver = new ChromeDriver();
//		driver.get("https://www.oyorooms.com/?utm_source=google&utm_medium=cpc&utm_device=c&utm_campaign=India_SEM_Brand_generic&utm_campaignid=1701551904&utm_adgroup=71982097371&utm_content=538023998106&utm_keyword=oyo&gclid=Cj0KCQjwjIKYBhC6ARIsAGEds-KVdUSxC3YD7KoXM5TWDHa9vinPti4Ji49EP9eFgYdcA88Ap750nMgaAl4PEALw_wcB");
//		driver.findElement(By.xpath("//span[@class='datePickerDesktop__checkInOutText'][1]")).click();
//		Select monthName= new Select(driver.findElement(By.className("DateRangePicker__MonthHeaderSelect")));
//		monthName.selectByVisibleText("September");
//		List<WebElement> dates = driver.findElements(By.className("DateRangePicker__DateLabel"));
//		for(WebElement date: dates)
//		{
//			if(date.getText().equalsIgnoreCase("20"))
//				date.click();
//			if(date.getText().equalsIgnoreCase("22"))
//				date.click();
//		}
		
		int a=-121;
		String str=Integer.toString(a);
		if(str.charAt(0) == '-')
			System.out.println("false");
		int rev=0,temp;
		int check=a;
		while(a>0)
		{
			temp=a%10;
			rev=rev*10+temp;
			a=a/10;
		}
		if(check==rev)
			System.out.println(rev);
		else
			System.out.println(rev+"No");
		
		
	}

}
