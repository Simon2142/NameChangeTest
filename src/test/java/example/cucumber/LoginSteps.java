package example.cucumber;

import dtu.projectManagementSystem.app.SoftwareHuset;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

public class LoginSteps {

    private SoftwareHuset softwareHuset;

    public LoginSteps(SoftwareHuset softwareHuset) {
        this.softwareHuset = softwareHuset;
    }


    @Given("that no-one is logged in")
    public void that_no_one_is_logged_in() throws Exception{
        assertFalse(SoftwareHuset.isLoggedIn());

    }

    @Given("an employee with an {string} exists")
    public void an_employee_with_an_id_exists(String string) {
        SoftwareHuset.employees.add(string);
    }

    @When("an employee logs in with their {string}")
    public void an_employee_logs_in_with_their_id(String string) {
        // Write code here that turns the phrase above into concrete actions
        SoftwareHuset.setCurrentlyLoggedIn(string);
    }

    @Then("the employee {string} is logged into the system")
    public void the_employee_is_logged_into_the_system(String string) {
        // Write code here that turns the phrase above into concrete actions
        assertEquals(string, SoftwareHuset.getCurrentlyLoggedIn());
    }
}




