package com.android.stepdefs;

import com.android.pages.HomePage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class HomeStepDef extends HomePage {

  @Given("user on the to do list app")
  public void userOnTheToDoListApp() throws Exception {
    openApps();
    Assert.assertTrue(isToolBarAllListDisplay());
  }

  @When("user create new task")
  public void userCreateNewTask() {
    clickIconNewTask();
  }

  @Then("user see task is successfully added")
  public void userSeeTaskIsSuccessfullyAdded() {
    Assert.assertEquals("Title not same", getTaskName(), "yudhi task");
    closeApps();
  }
}
