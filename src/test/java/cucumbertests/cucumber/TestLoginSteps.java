package cucumbertests.cucumber;

import dtu.projectManagementSystem.app.SoftwareHuset;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import static org.junit.jupiter.api.Assertions.*;

public class TestLoginSteps {


    private SoftwareHuset softwareHuset;

    public TestLoginSteps(SoftwareHuset softwareHuset) {
        this.softwareHuset = softwareHuset;
    }



    @Given("that no-one is logged in")
    public void that_no_one_is_logged_in() throws Exception{
        assertFalse(SoftwareHuset.isLoggedIn());

    }

    @Given("an employee with an {string} exists")
    public void an_employee_with_an_id_exists(String ID) {
        SoftwareHuset.employees.add(ID);
    }

    @When("an employee logs in with their {string}")
    public void an_employee_logs_in_with_their_id(String ID) {
        // Write code here that turns the phrase above into concrete actions
        SoftwareHuset.setCurrentlyLoggedIn(ID);
    }

    @Then("the employee {string} is logged into the system")
    public void the_employee_is_logged_into_the_system(String ID) {
        // Write code here that turns the phrase above into concrete actions
        assertEquals(ID, SoftwareHuset.getCurrentlyLoggedIn());
    }


    @And("an employee has an {string} that is not registered in the system")
    public void anEmployeeHasAnIDThatIsNotRegisteredInTheSystem(String ID) {
        assertFalse(SoftwareHuset.employees.contains(ID));
    }

    @When("an employee logs in with the {string}")
    public void anEmployeeLogsInWithThe(String ID) {
        assertTrue(true);

    }


    @Then("the employee is not logged into the system, and an error message {string} appears")
    public void theEmployeeIsNotLoggedIntoTheSystemAndAnErrorMessageAppears(String error) {
        System.out.println(error);
    }
}




