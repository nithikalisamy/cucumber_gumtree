package page.objects;

import pages.base.BaseTest;

public class HomePage extends BaseTest {

	public void mouseOverCarsVehicle() {
		mouseOver("carsVehicleMainMenu_XPATH");
	}

	public void clickCarsVehicleVansSubMenu() {
		click("carsVehicleVans_XPATH");
	}

	public void mouseOverRealEstate() {
		mouseOver("realEstateMainMenu_XPATH");
	}

	public void clickPropertyForSaleSubMenu() {
		click("propertyForSale_XPATH");
	}

}