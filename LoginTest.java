import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.remote.DesiredCapabilities;

import dev.failsafe.internal.util.Assert;
import io.appium.java_client.android.AndroidDriver;


public class LoginTest<MobileElement>  {

	private final DesiredCapabilities caps = new DesiredCapabilities();
    private AndroidDriver<MobileElement> driver;
    private LoginPage loginPage;

    @BeforeSuite
    public void setupDeviceCapabilities() {
        caps.setCapability("deviceName", "Harish_device");
        caps.setCapability("platformName", "Android");
        caps.setCapability("platformVersion", "11.0.0");
        caps.setCapability("app", new File(System.getProperty("user.dir")
                + "/src/test/resources/test1.apk").getAbsolutePath());
        caps.setCapability("appPackage", "com.touchboarder.android.api.demos.loginapplication");
       caps.setCapability("appActivity", "com.touchboarder.android.api.demos.loginapplication.MainActivity");
        caps.setCapability("noReset", true);
        caps.setCapability("fullReset", false);
    }

    @BeforeMethod
    public void spinUpAndroidDriver() {
        try {
            driver = new AndroidDriver<MobileElement>(new URL("http://127.0.0.1:4723/wd/hub"), caps);
        } catch (MalformedURLException e) {
            e.printStackTrace();
        }
        driver.manage().timeouts().implicitlyWait(10, SECONDS);
        loginPage = new LoginPage(driver);
    }

    @Test(description = "Verify that a user can login to the application with valid credentials")
    public void testValidLogin() {
        loginPage.login("harish", "monday123");
        HomePage homePage = new HomePage(driver);
        Assert.assertEquals(homePage.getGreetingLabelText(), "Hi harish,");
        Assert.assertEquals(homePage.getWelcomeLabelText(), "Welcome!");
    }

    @Test(description = "Verify that a user cannot login to the application with invalid credentials")
    public void testInvalidLogin() {
        loginPage.login("harish", "monday1234");
        Assert.assertEquals(loginPage.getAttemptsCounterLabelText(), "Number of attempts remaining: 4");
    }

    @AfterMethod
    public void stopAndroidDriver() {
        driver.quit();
    }
}


}
