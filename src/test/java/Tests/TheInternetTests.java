package Tests;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import java.time.Duration;
import java.util.List;
import java.util.Set;

public class TheInternetTests {
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
    void addRemoveElements(){
        driver.get("http://the-internet.herokuapp.com/add_remove_elements/");
        WebElement addElementButton = driver.findElement(By.xpath("//button[contains (text(), 'Add Element')]"));
        addElementButton.click();

        WebElement removeElementButton = driver.findElement(By.xpath("(//div/button[@class='added-manually'])[1]"));
        removeElementButton.click();

    }

    @Test
    void basicAuth(){
        driver.get("http://admin:admin@the-internet.herokuapp.com/basic_auth");
        WebElement text = driver.findElement(By.xpath("//p[contains (text(), 'Congratulations!')]"));
        Assert.assertEquals(text.getText(), "Congratulations! You must have the proper credentials.");
    }

    @Test
    void challengingDOM(){
        driver.get("http://the-internet.herokuapp.com/challenging_dom");
        WebElement firstButton = driver.findElement(By.xpath("//div/a[@class='button']"));
        firstButton.click();

        WebElement secondButton = driver.findElement(By.xpath("//div/a[@class='button alert']"));
        secondButton.click();

        WebElement thirdButton = driver.findElement(By.xpath("//div/a[@class='button success']"));
        thirdButton.click();

        List<WebElement> headersNames = driver.findElements(By.xpath("//table/thead//th"));
        int countOfColumns = headersNames.size();

        List<WebElement> cells = driver.findElements(By.xpath("//table/tbody//td"));
        int numberOfCells = cells.size();

        int numberOfRows = countOfColumns / numberOfCells;

        String[][] table = new String[numberOfRows][countOfColumns];
        WebElement[][] tableElements = new WebElement[numberOfCells][countOfColumns];

        for (int i = 0; i < numberOfRows; i++) {
            for (int j = 0; j < countOfColumns; j++) {
                String xPath = String.format("//table/tbody//tr[%s]//td[%s]", i + 1, j + 1);
                table[i][j] = driver.findElement(By.xpath(xPath)).getText();
                tableElements[i][j] = driver.findElement(By.xpath(xPath));
            }
        }
    }

    @Test
    void checkboxes(){
        driver.get("http://the-internet.herokuapp.com/checkboxes");

        WebElement firstCheckbox = driver.findElement(By.xpath("(//form/input[@type='checkbox'])[1]"));
        boolean checkbox1 = firstCheckbox.isSelected();
        firstCheckbox.click();

        WebElement secondCheckbox = driver.findElement(By.xpath("(//form/input[@type='checkbox'])[2]"));
        boolean checkbox2 = secondCheckbox.isSelected();
        secondCheckbox.click();

        Assert.assertEquals(checkbox1, !firstCheckbox.isSelected());
        Assert.assertEquals(checkbox2, !secondCheckbox.isSelected());
    }

    @Test
    void contextText(){
        driver.get("http://the-internet.herokuapp.com/context_menu");
        WebElement hotSpot = driver.findElement(By.id("hot-spot"));
        Actions actions = new Actions(driver);
        actions.contextClick(hotSpot).perform();
    }

    @Test
    void disappearingElements(){
        driver.get("http://the-internet.herokuapp.com/disappearing_elements");
        WebElement homeLink = driver.findElement(By.xpath("//a[contains (text(), 'Home')]"));
        homeLink.click();

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.urlContains("http://the-internet.herokuapp.com/"));

        WebElement disappearingElementsLink = driver.findElement(By.xpath("//a[contains (text(), 'Disappearing Elements')]"));
        disappearingElementsLink.click();

        wait.until(ExpectedConditions.urlContains("http://the-internet.herokuapp.com/disappearing_elements"));

        WebElement aboutLink = driver.findElement(By.xpath("//a[contains (text(), 'About')]"));
        aboutLink.click();

        driver.navigate().back();

        WebElement contactUsLink = driver.findElement(By.xpath("//a[contains (text(), 'Contact Us')]"));
        contactUsLink.click();

        driver.navigate().back();

        WebElement portfolioLink = driver.findElement(By.xpath("//a[contains (text(), 'Portfolio')]"));
        portfolioLink.click();
    }

    @Test
    void dragAndDrop(){
        driver.get("http://the-internet.herokuapp.com/drag_and_drop");

        WebElement dragPiece = driver.findElement(By.id("column-a"));
        WebElement dropPlace = driver.findElement(By.id("column-b"));

        Actions actions = new Actions(driver);
        actions.dragAndDrop(dragPiece, dropPlace).perform();
    }

    @Test
    void dropdown(){
        driver.get("http://the-internet.herokuapp.com/dropdown");
        WebElement dropdownMenu = driver.findElement(By.id("dropdown"));
        dropdownMenu.click();

        WebElement option1 = driver.findElement(By.xpath("//option[contains (text(), 'Option 1')]"));
        option1.click();

        WebElement secondDropdownMenu = driver.findElement(By.id("dropdown"));
        secondDropdownMenu.click();

        WebElement option2 = driver.findElement(By.xpath("//option[contains (text(), 'Option 2')]"));
        option2.click();
    }

    @Test
    void dynamicContent(){
        driver.get("http://the-internet.herokuapp.com/dynamic_content");

        int refreshCount = 3;

        for (int i = 0; i < refreshCount; i++) {
            driver.navigate().refresh();
        }
    }

    @Test
    void dynamicControls(){
        driver.get("http://the-internet.herokuapp.com/dynamic_controls");

        WebElement checkbox = driver.findElement(By.xpath("//div/input[@type='checkbox']"));
        checkbox.click();

        WebElement removeButton = driver.findElement(By.xpath("//form/button[@type='button']"));
        removeButton.click();

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        WebElement addButton = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[contains( text(), 'Add')]")));
        addButton.click();

        WebElement enableButton = driver.findElement(By.xpath("//button[contains( text(), 'Enable')]"));
        enableButton.click();

        WebElement disableButton = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[contains( text(), 'Disable')]")));
        disableButton.click();
    }

    @Test
    void dynamicLoading(){
        driver.get("http://the-internet.herokuapp.com/dynamic_loading");
        WebElement hiddenElementOnPage = driver.findElement(By.xpath("//a[contains (text(), 'Example 1: Element on page that is hidden')]"));
        hiddenElementOnPage.click();

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

        WebElement startButton = driver.findElement(By.xpath("//button[contains (text(), 'Start')]"));
        wait.until(ExpectedConditions.elementToBeClickable(startButton));
        startButton.click();


        WebElement helloWorldText = driver.findElement(By.xpath("//h4[contains (text(), 'Hello World!')]"));
        wait.until(ExpectedConditions.visibilityOf(helloWorldText));

        driver.navigate().back();

        WebElement renderedAfterTheFact = driver.findElement(By.xpath("//a[contains (text(), 'Example 2: Element rendered after the fact')]"));
        renderedAfterTheFact.click();

        WebElement secondStartButton = driver.findElement(By.xpath("//button[contains (text(), 'Start')]"));
        wait.until(ExpectedConditions.elementToBeClickable(secondStartButton));
        secondStartButton.click();
    }

    @Test
    void floatingMenu(){
        driver.get("http://the-internet.herokuapp.com/floating_menu#about");
        WebElement menu = driver.findElement(By.xpath("//*[@id='menu']"));

        WebElement homeLink = driver.findElement(By.xpath("//a[@href='#home']"));
        Assert.assertTrue(homeLink.isDisplayed());

        WebElement newsLink = driver.findElement(By.xpath("//a[@href='#news']"));
        Assert.assertTrue(newsLink.isDisplayed());

        WebElement contactLink = driver.findElement(By.xpath("//a[@href='#contact']"));
        Assert.assertTrue(contactLink.isDisplayed());

        WebElement aboutLink = driver.findElement(By.xpath("//a[@href='#about']"));
        Assert.assertTrue(aboutLink.isDisplayed());

        Actions actions = new Actions(driver);
        actions.moveToElement(menu).perform();
    }

    @Test
    void hovers(){
        driver.get("http://the-internet.herokuapp.com/hovers");

        WebElement firstImage = driver.findElement(By.xpath("(//div[@class='figure']/img)[1]"));
        Actions actions = new Actions(driver);
        actions.moveToElement(firstImage).perform();

        WebElement secondImage = driver.findElement(By.xpath("(//div[@class='figure']/img)[2]"));
        actions.moveToElement(secondImage).perform();

        WebElement thirdImage = driver.findElement(By.xpath("(//div[@class='figure']/img)[3]"));
        actions.moveToElement(thirdImage).perform();
    }

    @Test
    void multipleWindows(){
        driver.get("http://the-internet.herokuapp.com/windows");
        String mainWindowHandle = driver.getWindowHandle();

        WebElement newWindowHandle = driver.findElement(By.linkText("Click Here"));
        newWindowHandle.click();

        Set<String> windowHandles = driver.getWindowHandles();
        for (String handle: windowHandles){
            if (!handle.equals(mainWindowHandle)){
                driver.switchTo().window(handle);
                break;
            }
        }
        driver.switchTo().window(mainWindowHandle);
    }

    @Test
    void redirectLink(){
        driver.get("http://the-internet.herokuapp.com/redirector");

        WebElement redirectLink = driver.findElement(By.id("redirect"));
        redirectLink.click();

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.urlToBe("http://the-internet.herokuapp.com/status_codes"));

        clickLinkAndWaitForUrlChange("status_codes/200");
        clickLinkAndWaitForUrlChange("/status_codes");
        clickLinkAndWaitForUrlChange("status_codes/301");
        clickLinkAndWaitForUrlChange("/status_codes");
        clickLinkAndWaitForUrlChange("status_codes/404");
        clickLinkAndWaitForUrlChange("/status_codes");
        clickLinkAndWaitForUrlChange("status_codes/500");
        clickLinkAndWaitForUrlChange("/status_codes");
    }

    private void clickLinkAndWaitForUrlChange(String linkURL) {
        WebElement link = driver.findElement(By.xpath("//a[@href='" + linkURL + "']"));
        link.click();
    }
}
