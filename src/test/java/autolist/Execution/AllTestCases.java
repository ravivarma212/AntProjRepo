package autolist.Execution;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;
import com.Pages.Detail_list;

public class AllTestCases extends Detail_list{
	
	

	@Test
	public void clickingOnCar() throws Exception {
		
		
		ClickCar();
	}
	@Test
	public void allmakemodelclick() throws Exception {
		
		Allmakemodels();
	}
	@Test
	public void body_style() throws Exception {
		
		
		body_Style();
	}
	@Test
	public void carComAllMod() throws Exception {
		
		CarcompanySelectInAllModel();
	}

    @Test
	public void carmodAllMod() throws Exception {
    	CarmodelinAllModel();
    }

	@Test
	public void cheapSorting() throws Exception {
		Cheapestsort();
	}
	@Test
	public void convertibleCar() throws Exception {
		
		convert();
	}
	@Test
	public void expSort() throws Exception {
		
		expensiveSort();
		
	}

	@Test
	public void makemodelClicking() throws Exception {
		
	
		make_model_Click();
		
		
	}@Test
	public void mercedes_E350() throws Exception {
		
		mercedes();
	}
	@Test
	public void modelHyundaiSelected() throws Exception {
		
		
		modelSelection();
		
		
	}@Test
	public void model_AccentChoose() throws Exception {
		
		model_Accent();
		
	}
	@Test
	public void sortClickable() throws Exception {
		
		sortClicked();
		
	}@Test
	public void yearranfChoose() throws Exception {
		YearRange();
	}
	@Test
	public void yearSorted() throws Exception  {
		yearSorting();
		
	}
	@AfterMethod
	public void closeBrowser() {
		
		d.close();
	}
	
	
	
	
	
	
	
}
