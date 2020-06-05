package stepDefinitions;

import io.cucumber.java.Before;
import io.cucumber.java.After;
import org.openqa.selenium.WebDriver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;

public class DummySteps {

    private WebDriver driver;

    @Before()
    public void beforeDummy() {
        System.out.println("BEFORE");
    }

    @Before("@chrome")
    public void beforeChromeDummy() {
        System.out.println("BEFORE CHROME");
    }

    @After
    public void afterDummy() {
        System.out.println("AFTER");
    }

    @Given("dummy given")
    public void dummyGiven() {
        System.out.println("given");
    }

    @When("dummy when")
    public void dummyWhen() {
        System.out.println("when");
    }

    @Then("dummy then")
    public void dummyThen() {
        System.out.println("then");
    }
}