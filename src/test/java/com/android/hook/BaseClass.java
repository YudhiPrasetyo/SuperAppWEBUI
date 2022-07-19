package com.android.hook;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;
import org.junit.After;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.net.URL;

public class BaseClass {
  public static AndroidDriver driver;

  public static DesiredCapabilities initDevice() {
    DesiredCapabilities caps = new DesiredCapabilities();
    System.out.println("Setup is Running...");

    caps.setCapability(MobileCapabilityType.PLATFORM_NAME, "Android");
    caps.setCapability(MobileCapabilityType.DEVICE_NAME, "device");
    caps.setCapability(MobileCapabilityType.PLATFORM_VERSION, "7.0");
    caps.setCapability(MobileCapabilityType.UDID, "emulator-5554");
    caps.setCapability(MobileCapabilityType.APP, "/Users/moka/Downloads/To Do List_v4.23_apkpure.com.apk");
    caps.setCapability(MobileCapabilityType.AUTOMATION_NAME, "UiAutomator2");
    caps.setCapability(MobileCapabilityType.NO_RESET, "true");
//    caps.setCapability("appPackage", "com.loginmodule.learning");
//    caps.setCapability("appActivity", "com.loginmodule.learning.activities.LoginActivity");
    return caps;
  }

  public static void openApps() throws Exception {
    String appiumServerURL = "http://127.0.0.1:4723/wd/hub";
    driver = new AndroidDriver(new URL(appiumServerURL), initDevice());
    System.out.println("Apps started...");
  }

  @After
  public static void closeApps() {
    if (driver != null) {
      driver.quit();
    }
    System.out.println("Apps closed...");
  }


}
