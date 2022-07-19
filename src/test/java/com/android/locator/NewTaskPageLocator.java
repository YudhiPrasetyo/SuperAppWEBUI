package com.android.locator;

import org.openqa.selenium.By;

public interface NewTaskPageLocator {
  By INPUT_NEW_TASK = By.id("edtTaskName");
  By INPUT_DUE_DATE = By.id("edtDueD");
  String DATE = "//android.view.View[@content-desc=\"%s\"]";
  By INPUT_TIME = By.id("edtDueT");
  String INPUT_HOUR = "//android.widget.RadialTimePickerView.RadialPickerTouchHelper[@content-desc=\"%s\"]";
  String INPUT_MINUTES = "//android.widget.RadialTimePickerView.RadialPickerTouchHelper[@content-desc=\"%s\"]";
  By INPUT_TIME_AM = By.id("android:id/am_label");
  By BUTTON_DATE_OK = By.id("android:id/button1");
  By LIST_REPEAT = By.id("spinnerRepeat");
  By LIST_REPEAT_VALUE = By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.ListView/android.widget.TextView[7]");
  By LIST_ADD_TO_LIST = By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.RelativeLayout/android.widget.ScrollView/android.widget.LinearLayout/android.widget.RelativeLayout/android.widget.Spinner/android.widget.TextView");
  By ADD_TO_LIST_PERSONAL = By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.ListView/android.widget.TextView[2]");
  By IMAGE_BUTTON_SAVE = By.id("fabSaveTask");
}
