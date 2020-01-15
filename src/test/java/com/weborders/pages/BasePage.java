package com.weborders.pages;


import com.weborders.utilities.BrowserUtils;
import com.weborders.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public abstract class BasePage {

    @FindBy(tagName = "h1")
    private WebElement pageLogo;

    @FindBy(tagName = "th")
    private List<WebElement> columnNamesElements;

    public BasePage() {
        //it's coming from selenium webdriver
        //to enable @FindBy annotation
        PageFactory.initElements(Driver.get(), this);
    }

    public String getPageLogoText() {
        return pageLogo.getText();
    }

    public void navigateTo(String moduleName) {
        Driver.get().findElement(By.linkText(moduleName)).click();
    }

    public List<String> getColumnNames() {
        return BrowserUtils.getListOfString(columnNamesElements);
    }
}


