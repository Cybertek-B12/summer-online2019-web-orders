package com.weborders.pages;


import com.weborders.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public abstract class BasePage {

    @FindBy(tagName = "h1")
    private WebElement pageLogo;

    public BasePage() {
        //it's coming from selenium webdriver
        //to enable @FindBy annotation
        PageFactory.initElements(Driver.get(), this);
    }

    public String getPageLogoText() {
        return pageLogo.getText();
    }
}


