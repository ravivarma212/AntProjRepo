package com.Pages;

import org.openqa.selenium.By;

import com.Base.browser;

public class make_model extends browser{
	
	
	
	public By calender = By.xpath("///input[@id=\"search_booking_date\"]");
	public By ForwardClick = By.xpath("//button[@fdprocessedid=\"dy95zf\"]");
	public By October17_2024 = By.xpath("//button[text()='17']");
	public By October_2023 = By.xpath("//strong[text()='October 2023']");
	
	
	public By makemodel = By.xpath("//button[@class=\"jsx-2881544814 search-by-type-button first jsx-2527416160\"]");
	public By entermodelName = By.xpath("//input[@placeholder=\"Search make\"]");
	public By hyundaidropdown = By.xpath("//div[text()='Hyundai']");
	public By Accent = By.xpath("//div[text()='Accent']");
	public By Chevrolet = By.xpath("//div[text()='2015' and text()='Chevrolet' and text()='Camaro' and text()='LT']");
	
	public By Hyundai_GLS = By.xpath("//div[text()='2015']");
	public By BodyStyleButton = By.xpath("//button[@data-search-button-type=\"bodyType\"]");
	public By Convertibles = By.xpath("//div[text()='Convertibles']");
	public By mercidesE350 = By.xpath("//div[text()='E 350']");
	
	public void make_model_Click() throws Exception
	
	{
		launch_Url();
		click_Element(makemodel);
		
		
	}
	
	public void modelSelection() throws Exception
	{
		launch_Url();
		click_Element(makemodel);
		enter_Text(entermodelName, "hyundai");
		delay(5);
		element_Display(hyundaidropdown);
		click_Element(hyundaidropdown);
		
	}
	
	public void datePicker() throws Exception {
		
		launch_Url();
		delay(3);
		click_Element(calender);
		String month_year_val= d.findElement(October_2023).getText();
		System.out.println(month_year_val);
		
		
		
		
		
	}
	
	public void model_Accent() throws Exception {
		

		launch_Url();
		click_Element(makemodel);
		enter_Text(entermodelName, "hyundai");
		delay(5);
		element_Display(hyundaidropdown);
		click_Element(hyundaidropdown);
		click_Element(Accent);
	}

	
	public void body_Style() throws Exception {
		
		launch_Url();
		click_Element(BodyStyleButton);
	}
	
	public void convert() throws Exception {
		launch_Url();
		click_Element(BodyStyleButton);
		click_Element(Convertibles);
	}
	
	
}
