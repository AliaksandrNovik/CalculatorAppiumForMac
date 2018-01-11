package pages;

import driver.Driver;

public class CalculatorXpath  extends Driver {

    protected static String WINDOW_PATH = "/AXApplication[@AXTitle='Calculator']/AXWindow[0]";

    public static String RESULT_GROUP_PATH = WINDOW_PATH + "/AXGroup[0]";

    public static String BASIC_GROUP_PATH = WINDOW_PATH + "/AXGroup[1]";

    public static String CLEAR_BUTTON = BASIC_GROUP_PATH + "/AXButton[@AXDescription='clear']";

    public static String EQUALS_BUTTON = BASIC_GROUP_PATH + "/AXButton[@AXDescription='equals']";

    public static String PLUS_BUtTON = BASIC_GROUP_PATH + "/AXButton[@AXDescription='add']";

    public static String SUBSTRACT_BUTTON = BASIC_GROUP_PATH + "/AXButton[@AXDescription='subtract']";

    public static String MULTIPLY_BUTTON = BASIC_GROUP_PATH + "/AXButton[@AXDescription='multiply']";

    public static String NEGATE_BUTTON = BASIC_GROUP_PATH + "/AXButton[@AXDescription='negate']";

    public static String DEVIDE_BUTTON = "/AXApplication[@AXTitle='Calculator']/AXWindow[@AXIdentifier='_NS:477' and @AXSubrole='AXStandardWindow']/AXGroup[@AXIdentifier='_NS:444']/AXButton[@AXIdentifier='_NS:505']";

    public static String TEXT_RESULT = RESULT_GROUP_PATH + "/AXStaticText[@AXDescription='main display']";

}
