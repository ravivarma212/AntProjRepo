package com.Base;

import java.io.FileInputStream;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import com.Common.common_Functionalities;

import io.github.bonigarcia.wdm.WebDriverManager;

public class browser extends common_Functionalities{
	/**This method purpose is to browser is opened and url is lunched*/		
	public WebDriver launch_Url() throws Exception
	{
		Properties object = new Properties();
		FileInputStream fi = new FileInputStream(".\\src\\main\\resources\\SpreadSheet\\configure.properties");
		object.load(fi);
		String BrowserName = object.getProperty("browser");
		String URL = object.getProperty("url");
		
		if(BrowserName.equalsIgnoreCase("chrome"))
		{
			WebDriverManager.chromedriver();
			d=new ChromeDriver();
			
		}
		else if (BrowserName.equalsIgnoreCase("Edge"))
		{
			WebDriverManager.edgedriver();
			d=new EdgeDriver();					
		}
		else if (BrowserName.equalsIgnoreCase("Firefox"))
		{
			 WebDriverManager.firefoxdriver();
			 d=new FirefoxDriver();
		}
		d.get(URL);
		d.manage().window().maximize();
		
		return d; 
	}

	
	
	
	
}
