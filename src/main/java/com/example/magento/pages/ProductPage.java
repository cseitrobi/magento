package com.example.magento.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ProductPage extends BasePage {
    private By sizeOption = By.id("option-label-size-143-item-169");
    private By colorOption = By.id("option-label-color-93-item-49");
    private By addToCartButton = By.id("product-addtocart-button");

    public ProductPage(WebDriver driver) {
        super(driver);
    }

    public void selectProductOptions() {
        driver.findElement(sizeOption).click();
        driver.findElement(colorOption).click();
    }

    public void addToCart() {
        driver.findElement(addToCartButton).click();
    }
}