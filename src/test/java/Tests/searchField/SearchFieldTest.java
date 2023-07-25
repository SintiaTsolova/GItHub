package Tests.searchField;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;


public class SearchFieldTest {
    WebDriver driver;

    @AfterMethod
    void cleanAll(){
        driver.quit();
    }

    @BeforeMethod
    void setup(){
        driver = new ChromeDriver();
        driver.manage().window().maximize();
    }
    @Test
    public void testSearchField(){
        SearchFieldPageObjectModelTest searchField = new SearchFieldPageObjectModelTest(driver);

        driver.get("http://training.skillo-bg.com:4300/posts/all");
        searchField.clickLoginLink();
        searchField.enterUserName("panda23");
        searchField.enterPassword("123456789Aa-");
        searchField.clickSignInButton();
        searchField.clickSearchField();
        searchField.enterUsername("Yoda");
        searchField.clickUsernameProfile();
    }
}
