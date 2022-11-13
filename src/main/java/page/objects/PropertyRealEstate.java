package page.objects;

import pages.base.BaseTest;

public class PropertyRealEstate extends BaseTest{
	
	public String readFirstRealEstateSerachResults()
	{
		String text = getElementText("firstSearchResult_XPATH");
		return text;
	}

	public void clickGO() {
		// TODO Auto-generated method stub
		click("setPriceSearch_XPATH");
		
	}

	public void enterPrice(String price) {
		// TODO Auto-generated method stub
		sendValues("maxPriceRange_ID", price);
	}
		
	public void sortByMaxPrice() {
		// TODO Auto-generated method stub
		selectOptions("sortOption_ID", "Most Expensive");
	}

}
