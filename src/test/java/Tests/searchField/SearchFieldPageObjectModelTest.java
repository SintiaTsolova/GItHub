package Tests.searchField;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import java.time.Duration;

public class SearchFieldPageObjectModelTest {
    private final WebDriver driver;
    private final WebDriverWait wait;
    @FindBy(id = "nav-link-login")
    private WebElement loginLink;
    @FindBy(id = "defaultLoginFormUsername")
    private WebElement username;
    @FindBy(id = "defaultLoginFormPassword")
    private WebElement passwordInput;
    @FindBy(id = "sign-in-button")
    private WebElement signInButton;
    @FindBy(id = "search-bar")
    private WebElement searchButton;
    @FindBy(xpath = "//a[contains(text(), 'Yoda')]")
    private WebElement userNameInput;
    @FindBy(xpath = "//a[contains(text(), 'Yoda')]")
    private WebElement clickUsername;

    public SearchFieldPageObjectModelTest(WebDriver driver){
        this.driver = driver;
        this.wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        PageFactory.initElements(driver, this);
    }

    public void clickLoginLink(){
        wait.until(ExpectedConditions.elementToBeClickable(loginLink));
        loginLink.click();
    }

    public void enterUserName(String personsUsername){
        wait.until(ExpectedConditions.urlToBe("http://training.skillo-bg.com:4300/users/login"));
        username.sendKeys(personsUsername);
    }
    public void enterPassword(String password){
        passwordInput.sendKeys(password);
    }
    public void clickSignInButton(){
        Assert.assertTrue(signInButton.isEnabled());
        signInButton.click();
    }
    public void clickSearchField(){
        wait.until(ExpectedConditions.urlToBe("http://training.skillo-bg.com:4300/posts/all"));
        wait.until(ExpectedConditions.elementToBeClickable(searchButton));
        searchButton.click();
    }
    public void enterUsername(String userName){
        userNameInput.sendKeys(userName);
        wait.until(ExpectedConditions.visibilityOf(userNameInput));
    }
    public void clickUsernameProfile(){
        wait.until(ExpectedConditions.visibilityOf(clickUsername));
        clickUsername.click();
    }
}
