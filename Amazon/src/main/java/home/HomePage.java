package home;

import base.CommonAPI;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;

public class HomePage extends CommonAPI{

    public void searchInputBox(){
        typeByCss("#twotabsearchtextbox1","Book");
    }

}
