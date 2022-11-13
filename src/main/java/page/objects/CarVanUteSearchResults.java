package page.objects;

import pages.base.BaseTest;

public class CarVanUteSearchResults extends BaseTest {

	public String returnFirstSearchResult() {

		String text = getElementText("firstSearchResult_XPATH");
		return text;
	}

}
