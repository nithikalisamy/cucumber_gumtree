package stepdefinitions;

import org.testng.Assert;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import page.objects.CarVanUteSearchResults;
import page.objects.CarsVansUtePage;
import page.objects.HomePage;
import utils.SeleniumDriver;

public class ToyotaSearch {

	HomePage homePage = new HomePage();
	CarsVansUtePage carsVansUtePage = new CarsVansUtePage();
	CarVanUteSearchResults carVanUteSearchResults = new CarVanUteSearchResults();

	@Given("user goes to gumtree website")
	public void user_goes_to_gumtree_website() {
		System.out.println("user_goes_to_gumtree_website");

		SeleniumDriver.goTo(SeleniumDriver.config.getProperty("url"));

	}

	@When("user mouseover to cars and vehicles")
	public void user_mouseover_to_cars_and_vehicles() {
		System.out.println("user_mouseover_to_newcars");

		homePage.mouseOverCarsVehicle();

	}

	@Then("user clicks on carsvehiclesutes")
	public void user_clicks_on_carsvehiclesutes() {
		System.out.println("user_clicks_on_findnewcars");

		homePage.clickCarsVehicleVansSubMenu();

	}

	@And("select {string} from the make")
	public void select_toyota_from_the_make(String make) {

		carsVansUtePage.selectMake(make);

	}

	@And("select {string} from the model")
	public void select_rav4_from_the_model(String model) {
		carsVansUtePage.selectModel(model);
	}

	@And("click on the search")
	public void click_on_the_search() {
		carsVansUtePage.search();
	}

	@And("read first results and check {string}")
	public void read_first_results_and_check_model(String model) {
		String returnedText = carVanUteSearchResults.returnFirstSearchResult();

		System.out.println("\n\nFirst Result ====> " + returnedText + "\n\n");

		Assert.assertTrue(returnedText.contains("RAV4"));
	}
}
