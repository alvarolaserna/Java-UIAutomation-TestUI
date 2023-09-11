package stepDefinitions;

import cucumber.api.java.en.*;
import pages.HomePage;

import static testUI.UIOpen.open;

public class GoogleSteps {
    private final HomePage home = new HomePage();

    @Given("I navigate to (.*)")
    public void i_navigate_to(String str) {
        open(str);
    }

    @Then("I accept cookies")
    public void i_click_on_cookies() {
        home.getCookiesAccept().scrollTo().click();
    }
}
