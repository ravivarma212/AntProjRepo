package com.Pages;

import java.util.Set;
import org.openqa.selenium.By;
import org.testng.asserts.SoftAssert;

public class Detail_list extends SearchPaage{
	
	SoftAssert soft= new SoftAssert();
	public By Detail = By.xpath("//h2[text()='Autolist Price Analysis']");
    public By PriceHistoryBenz = By.xpath("//h2[text()='Price History']");
    public By Share = By.xpath("//div[text()='Share']");
    public By Facebook = By.xpath("(//div[@class=\"jsx-3123145608 icon-container\"]//following-sibling::div)[2]");
   
    public By FbEmail= By.xpath("//input[@name=\"email\"]");
    public By Password = By.xpath("//input[@name=\"pass\"]");
    public  By Login = By.xpath("//input[@type='submit']");
	
public void ClickCar() throws Exception {
		
		launch_Url();
		click_Element(makemodel);
		enter_Text(entermodelName, "hyundai");
		delay(5);
		element_Display(hyundaidropdown);
		
		click_Element(hyundaidropdown);
		click_Element(Accent);
		delay(5);
	    click_Element(Hyundai_GLS);
		delay(3);
		tab();
		ScrollDown(1000);
		String act = null;
		String actual = getText(Detail);
		String expected = "AUTOLIST PRICE ANALYSIS";
		soft.assertEquals(actual,expected);
		delay(3);
		
		
		ScreenShot("Price_analysis");
		MoveToElement(Share);
		click_Element(Facebook);
		enter_Text(FbEmail, "ravivarma.212@gmail.com");
		enter_Text(Password, "Ragarukin@3");
		delay(6);
	//	click_Element(Login);
		String parent = d.getWindowHandle();
		Set<String> windows = d.getWindowHandles();
		for(String s: windows) {
			
			if(!s.equals(parent)) {
		   d.switchTo().window(parent);
				
			}
		}

}
		
		
     public void mercedes() throws Exception {
	launch_Url();
	click_Element(BodyStyleButton);
	click_Element(Convertibles);
	delay(5);
	click_Element(mercidesE350);
	delay(2);
	tab();
	ScrollDown(1000);
	String actual = getText(PriceHistoryBenz);
	String expected = "PRICE HISTORY";
	soft.assertEquals(actual, expected);
}

}
