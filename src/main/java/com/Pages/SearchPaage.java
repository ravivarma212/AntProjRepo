package com.Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.TakesScreenshot;
import org.testng.asserts.SoftAssert;

public class SearchPaage extends make_model{
	
	SoftAssert soft = new SoftAssert();
	
	public By sort = By.xpath("//div[text()='Best match']");
	public By ExpensiveFirst = By.xpath("//li[text()='Price (Expensive first)']");
	public By ChangeExpensive = By.xpath("//div[text()='Price (Expensive first)']");

	public By Chepestirst = By.xpath("//li[text()='Price (Cheapest first)']");
	public By yearSort = By.xpath("//li[text()='Year (Newest first)']");

	public By AllMakeModels = By.xpath("//span[text()='All makes & models']");
	public By SearchMakeModel= By.xpath("data-testid=\"make-model-menu-filter-input\"");
	public By Toyota = By.xpath("//li[@data-make=\"Toyota\"]");
	public By camry = By.xpath("//li[@data-model=\"Camry\"]");
	public By NoVechicleFound = By.xpath("//div[text()='No vehicles found based on your search criteria']");
	
	public By AlphaRomeo = By.xpath("//li[@data-make=\"Alfa Romeo\"]");
	public By MaxInput= By.xpath("//input[@placeholder=\"2024\"]");
	public By YearRangeDropDown = By.xpath("//div[text()='Year Range']");
	public By TotalCarsCount = By.xpath("//span[text()='337']");
	
	public By CheckAvailability = By.xpath("(//button[text()='Check Availability'])[2]");
	
    
		
		 
    public void sortClicked() throws Exception {
    	launch_Url();
		click_Element(BodyStyleButton);
		click_Element(Convertibles);
		click_Element(sort);
    }
    public void expensiveSort() throws Exception {
    	
    	launch_Url();
		click_Element(BodyStyleButton);
		click_Element(Convertibles);
		click_Element(sort);
		click_Element(ExpensiveFirst);
    	}
    public void Cheapestsort() throws Exception {
    	
    	launch_Url();
		click_Element(BodyStyleButton);
		click_Element(Convertibles);
		click_Element(sort);
		click_Element(Chepestirst);
}
    public void yearSorting() throws Exception {
    	

    	launch_Url();
		click_Element(BodyStyleButton);
		click_Element(Convertibles);
		click_Element(sort);
		click_Element(yearSort);

		
    	
}
    
    public void Allmakemodels() throws Exception {
    	launch_Url();
		click_Element(BodyStyleButton);
		click_Element(Convertibles);
		click_Element(AllMakeModels);

    	}
    public void CarcompanySelectInAllModel() throws Exception {
    	launch_Url();
		click_Element(BodyStyleButton);
		click_Element(Convertibles);
		click_Element(AllMakeModels);
		enter_Text(SearchMakeModel, "Toyota");
		click_Element(Toyota);
    }
	public void CarmodelinAllModel() throws Exception {
		
		launch_Url();
		click_Element(BodyStyleButton);
		click_Element(Convertibles);
		click_Element(AllMakeModels);
		enter_Text(SearchMakeModel, "Toyota");
		click_Element(Toyota);
		click_Element(camry);
		delay(5);
		String actual = getText(NoVechicleFound);
		String expected = "No vehicles found based on your search criteria";
		soft.assertEquals(actual, expected);
		
	}
	
	public void YearRange() throws Exception {
		launch_Url();
		click_Element(BodyStyleButton);
		click_Element(Convertibles);
	    text_Clear(MaxInput);
	    delay(2);
		enter_Text(MaxInput, "2020");
		click_Element(YearRangeDropDown);
		delay(5);
		String actual = getText(TotalCarsCount);
		String expected = "337";
		soft.assertEquals(actual, expected);
		
		
		
		
		
		
		
		
	}
}
