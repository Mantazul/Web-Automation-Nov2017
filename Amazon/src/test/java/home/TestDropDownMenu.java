package home;

import org.testng.Assert;
import org.testng.annotations.Test;
import reporting.TestLogger;

import java.util.ArrayList;
import java.util.List;

public class TestDropDownMenu extends DropDownMenu {

    @Test
    public void menus(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        List<String> expectedMenu = getMenus();
        List<String> listOfMenu = getMenus();
        Assert.assertEquals(listOfMenu, "text");
    }
}
