package com.weborders.step_definitions;

import com.weborders.pages.ViewAllOrdersPage;
import io.cucumber.java.en.Then;
import org.junit.Assert;

import java.util.List;

public class ViewAllOrdersStepDefinitions {
    ViewAllOrdersPage viewAllOrdersPage = new ViewAllOrdersPage();

    @Then("I should be able to see following columns:")
    public void i_should_be_able_to_see_following_columns(List<String> dataTable) {
        System.out.println("Expected: " + dataTable);
        System.out.println("Actual: " + viewAllOrdersPage.getColumnNames());
        Assert.assertEquals(dataTable, viewAllOrdersPage.getColumnNames());
    }
}
