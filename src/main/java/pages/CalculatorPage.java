package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class CalculatorPage extends CalculatorXpath {


    public static void openCalculatorApp() {
        driver.get("Calculator");
    }

    public static void sendPositiveValue(String value) {
        Actions actions = new Actions(driver);
        actions.sendKeys(value).perform();
    }

    public static WebElement getButtonByType(ButtonEnum type) {
        WebElement button;
        switch (type) {
            case PLUS:
                button = driver.findElementByXPath(PLUS_BUtTON);
                break;
            case DIVIDE:
                button = driver.findElementByXPath(DEVIDE_BUTTON);
                break;
            case MINUS:
                button = driver.findElementByXPath(SUBSTRACT_BUTTON);
                break;
            case EQUALS:
                button = driver.findElementByXPath(EQUALS_BUTTON);
                break;
            case MULTIPLY:
                button = driver.findElementByXPath(MULTIPLY_BUTTON);
                break;
            default:
                button = null;
                break;
        }
        return button;
    }

    public static WebElement getTextResult() {
        return driver.findElementByXPath(TEXT_RESULT);
    }

    public static WebElement getNegateButton() {
        return driver.findElementByXPath(NEGATE_BUTTON);
    }

    public enum ButtonEnum {
        PLUS, MINUS, MULTIPLY, DIVIDE, EQUALS
    }


}
