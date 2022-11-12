package stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class ToyotaSearch {

	@Given("User goes to gumtree website")
	public void user_goes_to_gumtree_website() {
		System.out.println("user_goes_to_gumtree_website");
	}

	@When("enters toyota rav4 model and search")
	public void enters_toyota_rav4_model_and_search() {
		System.out.println("enters_toyota_rav4_model_and_search");
	}

	@Then("click on the first search result")
	public void click_on_the_first_search_result() {
		System.out.println("enters_toyota_rav4_model_and_search");
	}

}
