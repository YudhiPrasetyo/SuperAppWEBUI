package com.android.pages;

import com.android.hook.BaseClass;

import java.util.concurrent.TimeUnit;

import static com.android.locator.HomePageLocator.*;

public class HomePage extends BaseClass {

  public boolean isToolBarAllListDisplay() throws InterruptedException {
    try {
      driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
      return driver.findElement(TOOL_BAR_ALL_LIST).isDisplayed();
    } catch (Exception e) {
      return false;
    }
  }

  public void clickIconNewTask() {
    driver.findElement(IMAGE_ADD_NEW_TASK).click();
    driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
  }

  public String getTaskName() {
    return driver.findElement(TITLE_TASK_NAME).getText();
  }
}
