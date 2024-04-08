package example.cucumber;

import static org.junit.jupiter.api.Assertions.assertTrue;

import dtu.projectManagementSystem.app.SoftwareHuset;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginSteps {

    private SoftwareHuset softwareHuset;


    @Given("that no-one is logged in")
    public boolean that_no_one_is_logged_in() throws Exception{
        SoftwareHuset huset = new SoftwareHuset();
        return true;
        // Write code here that turns the phrase above into concrete actions

    }

    @Given("an employee with an ID exists")
    public void an_employee_with_an_id_exists() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }

    @When("an employee logs in with their ID")
    public void an_employee_logs_in_with_their_id() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }

    @Then("the employee is logged into the system")
    public void the_employee_is_logged_into_the_system() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }

    @Given("an employee has an ID that is not registered in the system")
    public void an_employee_has_an_id_that_is_not_registered_in_the_system() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }

    @When("an employee logs in with the ID")
    public void an_employee_logs_in_with_the_id() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }

    @Then("the employee is not logged into the system, and an error message {string} appears")
    public void the_employee_is_not_logged_into_the_system_and_an_error_message_appears(String string) {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }
}




