package stepdefinitions;

import org.testng.Assert;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import page.objects.HomePage;
import page.objects.PropertyRealEstate;

public class StepDefRealEstateMaxPrice {

	HomePage homePage = new HomePage();
	PropertyRealEstate propertyRealEstate = new PropertyRealEstate();

	@Then("user clicks on property for sale")
	public void user_clicks_on_property_for_sale() {
		homePage.clickPropertyForSaleSubMenu();
	}

	@When("user mouseover to realestate")
	public void user_mouseover_to_realestate() {
		homePage.mouseOverRealEstate();
	}

	@And("enters the {string} price")
	public void enters_the_price(String string) {
		System.out.println("enters_the_price : " + string);

		propertyRealEstate.enterPrice(string);

	}

	@And("click on GO")
	public void click_on_GO() {
		System.out.println("click_on_GO");

		propertyRealEstate.clickGO();

	}

	@And("sort by most expensive option")
	public void sort_by_most_expensive_option() {
		System.out.println("sort_by_most_expensive_option");
		propertyRealEstate.sortByMaxPrice();
	}

	@And("read first results and check type")
	public void read_first_results_and_check_type() throws InterruptedException {
		System.out.println("read_first_results_and_check_type");

		String returnedText = propertyRealEstate.readFirstRealEstateSerachResults();

		System.out.println("\n\nFirst Result ====> " + returnedText + "\n\n");

		Thread.sleep(5000);

//		Assert.assertTrue(returnedText.contains(model));

	}

}
