package steps;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import pages.CalculatorPage;

import java.net.MalformedURLException;

public class CalculatorSteps extends CalculatorPage {


    @Given("Open desktop Calulator app")
    public void runCalculator() throws MalformedURLException {
        openCalculatorApp();
    }

    @Given("Insert value to input row: (.*)")
    public void insertValue(String value) throws MalformedURLException, InterruptedException {
        if (value.contains("-")) {
            sendNegativeValue(value);
        } else {
            sendPositiveValue(value);
        }
    }

    @Given("Click on action button: (.*)")
    public void clickOnActionButton(ButtonEnum type) throws MalformedURLException, InterruptedException {
        getButtonByType(type).click();
    }

    @Then("Assert that text input ust have value: (.*)")
    public void assertThatTextInputHasValue(String value) {
        Assert.assertEquals(getTextResult().getText(), value, "Incorrect result for text input");
    }

    private void sendNegativeValue(String negativeValue) {
        Actions actions = new Actions(driver);
        actions.sendKeys(negativeValue.replace("-", "")).perform();
        getNegateButton().click();
    }
}


