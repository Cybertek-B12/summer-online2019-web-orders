package com.weborders.pages;


import com.weborders.utilities.Driver;
import org.openqa.selenium.support.PageFactory;

public abstract class BasePage {


    public BasePage(){
        //it's coming from selenium webdriver
        //to enable @FindBy annotation
        PageFactory.initElements(Driver.get(), this);
    }
}


