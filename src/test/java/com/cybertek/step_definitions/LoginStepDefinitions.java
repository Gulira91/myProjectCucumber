package com.cybertek.step_definitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginStepDefinitions {

    @Given("User on the login page")
    public void user_on_the_login_page() {
        System.out.println("User is on login page");
    }


    @When("User logs in librarian")
    public void user_logs_in_librarian() {
        System.out.println("User logs in as a librarian");
    }


    @Then("User should see dashboard")
    public void user_should_see_dashboard() {
        System.out.println("User should see dashboard");
    }

    @When("User logs in student")
    public void user_logs_in_student() {
        System.out.println("user log is as a student");
    }



    @When("User logs in admin")
    public void user_logs_in_admin() {
        System.out.println("User logs in as a admin");
    }
}
