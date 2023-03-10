package com.cydeo.step_definitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Login_StepDefinitions {
    @When("user enters librarian username")
    public void user_enters_librarian_username() {
        // Write code here that turns the phrase above into concrete actions
        System.out.println("user enters librarian username");
    }

    @When("user enters librarian password")
    public void user_enters_librarian_password() {
        // Write code here that turns the phrase above into concrete actions
        System.out.println("user enters librarian password");
    }

    @Then("user should see the dashboard")
    public void user_should_see_the_dashboard() {
        // Write code here that turns the phrase above into concrete actions
        System.out.println("user sees the dashboard");
    }

    @When("user enters student username")
    public void user_enters_student_username() {
        // Write code here that turns the phrase above into concrete actions
        System.out.println("user enters student username");
    }

    @When("user enters student password")
    public void user_enters_student_password() {
        // Write code here that turns the phrase above into concrete actions
        System.out.println("user enters student password");
    }

    @When("user enters admin username")
    public void user_enters_admin_username() {
        // Write code here that turns the phrase above into concrete actions
        System.out.println("user enters admin username");
    }

    @When("user enters admin password")
    public void user_enters_admin_password() {
        // Write code here that turns the phrase above into concrete actions
        System.out.println("user enters admin password");
    }

    @Given("user is on the library login page")
    public void user_is_on_the_library_login_page() {
        // Write code here that turns the phrase above into concrete actions
        System.out.println("user is on library login page");

    }
}
