package com.Common;

import java.io.File;

import java.time.Duration;

import java.util.ArrayList;

import java.util.List;

import java.util.Set;

 

import org.apache.commons.io.FileUtils;

import org.openqa.selenium.By;

import org.openqa.selenium.JavascriptExecutor;

import org.openqa.selenium.OutputType;

import org.openqa.selenium.TakesScreenshot;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.WebElement;

import org.openqa.selenium.support.ui.ExpectedConditions;

import org.openqa.selenium.support.ui.Select;

import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.interactions.Actions;

 
public class common_Functionalities {

	/**public means to access any where of the project and WebDriver is interface*/
	public static WebDriver d;
	
	/** this variable is used for explicity wait*/
	private WebDriverWait wait;
	
	/** This is used for window handling functions*/
	
	public String parentWindow;
	public String childWindow;
	
	 /** this method is used for common clickable functionality in Webapplication
	  * 
	  * and elementlocator parameter is a WenElement locater path in dom structure.
	  * 
	  */
	 public boolean click_Element(By elementlocator)
	 {
		 WebElement element=d.findElement(elementlocator);
		 if(element.isDisplayed() & element.isEnabled())
			 
		 {
			 try
			 {
				 element.click();
				 return true;
				 
			}
			 catch(Exception e) {
				 
				 e.printStackTrace();
				 return false;
				 
			}
		 }
		 else
		 {
			 
			 return false;
		 }
		 
		  }
	 
	 /**This method used for Explicity wait
	  * 
	  *parameters are element and it means loocator path
	  * time duration of seconds */
	 
	 public void element_delay(By element,long time) 
	 { 
		 WebElement firstResult = new WebDriverWait(d, Duration.ofSeconds(time)).until(ExpectedConditions.elementToBeClickable((element)));
		 
		 
	 }
	 /**this method  is used for sending the text in the text field..
	  * *
	  * parameters are elementLocator which means textfield locator path in dom structure.
	  * 
	  *
	  *text means sending the data into the field*/
	 public boolean enter_Text(By elementLocator, String text)
	 {
		 if(element_Enable(elementLocator)& element_Display(elementLocator))
		 { 
			 try
		 {
				d.findElement(elementLocator).sendKeys(text);
				return true;
				
				  }
		 catch(Exception e)
		 {
			 e.printStackTrace();
			 return false;
		 }
	 }
	 
	 else
	 {
		 return false;
	 }
}

  /*This method is use to enable the element
   * 
   * parameters are elementLocataor which means element locator path in dom structure.
   * -
   */
		public boolean element_Enable(By elementLocator)
		{
			try
			{
				
				d.findElement(elementLocator).isEnabled();
				return true;
			}
			catch(Exception e)
			{
				e.printStackTrace();
				return false;
			}
		}
		
		/* This method is used to display the element
		 * 
		 *  parameters are elementLocator means element locator path in dom structure.
		 */
		 public boolean element_Display(By elementLocator)
		 {
			 try
			 {
				 d.findElement(elementLocator).isDisplayed();
				 return true;
			 }
			 catch(Exception e)
			 {
				 e.printStackTrace();
				 return false;
				 
			 }
			}
		 /** this method is used to select the element
		  * 
		  * parameters are elementLocatormeans element locator path in dom structure.
		  */
		 public boolean elementSelect(By elementLoactor)
		 {
			 try
			 {
				 d.findElement(elementLoactor).isSelected();
				 return true;
			 }
			 catch(Exception e)
			 {
				 e.printStackTrace();
				 return false;
			 }
			 }
		 /**This method used for Screen shot...
			 * <p>
			 * parameters "name" means storing different names.
			 */
			public boolean ScreenShot(String name) throws Exception
			{
				try
			{
				File scrFile = ((TakesScreenshot)d).getScreenshotAs(OutputType.FILE);
				// Now you can do whatever you need to do with it some delay.
				
				String screenshotPath = ".\\test-output\\ERP_ScreenShots\\"+name+".png";
				
				FileUtils.copyFile(scrFile, new File(screenshotPath));
				return true;
			}
			catch (Exception e) {
				e.printStackTrace();
				return false;
			}
				
			}
		
			/**Generic method for Select_By_Text functionality.
			 * <p>
			 *  dom structure tag mustbe Select.
			 *  <p>
			 *  paramters are elementlocator means element path and text means dropdown text*/
			public boolean dropDownSelectText(By elementLocator, String text)
			{
				if(element_Enable(elementLocator) & element_Display(elementLocator))
				{
					try 
					{
					Select drpCountry = new Select(d.findElement(elementLocator));
					drpCountry.selectByVisibleText(text);
					return true;
					}
					catch(Exception e)
					{
						e.printStackTrace();
						return false;
					}
				}
				else
				{
					return false;
				}
			}
			
			/**Generic method for Select_By_Index functionality.
			 * <p>
			 *  dom structure tag mustbe Select.
			 *  <p>
			 *  paramters are elementLocator means element path and index means dropdown index value*/
			public boolean dropDown_SelectIndex(By elementLocator,int index)
			{
				if(element_Enable(elementLocator) & element_Display(elementLocator))
				{
					try 
					{
					Select drpCountry = new Select(d.findElement(elementLocator));
					drpCountry.selectByIndex(index);
					return true;
					}
					catch(Exception e)
					{
						e.printStackTrace();
						return false;
					}
				}
				else
				{
					return false;
				}
			}
			
			/**Generic method for Dropdown functionality.
			 * <p>
			 *  dom structure without Select tag.
			 *  <p>
			 *  paramters are elementLocator1 means dropdown element path and 
			 *  paramters are elementLocator2 means inside the dropdown text element path.*/
			public boolean DropdownClick(By elementLocator1, By elementLocator2)
			{
				if(element_Enable(elementLocator1) & element_Display(elementLocator1))
				{
					try 
					{
					  click_Element(elementLocator1);
					  click_Element(elementLocator2);
					return true;
					}
					catch(Exception e)
					{
						e.printStackTrace();
						return false;
					}
				}
				else
				{
					return false;
				}
			}
			
			
			/**This method used for Check Box the element...
			 * <p>
			 * parameters elementlocator means element path in dom structure.
			 */
			public boolean Check_box(By elementLocator)
			{
				if(element_Enable(elementLocator) & element_Display(elementLocator))
				{
					try 
					{
						click_Element(elementLocator);
					return true;
					}
					catch(Exception e)
					{
						e.printStackTrace();
						return false;
					}
				}
				else
				{
					return false;
				}
			}
			

			/**This method used for Radio Button the element...
			 * <p>
			 * parameters elementlocator means element path in dom structure.
			 */
			public boolean Radio_button(By elementLocator)
					{
						if(element_Enable(elementLocator) & element_Display(elementLocator))
						{
							try 
							{
								click_Element(elementLocator);
							return true;
							}
							catch(Exception e)
							{
								e.printStackTrace();
								return false;
							}
						}
						else
						{
							return false;
						}
					}
			
			/**This method used for Clear the element text field...
			 * <p>
			 * parameters elementlocator means element path in dom structure.
			 */
			public boolean text_Clear(By elementLocator)
					{
						if(element_Enable(elementLocator) & element_Display(elementLocator))
						{
							try 
							{
							  d.findElement(elementLocator).clear();
							return true;
							}
							catch(Exception e)
							{
								e.printStackTrace();
								return false;
							}
						}
						else
						{
							return false;
						}
					}
			
			/**This method used for Scrolldown the page...
			 * <p>
			 * parameters num means page scroll down to end number.
			 */
			public void ScrollDown(int num)
			{
				JavascriptExecutor js = (JavascriptExecutor) d;
				js.executeScript("window.scrollBy(0,"+num+")", "");
			}
			
			/**This method used for get the text from the table data...
			 * <p>
			 * parameters tablename means table title 
			 * <p>excellvalue means table column value
			 * <p>excellname means table column header
			 */
					public int   WebTables_text(By tablename, String  Excellvalue , String ExcolName ) {
					//boolean result = false;
					int row =-1;
							WebElement table = d.findElement(tablename);
						List<WebElement> cells = table.findElements(By.xpath(("tbody/tr/th")));
						int colCount = cells.size();
						int colnum=1 ;
						for(int i = 1 ; i<=colCount; i++) {
							String colname = table.findElement(By.xpath(("tbody/tr/th["+i+"]"))).getText();
							if(colname.equalsIgnoreCase(ExcolName)) {
								colnum=i;
							break;
							}
						}
						int rows = table.findElements(By.xpath(("tbody/tr"))).size();
						int rownum = 0;
						for(int j =2; j<=rows;j++) {
							String cellvalue=table.findElement(By.xpath(("tbody/tr["+j +"]/td["+colnum+"]"))).getText();
							
							if(cellvalue.equalsIgnoreCase(Excellvalue)) {
								rownum =j;
								break;
							}
			           
					}
					
						if(rownum>=2) {
							row= rownum;
						}
						return row;
					}
			
					/**This method used for Accept the popup...
					 */
					public boolean alert_Accept()
					{
						try 
						{
							d.switchTo().alert().accept();
							return true;
						}
						catch(Exception e)
						{
							e.printStackTrace();
							return false;
						}
					}
					
					/**This method used for Dismiss the popup...
					 */
					public boolean alert_Dismiss()
					{
						try 
						{
							d.switchTo().alert().dismiss();
							return true;
						}
						catch(Exception e)
						{
							e.printStackTrace();
							return false;
						}
					}
					
					/**This method used for gettext the popup...
					 */
					public String alertGetText()
					{
						try 
						{
							return d.switchTo().alert().getText();
							
						}
						catch(Exception e)
						{
							e.printStackTrace();
							return null;
						}
						
					}
					
					/**This method used for gettext the popup...
					 * <p>
					 * text parameter means passing the data in popup.
					 */
					public void alertSendkeys(String text)
					{
						try 
						{
							d.switchTo().alert().sendKeys(text);
						}
						catch(Exception e)
						{
							e.printStackTrace();
						}
						
					}
					
					/**This method used for gettext from webelement...
					 * <p>
					 * locator parameter means webelement path.
					 */
					public String getText(By locator) {
						return d.findElement(locator).getText();
					}
					
					/**This method used for geturl from webpage...
					 */
					public String currentURL() {
						return d.getCurrentUrl();
					}
					
					/**This method used for gettitle from webpage...
					 */
					public String getTitle() {
						return d.getTitle();
					}
					
					/** using this method for exceplicity wait */
					public void Waits(int time) {
						wait = new WebDriverWait(d, Duration.ofSeconds(time));
					}
					
					/** using this method for wait after element is present */
					public void alertIsPresent() {
						wait.until(ExpectedConditions.alertIsPresent());
					}
					
					/** using this method for wait after element is clickable */
					public void elementClickable(By locator) {
						wait.until(ExpectedConditions.elementToBeClickable(locator));
					}
					
					/** using this method for wait after element is visiblity */
					public void visibilityOfElement(By locator) {
						wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
					}
					
					/** using this method for mulitiple windows handling */
					public void WindowsHandling()
					{
						parentWindow = d.getWindowHandle();
						Set<String> windows = d.getWindowHandles();
						for(String s: windows) {
							if(!s.equals(parentWindow)) {
								childWindow = s;
							}
						}
					}
					
					/** using this method for window handling  */
					public void switchToWindow() 
					{
						if(d.getWindowHandle().equals(parentWindow))
							d.switchTo().window(childWindow);
						else
							d.switchTo().window(parentWindow);
					}
					
					/** using this method for delay in seconds */
					public void delay(int timesec) {
						
						long start = System.currentTimeMillis();
						long end = start + timesec * 1000;
						while (System.currentTimeMillis() < end)
						{
						    // Some expensive operation on the item.
						}

					}
					public void tab() {
					
					Set<String> winSet = d.getWindowHandles();
					
					List<String> winList = new ArrayList<String>(winSet);
					String newTab = winList.get(winList.size() - 1);
					 // close the original tab
					d.switchTo().window(newTab); // switch to new tab
					
							   
					}
					public void MoveToElement(By locator) {

						 WebElement ele = d.findElement(locator);
                        Actions act = new Actions(d);
			            act.moveToElement(ele).perform();

			 

						}
					public void Calender() {
						
						
						
						
						
					}
}
	

	

