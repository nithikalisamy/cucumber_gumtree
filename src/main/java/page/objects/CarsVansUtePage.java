package page.objects;

import pages.base.BaseTest;

public class CarsVansUtePage extends BaseTest {

	public void selectMake(String make) {
		selectOptions("chooseMakeSelect_XPATH", make);
	}

	public void selectModel(String model) {
		selectOptions("chooseModelSelect_XPATH", model);
	}

	public void search() {
		click("submitSearch_XPATH");
	}

}
