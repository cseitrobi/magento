package com.example.magento.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage extends BasePage {
    private By searchBox = By.id("search");

    public HomePage(WebDriver driver) {
        super(driver);
    }

    public void searchProduct(String productName) {
        driver.findElement(searchBox).sendKeys(productName);
        driver.findElement(searchBox).submit();
    }
}