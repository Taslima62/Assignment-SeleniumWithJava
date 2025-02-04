package pages;

import org.openqa.selenium.WebDriver;
import tools.DriverFactory;

public class BasePage {
    public WebDriver driver = DriverFactory.getDriver();
}
