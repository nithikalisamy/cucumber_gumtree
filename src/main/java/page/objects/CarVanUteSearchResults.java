package page.objects;

import pages.base.BaseTest;

public class CarVanUteSearchResults extends BaseTest {

	public String returnFirstSearchResult() {

		String text = getElementText("firstRealEstateResult_XPATH");
		return text;
	}

}
