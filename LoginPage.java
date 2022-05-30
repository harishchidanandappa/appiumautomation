
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.By;



public class LoginPage {

    private final By usernameTextBox = By.id("com.touchboarder.android.api.demos.loginapplication:id/etUserName");
    private final By passwordTextBox = By.id("com.touchboarder.android.api.demos.loginapplication:id/etPassword");
    private final By loginButton = By.id("com.touchboarder.android.api.demos.loginapplication:id/btnLogin");
    private final By attemptsCounterLabel = By.id("com.touchboarder.android.api.demos.loginapplication:id/tvAttemptsInfo");

    private final AndroidDriver<MobileElement> driver;

    public LoginPage(AndroidDriver<MobileElement> driver) {
        this.driver = driver;
    }

    public void setUsername(String username) {
        driver.findElement(usernameTextBox).sendKeys(username);
    }

    public void setPassword(String password) {
        driver.findElement(passwordTextBox).sendKeys(password);
    }

    public void clickLoginButton() {
        driver.findElement(loginButton).click();
    }

    public void login(String username, String password) {
        setUsername(username);
        setPassword(password);
        clickLoginButton();
    }

    public String getAttemptsCounterLabelText() {
        return driver.findElement(attemptsCounterLabel).getText();
    }
}
