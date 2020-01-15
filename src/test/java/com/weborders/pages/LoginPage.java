package com.weborders.pages;

import com.weborders.utilities.ConfigurationReader;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends BasePage {

    @FindBy(id = "ctl00_MainContent_username")
    public WebElement userNameInputElement;

    //shortcut for driver.findElement(By.id("ctl00_MainContent_password"))
    @FindBy(id = "ctl00_MainContent_password")
    public WebElement passwordInputElement;

    public void login(){
        String userName= ConfigurationReader.getProperty("user_name");
        String password = ConfigurationReader.getProperty("password");

        userNameInputElement.sendKeys(userName);
        passwordInputElement.sendKeys(password, Keys.ENTER);
        //Keys.ENTER instead of login click
    }

    public void login(String userName, String password){
        userNameInputElement.sendKeys(userName);
        passwordInputElement.sendKeys(password, Keys.ENTER);
        //Keys.ENTER instead of login click
    }

}
