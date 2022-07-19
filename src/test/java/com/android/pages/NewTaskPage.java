package com.android.pages;

import com.android.hook.BaseClass;
import org.openqa.selenium.By;

import static com.android.locator.NewTaskPageLocator.*;

public class NewTaskPage extends BaseClass {

  public void inputTaskName() {
    String taskName = "yudhi task";
    driver.findElement(INPUT_NEW_TASK).sendKeys(taskName);
  }

  public void clickDueDate() {
    driver.findElement(INPUT_DUE_DATE).click();
  }

  public void chooseDate(String date) {
    driver.findElement(By.xpath(String.format(DATE, date))).click();
  }

  public void clickBtnDateOk() {
    driver.findElement(BUTTON_DATE_OK).click();
  }

  public void clickTime() {
    driver.findElement(INPUT_TIME).click();
  }

  public void inputTime(String hour, String minutes, String time) {
    driver.findElement(By.xpath(String.format(INPUT_HOUR, hour))).click();
    driver.findElement(By.xpath(String.format(INPUT_MINUTES, minutes))).click();
    if (time.equalsIgnoreCase("AM")) {
      driver.findElement(INPUT_TIME_AM).click();
    }
  }

  public void clickRepeatOption() {
    driver.findElement(LIST_REPEAT).click();
  }

  public void chooseRepeatOption() {
    driver.findElement(LIST_REPEAT_VALUE).click();
  }

  public void clickListAddtoList() {
    driver.findElement(LIST_ADD_TO_LIST).click();
  }

  public void choosePersonalAddtoList() {
    driver.findElement(ADD_TO_LIST_PERSONAL).click();
  }

  public void clickBtnSaveTask() {
    driver.findElement(IMAGE_BUTTON_SAVE).click();
  }

}
