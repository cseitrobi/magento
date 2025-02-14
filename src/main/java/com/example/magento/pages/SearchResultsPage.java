package com.example.magento.pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class SearchResultsPage extends BasePage {
    private By productItems = By.cssSelector(".products-grid .product-item");

    public SearchResultsPage(WebDriver driver) {
        super(driver);
    }

    public boolean isProductListDisplayed() {
        List<WebElement> products = driver.findElements(productItems);
        return !products.isEmpty();
    }
}