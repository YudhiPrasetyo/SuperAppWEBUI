package com.android.stepdefs;

import com.android.pages.NewTaskPage;
import io.cucumber.java.en.And;

public class NewTaskStepDef extends NewTaskPage {
  @And("user input task name on new task page")
  public void userInputTaskNameOnNewTaskPage() {
    inputTaskName();
  }

//  @And("user choose due date on new task page")
//  public void userChooseDueDateOnNewTaskPage(String date) {
//    clickDueDate();
//    chooseDate(date);
//  }

  @And("user choose other for repeat option on new task page")
  public void userChooseOtherForRepeatOptionOnNewTaskPage() {
    clickRepeatOption();
    chooseRepeatOption();
  }

  @And("user choose personal for add to list on new task page")
  public void userChoosePersonalForAddToListOnNewTaskPage() {
    clickListAddtoList();
    choosePersonalAddtoList();
    clickBtnSaveTask();
  }

  @And("user choose due date {string} on new task page")
  public void userChooseDueDateOnNewTaskPage(String date) {
    clickDueDate();
    chooseDate(date);
    clickBtnDateOk();
  }

  @And("user choose time {string} hour {string} minutes {string} on new task page")
  public void userChooseTimeHourMinutesOnNewTaskPage(String hour, String minutes, String time) {
    clickTime();
    inputTime(hour, minutes, time);
    clickBtnDateOk();
  }

  @And("user set repeat option week on new task page")
  public void userSetRepeatOptionWeekOnNewTaskPage() {
    clickBtnDateOk();
  }
}
